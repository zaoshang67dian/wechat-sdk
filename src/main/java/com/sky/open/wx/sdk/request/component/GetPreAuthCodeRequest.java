package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.GetPreAuthCodeResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取第三方预授权码请求体
 *
 * @author shipj
 * @create 2017-12-11-21:14
 */

public class GetPreAuthCodeRequest extends WechatRequest<GetPreAuthCodeResponse>{

    /**
     * 第三方平台方appid
     */
    @JSONField(name = "component_appid")
    private String componentAppid;

    public GetPreAuthCodeRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.PRE_AUTH_CODE;
    }

    public String getComponentAppid() {
        return componentAppid;
    }

    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid;
    }

    @Override
    public Class<GetPreAuthCodeResponse> getResponseClass() {
        return GetPreAuthCodeResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("component_appid",componentAppid);

        return JSON.toJSONString(requestMap);
    }
}
