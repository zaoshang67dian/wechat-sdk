package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.GetAuthorizerOptionResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 该API用于获取授权方的公众号或小程序的选项设置信息，如：地理位置上报，语音识别开关，多客服开关
 *
 * @author shipj
 * @create 2017-12-12-17:17
 */

public class GetAuthorizerOptionRequest extends WechatRequest<GetAuthorizerOptionResponse> {

    /**
     * 第三方平台appid
     */
    @JSONField(name = "component_appid")
    private String componentAppid;
    /**
     * 授权公众号或小程序的appid
     */
    @JSONField(name = "authorizer_appid")
    private String authorizerAppid;
    /**
     * 选项名称
     */
    @JSONField(name = "option_name")
    private String optionName;

    public GetAuthorizerOptionRequest() {
        this.requestUrl = RequestUrlConst.API_GET_AUTHORIZER_OPTION;
        this.getMethod = false;
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

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    @Override
    public Class<GetAuthorizerOptionResponse> getResponseClass() {
        return GetAuthorizerOptionResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("component_appid",componentAppid);
        requestMap.put("authorizer_appid",authorizerAppid);
        requestMap.put("option_name",optionName);

        return JSON.toJSONString(requestMap);
    }
}
