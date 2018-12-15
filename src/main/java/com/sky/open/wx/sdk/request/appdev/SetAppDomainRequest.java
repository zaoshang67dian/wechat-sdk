package com.sky.open.wx.sdk.request.appdev;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.SetAppDomainResponse;

import java.util.List;

/**
 * 覆盖小程序域名设置
 * @author shipj@ctrip.com
 * @date 2018/5/7 10:54
 */
public class SetAppDomainRequest extends WechatRequest<SetAppDomainResponse> {

    /**
     * 默认 set
     */
    @JSONField(name = "action")
    private String action;

    /**
     * request合法域名
     */
    @JSONField(name = "requestdomain")
    private List<String> requestDomain;

    /**
     * socket合法域名
     */
    @JSONField(name = "wsrequestdomain")
    private List<String> wsRequestDomain;

    /**
     * uploadFile合法域名
     */
    @JSONField(name = "uploaddomain")
    private List<String> uploadDomain;

    /**
     * downloadFile合法域名
     */
    @JSONField(name = "downloaddomain")
    private List<String> downloadDomain;

    public SetAppDomainRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_DOMAIN_OPERATE;
        this.action = "set";
    }

    public String getAction() {
        return "set";
    }

    public void setAction() {
        this.action = "set";
    }

    public List<String> getRequestDomain() {
        return requestDomain;
    }

    public void setRequestDomain(List<String> requestDomain) {
        this.requestDomain = requestDomain;
    }

    public List<String> getWsRequestDomain() {
        return wsRequestDomain;
    }

    public void setWsRequestDomain(List<String> wsRequestDomain) {
        this.wsRequestDomain = wsRequestDomain;
    }

    public List<String> getUploadDomain() {
        return uploadDomain;
    }

    public void setUploadDomain(List<String> uploadDomain) {
        this.uploadDomain = uploadDomain;
    }

    public List<String> getDownloadDomain() {
        return downloadDomain;
    }

    public void setDownloadDomain(List<String> downloadDomain) {
        this.downloadDomain = downloadDomain;
    }

    @Override
    public Class<SetAppDomainResponse> getResponseClass() {
        return SetAppDomainResponse.class;
    }
}
