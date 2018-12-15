package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.appconf.HeadImageInfo;
import com.sky.open.wx.sdk.domain.appconf.SignatureInfo;
import com.sky.open.wx.sdk.domain.appconf.WxVerifyInfo;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 获取小程序帐号基本信息
 * @date 2018/4/12 18:17
 */
public class GetAppBasicInfoResponse extends WechatResponse {

    private static final long serialVersionUID = -543243050326960999L;
    /**
     * 帐号appid
     */
    @JSONField(name = "appid")
    private String appid;
    /**
     * 帐号类型（1：订阅号，2：服务号，3：小程序）
     */
    @JSONField(name = "account_type")
    private Integer accountType;
    /**
     * 主体类型（1：企业）
     */
    @JSONField(name = "principal_type")
    private Integer principalType;
    /**
     * 主体名称
     */
    @JSONField(name = "principal_name")
    private String principalName;
    /**
     * 实名验证状态:
     *  1：实名验证成功，
     *  2：实名验证中，
     *  3：实名验证失败
     */
    @JSONField(name = "realname_status")
    private Integer realnameStatus;
    /**
     * 微信认证信息
     */
    @JSONField(name = "wx_verify_info")
    private WxVerifyInfo wxVerifyInfo;
    /**
     * 功能介绍信息
     */
    @JSONField(name = "signature_info")
    private SignatureInfo signatureInfo;
    /**
     * 头像信息
     */
    @JSONField(name = "head_image_info")
    private HeadImageInfo headImageInfo;

    public GetAppBasicInfoResponse() {
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(Integer principalType) {
        this.principalType = principalType;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public Integer getRealnameStatus() {
        return realnameStatus;
    }

    public void setRealnameStatus(Integer realnameStatus) {
        this.realnameStatus = realnameStatus;
    }

    public WxVerifyInfo getWxVerifyInfo() {
        return wxVerifyInfo;
    }

    public void setWxVerifyInfo(WxVerifyInfo wxVerifyInfo) {
        this.wxVerifyInfo = wxVerifyInfo;
    }

    public SignatureInfo getSignatureInfo() {
        return signatureInfo;
    }

    public void setSignatureInfo(SignatureInfo signatureInfo) {
        this.signatureInfo = signatureInfo;
    }

    public HeadImageInfo getHeadImageInfo() {
        return headImageInfo;
    }

    public void setHeadImageInfo(HeadImageInfo headImageInfo) {
        this.headImageInfo = headImageInfo;
    }

    @Override
    public String toString() {
        return "GetAppBasicInfoResponse{" +
                "appid='" + appid + '\'' +
                ", accountType=" + accountType +
                ", principalType=" + principalType +
                ", principalName='" + principalName + '\'' +
                ", realnameStatus=" + realnameStatus +
                ", wxVerifyInfo=" + wxVerifyInfo +
                ", signatureInfo=" + signatureInfo +
                ", headImageInfo=" + headImageInfo +
                '}';
    }
}
