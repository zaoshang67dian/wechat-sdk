package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.GetApiQueryAuthResponse;


import java.util.HashMap;
import java.util.Map;

/**
 * 使用授权码获取（公众号/小程序）的接口调用凭证
 * @author shipj
 * @create 2017-12-11-21:41
 */

public class GetApiQueryAuthRequest extends WechatRequest<GetApiQueryAuthResponse> {

    /**
     * 第三方平台appid
     */
    @JSONField(name = "component_appid")
    private String componentAppid;
    /**
     * 小程序/公众号的授权码
     */
    @JSONField(name = "authorization_code")
    private String authorizationCode;

    public GetApiQueryAuthRequest() {
        this.requestUrl = RequestUrlConst.API_QUERY_AUTH;
        this.getMethod = false;
    }

    public String getComponentAppid() {
        return componentAppid;
    }

    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    @Override
    public Class<GetApiQueryAuthResponse> getResponseClass() {
        return GetApiQueryAuthResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("component_appid",componentAppid);
        requestMap.put("authorization_code",authorizationCode);

        return JSON.toJSONString(requestMap);
    }
}
