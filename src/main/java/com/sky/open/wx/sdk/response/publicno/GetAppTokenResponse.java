package com.sky.open.wx.sdk.response.publicno;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 获取指定独立应用的token
 */
public class GetAppTokenResponse extends WechatResponse {

    private static final long serialVersionUID = -2606449554669426883L;
    /**
     * 公众号api调用令牌
     */
    @JSONField(name = "access_token")
    private String accessToken;

    /**
     * token有效时间
     */
    @JSONField(name = "expires_in")
    private String expiresIn;

    public GetAppTokenResponse() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "GetAppTokenResponse{" +
                "accessToken='" + accessToken + '\'' +
                ", expiresIn='" + expiresIn + '\'' +
                '}';
    }
}
