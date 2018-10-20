package com.superstar.service.system.impl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.superstar.config.Constants;
import com.superstar.model.common.RtData;
import com.superstar.service.system.ShortMsgService;
import com.superstar.util.GsonUtil;
import com.superstar.util.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午8:58 2018/10/16.
 */
@Service
public class ShortMsgServiceImpl implements ShortMsgService {

    private final Logger log = LoggerFactory.getLogger(ShortMsgServiceImpl.class);
    @Autowired
    private RedisTemplate redisTemplate;

    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = Constants.ALIYUN_AccessKeyID;
    static final String accessKeySecret = Constants.ALIYUN_AccessKeySecret;



    public String getRandomCode(){
        String str= "1234567890qwertyuiopasdfghjklzxcvbnm";

        Random rnd = new Random();

        StringBuffer code = new StringBuffer();
        for(int i=0;i<4;i++ ){
            int index = rnd.nextInt(36) ;
            code.append(str.substring(index,index+1));
        }
        return code.toString();

    }

    @Override
    public RtData sendCodeMsg(String phone){

        //校验电话格式
        if(StringUtils.isEmpty(phone)){
            return ResponseBuilder.fail("手机号不能为空");
        }

        if(!Pattern.matches(Constants.PHONE_REGEX, phone)){
            return ResponseBuilder.fail("手机号格式不正确");
        }

        String noKey = Constants.MSG_NO_PREFIX.toString()+phone;
        String codeKey = Constants.MSG_CODE_PREFIX.toString()+phone;

        //查看redis中次号码发送验证码次数
        Object noObj = redisTemplate.opsForValue().get(noKey);
        Integer msgNo = noObj==null?0:(int)noObj;

        if(msgNo!=0&&msgNo>Constants.MSG_DAY_MAX_NO){
            return ResponseBuilder.fail("验证码请求太过频繁，请1小时后重试");
        }


        String code = getRandomCode();

        //发送验证码
        try{

            System.out.println(GsonUtil.toJson(sendSms(phone,code)));
        }catch (ClientException e){
            log.error(e.getMessage());
            return ResponseBuilder.fail("验证码发送失败请重试");
        }

        //redis记录

        redisTemplate.opsForValue().set(codeKey, code, Constants.MSG_ACTIVE, TimeUnit.SECONDS);

        if(msgNo==0){
            redisTemplate.opsForValue().set(noKey,0,Constants.MSG_ACTIVE, TimeUnit.SECONDS);
        }

        redisTemplate.opsForValue().increment(noKey,1);
        return ResponseBuilder.success("短信发送成功请注意查收");


    }




    public static SendSmsResponse sendSms(String phone,String code) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phone);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("超新星网络科技");
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode("SMS_148075491");
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.setTemplateParam("{\"code\":\""+code+"\"}");

        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
//        request.setOutId("kklhhkkk");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

        return sendSmsResponse;
    }


    public static QuerySendDetailsResponse querySendDetails(String bizId,String phone) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象
        QuerySendDetailsRequest request = new QuerySendDetailsRequest();
        //必填-号码
        request.setPhoneNumber(phone);
        //可选-流水号
        request.setBizId(bizId);
        //必填-发送日期 支持30天内记录查询，格式yyyyMMdd
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        request.setSendDate(ft.format(new Date()));
        //必填-页大小
        request.setPageSize(10L);
        //必填-当前页码从1开始计数
        request.setCurrentPage(1L);

        //hint 此处可能会抛出异常，注意catch
        QuerySendDetailsResponse querySendDetailsResponse = acsClient.getAcsResponse(request);

        return querySendDetailsResponse;
    }
//
//    public static void main(String[] args) throws ClientException, InterruptedException {
//
//        String phone = "15856687612";
//        String code = "adf3113n12";
//
//        //发短信
//        SendSmsResponse response = sendSms(phone,code);
//        System.out.println("短信接口返回的数据----------------");
//        System.out.println("Code=" + response.getCode());
//        System.out.println("Message=" + response.getMessage());
//        System.out.println("RequestId=" + response.getRequestId());
//        System.out.println("BizId=" + response.getBizId());
//
//        Thread.sleep(3000L);
//
//        //查明细
//        if(response.getCode() != null && response.getCode().equals("OK")) {
//            QuerySendDetailsResponse querySendDetailsResponse = querySendDetails(response.getBizId(),phone);
//            System.out.println("短信明细查询接口返回数据----------------");
//            System.out.println("Code=" + querySendDetailsResponse.getCode());
//            System.out.println("Message=" + querySendDetailsResponse.getMessage());
//            int i = 0;
//            for(QuerySendDetailsResponse.SmsSendDetailDTO smsSendDetailDTO : querySendDetailsResponse.getSmsSendDetailDTOs())
//            {
//                System.out.println("SmsSendDetailDTO["+i+"]:");
//                System.out.println("Content=" + smsSendDetailDTO.getContent());
//                System.out.println("ErrCode=" + smsSendDetailDTO.getErrCode());
//                System.out.println("OutId=" + smsSendDetailDTO.getOutId());
//                System.out.println("PhoneNum=" + smsSendDetailDTO.getPhoneNum());
//                System.out.println("ReceiveDate=" + smsSendDetailDTO.getReceiveDate());
//                System.out.println("SendDate=" + smsSendDetailDTO.getSendDate());
//                System.out.println("SendStatus=" + smsSendDetailDTO.getSendStatus());
//                System.out.println("Template=" + smsSendDetailDTO.getTemplateCode());
//            }
//            System.out.println("TotalCount=" + querySendDetailsResponse.getTotalCount());
//            System.out.println("RequestId=" + querySendDetailsResponse.getRequestId());
//        }
//
//    }

}
