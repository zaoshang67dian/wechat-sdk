package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.GetComponentTokenResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取第三方接口调用凭证
 *
 * @author shipj
 * @create 2017-12-11-20:56
 */

public class GetComponentTokenRequest extends WechatRequest<GetComponentTokenResponse>{

    /**
     * 第三方平台appid
     */
    @JSONField(name = "component_appid")
    private String componentAppid;
    /**
     * 第三方平台appsecret
     */
    @JSONField(name = "component_appsecret")
    private String componentAppsecret;
    /**
     * 微信后台推送的ticket，此ticket会定时推送，具体请见: https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1453779503&token=&lang=zh_CN
     */
    @JSONField(name = "component_verify_ticket")
    private String componentVerifyTicket;

    public GetComponentTokenRequest() {
        this.requestUrl = RequestUrlConst.API_COMPONENT_TOKEN;
        this.getMethod = false;
    }

    public String getComponentAppid() {
        return componentAppid;
    }

    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid;
    }

    public String getComponentAppsecret() {
        return componentAppsecret;
    }

    public void setComponentAppsecret(String componentAppsecret) {
        this.componentAppsecret = componentAppsecret;
    }

    public String getComponentVerifyTicket() {
        return componentVerifyTicket;
    }

    public void setComponentVerifyTicket(String componentVerifyTicket) {
        this.componentVerifyTicket = componentVerifyTicket;
    }

    @Override
    public Class<GetComponentTokenResponse> getResponseClass() {
        return GetComponentTokenResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("component_appid",componentAppid);
        requestMap.put("component_appsecret",componentAppsecret);
        requestMap.put("component_verify_ticket",componentVerifyTicket);

        return JSON.toJSONString(requestMap);
    }
}
