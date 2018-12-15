package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 授权公众号信息
 *
 * @author shipj
 * @create 2017-12-12-13:57
 */

public class AuthorizerInfoDto extends WechatObject {

    private static final long serialVersionUID = -6398522366009357442L;
    /**
     * 授权方昵称
     */
    @JSONField(name = "nick_name")
    private String nickName;
    /**
     * 授权方头像
     */
    @JSONField(name = "head_img")
    private String headImg;
    /**
     * 授权方公众号(小程序)的原始ID
     */
    @JSONField(name = "user_name")
    private String userName;
    /**
     * 授权方公众号类型:0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
     */
    @JSONField(name = "service_type_info")
    private ServiceTypeInfoDto serviceTypeInfoDto;
    /**
     * /授权方认证类型
     * -1代表未认证，
     * 0代表微信认证，
     * 1代表新浪微博认证，
     * 2代表腾讯微博认证，
     * 3代表已资质认证通过但还未通过名称认证，
     * 4代表已资质认证通过、还未通过名称认证，但通过了新浪微博认证，
     * 5代表已资质认证通过、还未通过名称认证，但通过了腾讯微博认证
     */
    @JSONField(name = "verify_type_info")
    private VerifyTypeInfoDto verifyTypeInfoDto;
    /**
     * 公众号的主体名称
     */
    @JSONField(name = "principal_name")
    private String principalName;
    /**
     * 用以了解以下功能的开通状况
     */
    @JSONField(name = "business_info")
    private BusinessInfoDto businessInfoDto;
    /**
     * 授权方公众号所设置的微信号，可能为空
     */
    @JSONField(name = "alias")
    private String alias;
    /**
     * 二维码图片的URL，开发者最好自行也进行保存
     */
    @JSONField(name = "qrcode_url")
    private String qrcodeUrl;
    /**
     * 帐号介绍
     */
    @JSONField(name = "signature")
    private String signature;
    /**
     * 可根据这个字段判断是否为小程序类型授权，专用于获取小程序类型的应用
     */
    @JSONField(name = "MiniProgramInfo")
    private MiniProgramInfoDto miniProgramInfoDto;

    public AuthorizerInfoDto() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ServiceTypeInfoDto getServiceTypeInfoDto() {
        return serviceTypeInfoDto;
    }

    public void setServiceTypeInfoDto(ServiceTypeInfoDto serviceTypeInfoDto) {
        this.serviceTypeInfoDto = serviceTypeInfoDto;
    }

    public VerifyTypeInfoDto getVerifyTypeInfoDto() {
        return verifyTypeInfoDto;
    }

    public void setVerifyTypeInfoDto(VerifyTypeInfoDto verifyTypeInfoDto) {
        this.verifyTypeInfoDto = verifyTypeInfoDto;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public BusinessInfoDto getBusinessInfoDto() {
        return businessInfoDto;
    }

    public void setBusinessInfoDto(BusinessInfoDto businessInfoDto) {
        this.businessInfoDto = businessInfoDto;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public MiniProgramInfoDto getMiniProgramInfoDto() {
        return miniProgramInfoDto;
    }

    public void setMiniProgramInfoDto(MiniProgramInfoDto miniProgramInfoDto) {
        this.miniProgramInfoDto = miniProgramInfoDto;
    }

    @Override
    public String toString() {
        return "AuthorizerInfoDto{" +
                "nickName='" + nickName + '\'' +
                ", headImg='" + headImg + '\'' +
                ", userName='" + userName + '\'' +
                ", serviceTypeInfoDto=" + serviceTypeInfoDto +
                ", verifyTypeInfoDto=" + verifyTypeInfoDto +
                ", principalName='" + principalName + '\'' +
                ", businessInfoDto=" + businessInfoDto +
                ", alias='" + alias + '\'' +
                ", qrcodeUrl='" + qrcodeUrl + '\'' +
                ", signature='" + signature + '\'' +
                ", miniProgramInfoDto=" + miniProgramInfoDto +
                '}';
    }
}
