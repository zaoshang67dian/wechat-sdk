package com.sky.open.wx.sdk.response.registe;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 复用公众号认证资料注册小程序接口
 * @date 2018/4/12 15:50
 */
public class FastRegisteByPubResponse extends WechatResponse {

    private static final long serialVersionUID = -5315293111198422189L;
    /**
     * 新创建小程序的appid
     */
    @JSONField(name = "appid")
    private String appid;
    /**
     * 新创建小程序的授权码
     */
    @JSONField(name = "authorization_code")
    private String authorizationCode;
    /**
     * 复用公众号微信认证小程序是否成功
     */
    @JSONField(name = "is_wx_verify_succ")
    private Boolean isWxVerifySucc;
    /**
     * 小程序是否和公众号关联成功
     */
    @JSONField(name = "is_link_succ")
    private Boolean isLinkSucc;

    public FastRegisteByPubResponse() {
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public Boolean getWxVerifySucc() {
        return isWxVerifySucc;
    }

    public void setWxVerifySucc(Boolean wxVerifySucc) {
        isWxVerifySucc = wxVerifySucc;
    }

    public Boolean getLinkSucc() {
        return isLinkSucc;
    }

    public void setLinkSucc(Boolean linkSucc) {
        isLinkSucc = linkSucc;
    }

    @Override
    public String toString() {
        return "FastRegisteByPubResponse{" +
                "appid='" + appid + '\'' +
                ", authorizationCode='" + authorizationCode + '\'' +
                ", isWxVerifySucc=" + isWxVerifySucc +
                ", isLinkSucc=" + isLinkSucc +
                '}';
    }
}
