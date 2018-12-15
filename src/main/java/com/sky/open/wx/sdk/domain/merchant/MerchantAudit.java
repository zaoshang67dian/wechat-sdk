package com.sky.open.wx.sdk.domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 门店小程序审核结果
 *
 * @author shipj
 * @create 2017-12-15-23:15
 */

public class MerchantAudit extends WechatObject {

    private static final long serialVersionUID = -8566128998089288896L;
    /**
     * 审核单id
     */
    @JSONField(name = "audit_id")
    private Long auditId;
    /**
     * 审核状态，0：未提交审核，1：审核成功，2：审核中，3：审核失败，4：管理员拒绝
     */
    @JSONField(name = "status")
    private Integer status;
    /**
     * 审核状态为3或者4时，reason列出审核失败的原因
     */
    @JSONField(name = "reason")
    private String reason;

    public MerchantAudit() {
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
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
        return "MerchantAudit{" +
                "auditId=" + auditId +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                '}';
    }
}
