package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.GetAuthorizerInfoResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 该API用于获取授权方的基本信息，包括头像、昵称、帐号类型、认证类型、微信号、原始ID和二维码图片URL。
 *
 * @author shipj
 * @create 2017-12-12-14:41
 */

public class GetAuthorizerInfoRequest extends WechatRequest<GetAuthorizerInfoResponse> {

    /**
     * 第三方appid
     */
    @JSONField(name = "component_appid")
    private String componentAppid;
    /**
     * 授权方appid
     */
    @JSONField(name = "authorizer_appid")
    private String authorizerAppid;

    public GetAuthorizerInfoRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.API_GET_AUTHORIZER_INFO;
    }

    public String getComponentAppid() {
        return componentAppid;
    }

    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid;
    }

    public String getAuthorizerAppid() {
        return authorizerAppid;
    }

    public void setAuthorizerAppid(String authorizerAppid) {
        this.authorizerAppid = authorizerAppid;
    }

    @Override
    public Class<GetAuthorizerInfoResponse> getResponseClass() {
        return GetAuthorizerInfoResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("component_appid",componentAppid);
        requestMap.put("authorizer_appid",authorizerAppid);

        return JSON.toJSONString(requestMap);
    }
}
