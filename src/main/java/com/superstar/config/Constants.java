package com.superstar.config;

/**
 * @Author: BillYu
 * @Description: 常量
 * @Date: Created in 下午3:56 2018/4/28.
 */
public final class Constants {
    /**
     * 请求头认证key
     */
    public final static String HEADER_AUTH = "Authorization";

    /**
     * 平台中文名
     */
    public final static String PLATFORM_NAME_CN = "徽州区电子商务公共服务中心";

    /**
     * 平台英文名
     */
    public final static String PLATFORM_NAME_EN = "Huizhou district electronic commerce public service center";


    /**
     * 系统管理员
     */
    public final static String SYSTEM_ACCOUNT = "ROLE_ADMIN";


    /**
     * 不知名用户
     */
    public final static String NO_ROLE = "ROLE_NOBODY";








    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";


    /**
     * 阿里云短信
     */
    public static final String ALIYUN_AccessKeyID = "LTAIzXk0jncWuMCe";

    /**
     * 阿里云
     */
    public static final String ALIYUN_AccessKeySecret="LxoNTeF90F0j8OiCfsaqChpFExEht8";


    /**
     * redis存储结构
     *
     */

    /**
     * msg no prefix
     */
    public static final String MSG_NO_PREFIX = "msg_no_";


    /**
     * msg code prefix
     */

    public static final  String MSG_CODE_PREFIX = "msg_code_";

    /**
     * msg code prefix
     */

    public static final  Integer MSG_DAY_MAX_NO =5;


    /**
     * 验证码有效期
     */
    public static final Long MSG_ACTIVE=3600L;


    /**
     * 手机号正则
     */
    public static final String PHONE_REGEX="^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";


    /**
     * 默认头像
     */
    public static final String PICTURE="http://img3.duitang.com/uploads/item/201504/16/20150416H4223_mQCGe.jpeg";




}
