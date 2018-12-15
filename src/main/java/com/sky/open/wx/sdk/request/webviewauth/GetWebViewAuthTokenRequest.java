package com.sky.open.wx.sdk.request.webviewauth;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.webviewauth.GetWebViewAuthTokenResponse;

import java.util.Map;

/**
 * 这里通过code换取的是一个特殊的网页授权access_token,
 * 与基础支持中的access_token（该access_token用于调用其他接口）不同。
 * <p>
 * 如果网页授权的作用域为snsapi_base，则本步骤中获取到网页授权access_token的同时，也获取到了openid，
 * snsapi_base式的网页授权流程即到此为止。
 *
 * @author shipj
 * @create 2018-01-30-16:11
 */

public class GetWebViewAuthTokenRequest extends WechatRequest<GetWebViewAuthTokenResponse> {

    /**
     * 公众号的唯一标识
     */
    @JSONField(name = "appid")
    private String appId;

    /**
     * 公众号的appsecret
     */
    @JSONField(name = "secret")
    private String secret;

    /**
     * 填写用户授权的code
     */
    @JSONField(name = "code")
    private String code;


    public GetWebViewAuthTokenRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.WEB_VIEW_AUTH_TOKEN;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public Map<String, String> getUrlParams() {
        Map<String, String> urlParams = super.getUrlParams();
        urlParams.put("appid", appId);
        urlParams.put("secret", secret);
        urlParams.put("code", code);

        return urlParams;
    }

    @Override
    public String getPostBody() throws WechatApiException {
        return null;
    }

    @Override
    public Class<GetWebViewAuthTokenResponse> getResponseClass() {
        return GetWebViewAuthTokenResponse.class;
    }
}
