package com.sky.open.wx.sdk.request.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.DeleteAppDomainResponse;

import java.util.List;

/**
 * 删除小程序域名
 * @date 2018/5/7 10:42
 */
public class DeleteAppDomainRequest extends WechatRequest<DeleteAppDomainResponse> {

    /**
     * 默认 delete
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

    public DeleteAppDomainRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_DOMAIN_OPERATE;
        this.action = "delete";
    }

    public String getAction() {
        return "delete";
    }

    public void setAction() {
        this.action = "delete";
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
        return "DeleteAppDomainRequest{" +
                "action='" + action + '\'' +
                ", requestDomain=" + requestDomain +
                ", wsRequestDomain=" + wsRequestDomain +
                ", uploadDomain=" + uploadDomain +
                ", downloadDomain=" + downloadDomain +
                '}';
    }

    @Override
    public Class<DeleteAppDomainResponse> getResponseClass() {
        return DeleteAppDomainResponse.class;
    }


}
