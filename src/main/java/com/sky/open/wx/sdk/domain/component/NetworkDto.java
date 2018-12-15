package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.List;

/**
 * 小程序已设置的各个服务器域名
 *
 * @author shipj
 * @create 2017-12-12-14:20
 */

public class NetworkDto extends WechatObject {

    private static final long serialVersionUID = -8204250069419878187L;
    @JSONField(name = "RequestDomain")
    private List<String> requestDomain;
    @JSONField(name = "WsRequestDomain")
    private List<String> wsRequestDomain;
    @JSONField(name = "UploadDomain")
    private List<String> uploadDomain;
    @JSONField(name = "DownloadDomain")
    private List<String> downloadDomain;

    public NetworkDto() {
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
        return "NetworkDto{" +
                "requestDomain=" + requestDomain +
                ", wsRequestDomain=" + wsRequestDomain +
                ", uploadDomain=" + uploadDomain +
                ", downloadDomain=" + downloadDomain +
                '}';
    }
}
