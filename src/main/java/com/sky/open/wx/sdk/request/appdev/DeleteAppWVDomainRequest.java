package com.sky.open.wx.sdk.request.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.DeleteAppWVDomainResponse;

import java.util.List;

/**
 * @date 2018/5/7 11:15
 */
public class DeleteAppWVDomainRequest extends WechatRequest<DeleteAppWVDomainResponse> {

    /**
     * 默认 delete
     */
    @JSONField(name = "action")
    private String action;

    /**
     * 需要添加的业务域名列表
     */
    @JSONField(name = "webviewdomain")
    private List<String> webviewDomain;

    public DeleteAppWVDomainRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_WV_DOMAIN;
        this.action = "delete";
    }

    public String getAction() {
        return "delete";
    }

    public void setAction() {
        this.action = "delete";
    }

    public List<String> getWebviewDomain() {
        return webviewDomain;
    }

    public void setWebviewDomain(List<String> webviewDomain) {
        this.webviewDomain = webviewDomain;
    }

    @Override
    public String toString() {
        return "DeleteAppWVDomainRequest{" +
                "action='" + action + '\'' +
                ", webviewDomain=" + webviewDomain +
                '}';
    }

    @Override
    public Class<DeleteAppWVDomainResponse> getResponseClass() {
        return DeleteAppWVDomainResponse.class;
    }
}
