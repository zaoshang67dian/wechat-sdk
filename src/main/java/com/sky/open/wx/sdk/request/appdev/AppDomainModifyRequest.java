package com.sky.open.wx.sdk.request.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.AppDomainModifyResponse;

import java.util.List;

/**
 * 小程序域名设置
 * @date 2018/5/7 11:39
 */
public class AppDomainModifyRequest extends WechatRequest<AppDomainModifyResponse> {

    /**
     * add添加, delete删除, set覆盖, get获取。当参数是get时不需要填四个域名字段
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

    public AppDomainModifyRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_DOMAIN_OPERATE;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
    public String toString() {
        return "AppDomainModifyRequest{" +
                "action='" + action + '\'' +
                ", requestDomain=" + requestDomain +
                ", wsRequestDomain=" + wsRequestDomain +
                ", uploadDomain=" + uploadDomain +
                ", downloadDomain=" + downloadDomain +
                '}';
    }

    @Override
    public Class<AppDomainModifyResponse> getResponseClass() {
        return AppDomainModifyResponse.class;
    }
}
