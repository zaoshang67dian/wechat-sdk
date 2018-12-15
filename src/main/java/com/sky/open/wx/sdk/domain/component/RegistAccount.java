package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 第三方注册的账号信息
 * @author shipj@ctrip.com
 * @date 2018/5/21 15:05
 */
public class RegistAccount extends WechatObject {

    private static final long serialVersionUID = -5621087648331159431L;
    /**
     * 账号的appid
     */
    @JSONField(name = "appid")
    private String appid;

    /**
     * 接口调用凭据刷新令牌
     */
    @JSONField(name = "authorizer_refresh_token")
    private String authorizerRefreshToken;

    public RegistAccount() {
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAuthorizerRefreshToken() {
        return authorizerRefreshToken;
    }

    public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
        this.authorizerRefreshToken = authorizerRefreshToken;
    }

    @Override
    public String toString() {
        return "RegistAccount{" +
                "appid='" + appid + '\'' +
                ", authorizerRefreshToken='" + authorizerRefreshToken + '\'' +
                '}';
    }
}
