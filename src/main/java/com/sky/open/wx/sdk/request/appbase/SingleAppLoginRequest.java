package com.sky.open.wx.sdk.request.appbase;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appbase.AppLoginResponse;

import java.util.Map;

public class SingleAppLoginRequest extends WechatRequest<AppLoginResponse> {

    /**
     * 小程序的AppID
     */
    @JSONField(name = "appid")
    private String appid;

    /**
     * 登录时获取的 code
     */
    @JSONField(name = "js_code")
    private String jsCode;

    /**
     * 填authorization_code
     */
    @JSONField(name = "grant_type")
    private String grantType;

    /**
     * 小程序的密钥
     */
    @JSONField(name = "secret")
    private String secret;

    public SingleAppLoginRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.APP_LOGIN_S;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getJsCode() {
        return jsCode;
    }

    public void setJsCode(String jsCode) {
        this.jsCode = jsCode;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    @Override
    public Map<String, String> getUrlParams(){
        Map<String,String> param = super.getUrlParams();
        param.put("appid",appid);
        param.put("js_code",jsCode);
        param.put("grant_type","authorization_code");
        param.put("secret", secret);

        return param;
    }

    @Override
    public String getPostBody() throws WechatApiException {
        return null;
    }

    @Override
    public Class<AppLoginResponse> getResponseClass() {
        return AppLoginResponse.class;
    }
}
