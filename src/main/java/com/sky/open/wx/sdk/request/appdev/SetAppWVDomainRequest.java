package com.sky.open.wx.sdk.request.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.SetAppWVDomainResponse;

import java.util.List;

/**
 * 覆盖小程序业务域名
 * @date 2018/5/7 11:21
 */
public class SetAppWVDomainRequest extends WechatRequest<SetAppWVDomainResponse> {

    /**
     * 默认 set
     */
    @JSONField(name = "action")
    private String action;

    /**
     * 需要添加的业务域名列表
     */
    @JSONField(name = "webviewdomain")
    private List<String> webviewDomain;

    public SetAppWVDomainRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_WV_DOMAIN;
        this.action = "set";
    }

    public String getAction() {
        return "set";
    }

    public void setAction() {
        this.action = "set";
    }

    public List<String> getWebviewDomain() {
        return webviewDomain;
    }

    public void setWebviewDomain(List<String> webviewDomain) {
        this.webviewDomain = webviewDomain;
    }

    @Override
    public String toString() {
        return "SetAppWVDomainRequest{" +
                "action='" + action + '\'' +
                ", webviewDomain=" + webviewDomain +
                '}';
    }

    @Override
    public Class<SetAppWVDomainResponse> getResponseClass() {
        return SetAppWVDomainResponse.class;
    }
}
