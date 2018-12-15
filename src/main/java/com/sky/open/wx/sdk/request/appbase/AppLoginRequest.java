package com.sky.open.wx.sdk.request.appbase;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appbase.AppLoginResponse;


import java.util.Map;

/**
 * code 换取 session_key
 * get请求，需要传入getParam（
 *  appid=APPID ：小程序的AppID
 *  js_code=JSCODE：登录时获取的 code
 *  grant_type=authorization_code：填authorization_code
 *  component_appid=COMPONENT_APPID：第三方平台appid
 *  component_access_token=ACCESS_TOKEN：第三方平台的 component_access_token
 * ）
 * @date 2018/4/16 10:26
 */
public class AppLoginRequest extends WechatRequest<AppLoginResponse> {

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
     * 第三方平台appid
     */
    @JSONField(name = "component_appid")
    private String componentAppid;

    public AppLoginRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.APP_LOGIN;
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

    public String getComponentAppid() {
        return componentAppid;
    }

    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid;
    }

    @Override
    public Map<String, String> getUrlParams(){
        Map<String, String> params = super.getUrlParams();
        params.put("appid",appid);
        params.put("js_code",jsCode);
        params.put("grant_type","authorization_code");
        params.put("component_appid",componentAppid);
        return params;
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
