package com.sky.open.wx.sdk.request.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.GetAppWVDomainResponse;

/**
 * 获取小程序全部业务域名：
 * 提示：
 * 1、需要先将域名登记到第三方平台的小程序业务域名中，才可以调用接口进行配置。
 * 2、为授权的小程序配置域名时支持配置子域名，
 *      例如第三方登记的业务域名如为qq.com，则可以直接将qq.com及其子域名（如xxx.qq.com）也配置到授权的小程序中。
 * @date 2018/5/7 10:57
 */
public class GetAppWVDomainRequest extends WechatRequest<GetAppWVDomainResponse> {

    /**
     * 默认 get
     */
    @JSONField(name = "action")
    private String action;

    public GetAppWVDomainRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_WV_DOMAIN;
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
        return "GetAppWVDomainRequest{" +
                "action='" + action + '\'' +
                '}';
    }

    @Override
    public Class<GetAppWVDomainResponse> getResponseClass() {
        return GetAppWVDomainResponse.class;
    }
}
