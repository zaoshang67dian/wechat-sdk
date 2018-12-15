package com.sky.open.wx.sdk.request.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.AddAppWVDomainResponse;

import java.util.List;

/**
 * 为小程序添加业务域名
 * @date 2018/5/7 11:05
 */
public class AddAppWVDomainRequest extends WechatRequest<AddAppWVDomainResponse> {

    /**
     * 默认 add
     */
    @JSONField(name = "action")
    private String action;

    /**
     * 需要添加的业务域名列表
     */
    @JSONField(name = "webviewdomain")
    private List<String> webviewDomain;

    public AddAppWVDomainRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_WV_DOMAIN;
        this.action = "add";
    }

    public String getAction() {
        return "add";
    }

    public void setAction() {
        this.action = "add";
    }

    public List<String> getWebviewDomain() {
        return webviewDomain;
    }

    public void setWebviewDomain(List<String> webviewDomain) {
        this.webviewDomain = webviewDomain;
    }

    @Override
    public String toString() {
        return "AddAppWVDomainRequest{" +
                "action='" + action + '\'' +
                ", webviewDomain=" + webviewDomain +
                '}';
    }

    @Override
    public Class<AddAppWVDomainResponse> getResponseClass() {
        return AddAppWVDomainResponse.class;
    }
}
