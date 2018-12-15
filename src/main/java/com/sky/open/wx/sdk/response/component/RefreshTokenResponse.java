package com.sky.open.wx.sdk.response.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 第三方刷新授权账号的token
 *
 * @author shipj
 * @create 2017-12-12-13:22
 */

public class RefreshTokenResponse extends WechatResponse {
    private static final long serialVersionUID = -1189289265362215959L;

    /**
     * 授权方令牌
     */
    @JSONField(name = "authorizer_access_token")
    private String authorizerAccessToken;
    /**
     * 刷新令牌
     */
    @JSONField(name = "authorizer_refresh_token")
    private String authorizerRefreshToken;
    /**
     * 有效期，为2小时
     */
    @JSONField(name = "expires_in")
    private Integer expiresIn;

    public RefreshTokenResponse() {
    }

    public String getAuthorizerAccessToken() {
        return authorizerAccessToken;
    }

    public void setAuthorizerAccessToken(String authorizerAccessToken) {
        this.authorizerAccessToken = authorizerAccessToken;
    }

    public String getAuthorizerRefreshToken() {
        return authorizerRefreshToken;
    }

    public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
        this.authorizerRefreshToken = authorizerRefreshToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "RefreshTokenResponse{" +
                "authorizerAccessToken='" + authorizerAccessToken + '\'' +
                ", authorizerRefreshToken='" + authorizerRefreshToken + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }
}
