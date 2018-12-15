package com.sky.open.wx.sdk.response.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 小程序服务器域名设置
 * @date 2018/5/7 11:38
 */
public class AppDomainModifyResponse extends WechatResponse {

    private static final long serialVersionUID = -7647311302140889646L;
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

    public AppDomainModifyResponse() {
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
        return "AppDomainModifyResponse{" +
                "requestDomain=" + requestDomain +
                ", wsRequestDomain=" + wsRequestDomain +
                ", uploadDomain=" + uploadDomain +
                ", downloadDomain=" + downloadDomain +
                '}';
    }
}
