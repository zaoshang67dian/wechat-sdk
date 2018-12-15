package com.sky.open.wx.sdk.response.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 获取第三方应用接口调用凭证
 *
 * @author shipj
 * @create 2017-12-11-20:53
 */

public class GetComponentTokenResponse extends WechatResponse {
    private static final long serialVersionUID = 1784425574551100285L;

    /**
     * 第三方平台access_token
     */
    @JSONField(name = "component_access_token")
    private String componentAccessToken;
    /**
     * 有效期
     */
    @JSONField(name = "expires_in")
    private Integer expiresIn;

    public GetComponentTokenResponse() {
    }

    public String getComponentAccessToken() {
        return componentAccessToken;
    }

    public void setComponentAccessToken(String componentAccessToken) {
        this.componentAccessToken = componentAccessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "GetComponentTokenResponse{" +
                "componentAccessToken='" + componentAccessToken + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }
}
