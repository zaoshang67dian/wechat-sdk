package com.sky.open.wx.sdk.domain.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 认证详情
 * @date 2018/5/21 16:36
 */
public class AuditDetail extends WechatObject {

    private static final long serialVersionUID = -500941340977621253L;
    /**
     * 打回类型:
     * （verify_status=4时才有意义，
     REFILL_TYPE_QUALIFICATION：需要修改资质材料，
     REFILL_TYPE_NAMING：需要修改命名材料，
     REFILL_TYPE_INVOICE：需要修改发票材料）
     */
    @JSONField(name = "refill_type")
    private String refillType;

    /**
     * 资质认证审核结果（0：无，1：审核成功，2：审核失败）
     */
    @JSONField(name = "qualification_audit_result")
    private Integer qualificationAuditResult;

    /**
     * 名称认证审核结果（0：无，1：审核成功，2：审核失败）
     */
    @JSONField(name = "naming_audit_result")
    private Integer namingAuditResult;

    public AuditDetail() {
    }

    public String getRefillType() {
        return refillType;
    }

    public void setRefillType(String refillType) {
        this.refillType = refillType;
    }

    public Integer getQualificationAuditResult() {
        return qualificationAuditResult;
    }

    public void setQualificationAuditResult(Integer qualificationAuditResult) {
        this.qualificationAuditResult = qualificationAuditResult;
    }

    public Integer getNamingAuditResult() {
        return namingAuditResult;
    }

    public void setNamingAuditResult(Integer namingAuditResult) {
        this.namingAuditResult = namingAuditResult;
    }

    @Override
    public String toString() {
        return "AuditDetail{" +
                "refillType='" + refillType + '\'' +
                ", qualificationAuditResult=" + qualificationAuditResult +
                ", namingAuditResult=" + namingAuditResult +
                '}';
    }
}
