package com.sky.open.wx.sdk.response.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 小程序提交审核
 * @date 2018/5/7 15:23
 */
public class AppSubAuditResponse extends WechatResponse {

    private static final long serialVersionUID = 3424351571298547249L;
    /**
     * 审核编号
     */
    @JSONField(name = "auditid")
    private String auditId;

    public AppSubAuditResponse() {
    }

    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    @Override
    public String toString() {
        return "AppSubAuditResponse{" +
                "auditId='" + auditId + '\'' +
                '}';
    }
}
