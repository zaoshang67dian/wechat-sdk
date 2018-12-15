package com.sky.open.wx.sdk.response.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 使用微信认证的方式注册微信小程序账号
 * @date 2018/5/21 14:47
 */
public class RegisterAccountResponse extends WechatResponse {

    private static final long serialVersionUID = 2111843799117382901L;
    /**
     * 注册的小程序appid
     */
    @JSONField(name = "appid")
    private String appid;

    /**
     * 应用的授权码，第三方代创建的应用默认授权给第三方
     */
    @JSONField(name = "authorization_code")
    private String authorizationCode;

    public RegisterAccountResponse() {
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

    @Override
    public String toString() {
        return "RegisterAccountResponse{" +
                "appid='" + appid + '\'' +
                ", authorizationCode='" + authorizationCode + '\'' +
                '}';
    }
}
