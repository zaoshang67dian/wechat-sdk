package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.SetAuthorizerOptionResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 该API用于设置授权方的公众号或小程序的选项信息，如：地理位置上报，语音识别开关，多客服开关
 *
 * @author shipj
 * @create 2017-12-12-19:54
 */

public class SetAuthorizerOptionRequest extends WechatRequest<SetAuthorizerOptionResponse> {

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
     * 选项名称: 具体参考：https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1453779503&token=&lang=zh_CN
     */
    @JSONField(name = "option_name")
    private String optionName;
    /**
     * 设置的选项值
     */
    @JSONField(name = "option_value")
    private String optionValue;

    public SetAuthorizerOptionRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.API_SET_AUTHORIZER_OPTION;
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

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    @Override
    public String toString() {
        return "SetAuthorizerOptionRequest{" +
                "componentAppid='" + componentAppid + '\'' +
                ", authorizerAppid='" + authorizerAppid + '\'' +
                ", optionName='" + optionName + '\'' +
                ", optionValue='" + optionValue + '\'' +
                '}';
    }

    @Override
    public Class<SetAuthorizerOptionResponse> getResponseClass() {
        return SetAuthorizerOptionResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("component_appid",componentAppid);
        requestMap.put("authorizer_appid",authorizerAppid);
        requestMap.put("option_name",optionName);
        requestMap.put("option_value",optionValue);

        return JSON.toJSONString(requestMap);
    }
}
