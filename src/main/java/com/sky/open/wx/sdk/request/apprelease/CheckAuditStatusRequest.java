package com.sky.open.wx.sdk.request.apprelease;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.CheckAuditStatusResponse;

/**
 * 查询某个指定版本的审核状态
 * @date 2018/5/7 15:31
 */
public class CheckAuditStatusRequest extends WechatRequest<CheckAuditStatusResponse> {

    /**
     * 提交审核时获得的审核id
     */
    @JSONField(name = "auditid")
    private String auditid;

    public CheckAuditStatusRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_AUDIT_STATUS;
    }

    public String getAuditid() {
        return auditid;
    }

    public void setAuditid(String auditid) {
        this.auditid = auditid;
    }

    @Override
    public String toString() {
        return "CheckAuditStatusRequest{" +
                "auditid='" + auditid + '\'' +
                '}';
    }

    @Override
    public Class<CheckAuditStatusResponse> getResponseClass() {
        return CheckAuditStatusResponse.class;
    }
}
