package com.sky.open.wx.sdk.response.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 查询最新一次提交的审核状态
 * @date 2018/5/7 15:34
 */
public class CheckLatestAuditStatusResponse extends WechatResponse {

    private static final long serialVersionUID = -9110232456730461426L;
    /**
     * 最新的审核ID
     */
    @JSONField(name = "auditid")
    private String auditId;

    /**
     * 审核状态，其中0为审核成功，1为审核失败，2为审核中
     */
    @JSONField(name = "status")
    private Integer status;

    /**
     * 当status=1，审核被拒绝时，返回的拒绝原因
     */
    @JSONField(name = "reason")
    private String reason;

    public CheckLatestAuditStatusResponse() {
    }

    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "CheckLatestAuditStatusResponse{" +
                "auditId='" + auditId + '\'' +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                '}';
    }
}
