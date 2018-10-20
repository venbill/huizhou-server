package com.superstar.service.buy.impl;

import com.superstar.config.Constants;
import com.superstar.dao.buy.DeliveryAddressMapper;
import com.superstar.dao.system.SysAreaMapper;
import com.superstar.model.buy.DeliveryAddress;
import com.superstar.model.buy.DeliveryAddressExample;
import com.superstar.model.common.RtData;
import com.superstar.model.system.SysArea;
import com.superstar.security.SecurityUtils;
import com.superstar.service.buy.DeliveryAddressService;
import com.superstar.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午9:03 2018/10/18.
 */
@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @Autowired
    private SysAreaMapper sysAreaMapper;
    @Override
    public List<DeliveryAddress> getUserDeliveryAddress(long userId) {
        DeliveryAddressExample addressExample = new DeliveryAddressExample();
        addressExample.setOrderByClause("is_default desc,create_time desc");
        addressExample.createCriteria().andUserIdEqualTo(userId);
        return deliveryAddressMapper.selectByExample(addressExample);
    }


    @Override
    public RtData insertDeliveryAddress(DeliveryAddress deliveryAddress) {
        deliveryAddress.setUserId(SecurityUtils.getCurrentUserId());
        if(deliveryAddress.getCounty()>0){
           SysArea sysArea = sysAreaMapper.selectByPrimaryKey(deliveryAddress.getCounty());
           if(sysArea.getType()!=3){
               return ResponseBuilder.fail("地址选择不正确");
           }
           deliveryAddress.setProvince(sysArea.getProvinceId());
           deliveryAddress.setProvinceName(sysArea.getProvinceName());
           deliveryAddress.setCity(sysArea.getCityId());
           deliveryAddress.setCityName(sysArea.getCityName());
           deliveryAddress.setCountyName(sysArea.getCountyName());
        }
        //校验收件人
        if(StringUtils.isEmpty(deliveryAddress.getAcceptName())){
            return ResponseBuilder.fail("收件人不能为空");
        }
        if(deliveryAddress.getAcceptName().length()>20){
            return ResponseBuilder.fail("收件人姓名必须在1-20位");
        }

        //校验收件电话
        if(StringUtils.isEmpty(deliveryAddress.getAcceptPhone())){
            return ResponseBuilder.fail("手机号不能为空");
        }

        if(!Pattern.matches(Constants.PHONE_REGEX, deliveryAddress.getAcceptPhone())){
            return ResponseBuilder.fail("手机号格式不正确");
        }

        deliveryAddress.setCreateTime(new Date());
        if(deliveryAddressMapper.insertSelective(deliveryAddress)>0){
            return ResponseBuilder.success();
        }else{
            return ResponseBuilder.fail("添加失败，请重试");
        }


    }

    @Override
    public RtData deleteDeliveryAddress(long deliveryAddressId, long userId) {
        DeliveryAddress deliveryAddress = deliveryAddressMapper.selectByPrimaryKey(deliveryAddressId);
        if(deliveryAddress==null){
            return ResponseBuilder.fail("收货地址不存在");
        }
        DeliveryAddressExample deliveryAddressExample = new DeliveryAddressExample();
        deliveryAddressExample.createCriteria().andIdEqualTo(deliveryAddressId).andUserIdEqualTo(userId);
        if(deliveryAddressMapper.deleteByExample(deliveryAddressExample)>0){
            return ResponseBuilder.success();
        }else{
            return ResponseBuilder.fail("删除失败，请重试");
        }

    }

    @Override
    public RtData updateDeliveryAddress(DeliveryAddress deliveryAddress) {
        deliveryAddress.setUserId(SecurityUtils.getCurrentUserId());
        if(deliveryAddress.getCounty()>0){
            SysArea sysArea = sysAreaMapper.selectByPrimaryKey(deliveryAddress.getCounty());
            if(sysArea.getType()!=3){
                return ResponseBuilder.fail("地址选择不正确");
            }
            deliveryAddress.setProvince(sysArea.getProvinceId());
            deliveryAddress.setProvinceName(sysArea.getProvinceName());
            deliveryAddress.setCity(sysArea.getCityId());
            deliveryAddress.setCountyName(sysArea.getCountyName());
        }
        //校验收件人
        if(StringUtils.isEmpty(deliveryAddress.getAcceptName())){
            return ResponseBuilder.fail("收件人不能为空");
        }
        if(deliveryAddress.getAcceptName().length()>20){
            return ResponseBuilder.fail("收件人姓名必须在1-20位");
        }

        //校验收件电话
        if(StringUtils.isEmpty(deliveryAddress.getAcceptPhone())){
            return ResponseBuilder.fail("手机号不能为空");
        }

        if(!Pattern.matches(Constants.PHONE_REGEX, deliveryAddress.getAcceptPhone())){
            return ResponseBuilder.fail("手机号格式不正确");
        }
        if(deliveryAddressMapper.updateByPrimaryKeySelective(deliveryAddress)>0){
            return ResponseBuilder.success();
        }else{
            return ResponseBuilder.fail("修改失败，请重试");
        }



    }


    @Override
    public DeliveryAddress getDeliveryAddressById(long id) {
        return deliveryAddressMapper.selectByPrimaryKey(id);

    }


    @Override
    public RtData setDefaultDeliveryAddress(long userId, long deliveryAddressId) {

        DeliveryAddress userAddress = deliveryAddressMapper.selectByPrimaryKey(deliveryAddressId);
        if(userAddress==null||userAddress.getUserId()!=userId){
            return ResponseBuilder.fail("无效收货地址");
        }
        DeliveryAddressExample deliveryAddressExample= new DeliveryAddressExample();
        deliveryAddressExample.createCriteria().andUserIdEqualTo(userId);
        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setIsDefault(false);
        deliveryAddressMapper.updateByExampleSelective(deliveryAddress,deliveryAddressExample);
        DeliveryAddress address = new DeliveryAddress();
        address.setId(deliveryAddressId);
        address.setIsDefault(true);
        deliveryAddressMapper.updateByPrimaryKeySelective(address);
        return ResponseBuilder.success();
    }
}
