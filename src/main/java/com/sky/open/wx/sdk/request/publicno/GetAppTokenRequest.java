package com.sky.open.wx.sdk.request.publicno;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.publicno.GetAppTokenResponse;

import java.util.Map;

public class GetAppTokenRequest extends WechatRequest<GetAppTokenResponse> {

    private String appId;

    private String secret;

    public GetAppTokenRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.PUB_NO_TOKEN;
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

    @Override
    public Map<String, String> getUrlParams(){
        Map<String,String> param = super.getUrlParams();
        param.put("appid",appId);
        param.put("grant_type","client_credential");
        param.put("secret",secret);

        return param;
    }

    @Override
    public String getPostBody() throws WechatApiException {
        return null;
    }

    @Override
    public Class<GetAppTokenResponse> getResponseClass() {
        return GetAppTokenResponse.class;
    }


}
