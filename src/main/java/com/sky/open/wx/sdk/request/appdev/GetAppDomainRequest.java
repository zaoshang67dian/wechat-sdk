package com.sky.open.wx.sdk.request.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.GetAppDomainResponse;

/**
 * 获取小程序全部域名设置
 * @date 2018/5/7 10:26
 */
public class GetAppDomainRequest extends WechatRequest<GetAppDomainResponse> {

    /**
     * get获取
     */
    @JSONField(name = "action")
    private String action;

    public GetAppDomainRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_DOMAIN_OPERATE;
        this.action = "get";
    }

    public String getAction() {
        return "get";
    }

    public void setAction() {
        this.action = "get";
    }

    @Override
    public String toString() {
        return "GetAppDomainRequest{" +
                "action='" + action + '\'' +
                '}';
    }

    @Override
    public Class<GetAppDomainResponse> getResponseClass() {
        return GetAppDomainResponse.class;
    }
}
