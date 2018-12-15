package com.sky.open.wx.sdk.response.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 获取第三方预授权码响应
 *
 * @author shipj
 * @create 2017-12-11-21:11
 */

public class GetPreAuthCodeResponse extends WechatResponse {
    private static final long serialVersionUID = 4741467754254452795L;

    /**
     * 预授权码
     */
    @JSONField(name = "pre_auth_code")
    private String preAuthCode;
    /**
     * 有效期，为10分钟
     */
    @JSONField(name = "expires_in")
    private Integer expiresIn;

    public GetPreAuthCodeResponse() {
    }

    public String getPreAuthCode() {
        return preAuthCode;
    }

    public void setPreAuthCode(String preAuthCode) {
        this.preAuthCode = preAuthCode;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "GetPreAuthCodeResponse{" +
                "preAuthCode='" + preAuthCode + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }
}
