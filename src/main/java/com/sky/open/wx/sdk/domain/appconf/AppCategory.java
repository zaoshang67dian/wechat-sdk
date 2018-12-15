package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.List;

/**
 * 小程序已经添加的门类信息
 * @date 2018/5/3 11:06
 */
public class AppCategory extends WechatObject {

    private static final long serialVersionUID = 8202494143322121761L;
    /**
     * 一级目录ID
     */
    @JSONField(name = "first")
    private Integer first;

    /**
     * 一级目录名称
     */
    @JSONField(name = "first_name")
    private String firstName;

    /**
     * 二级目录ID
     */
    @JSONField(name = "second")
    private Integer second;

    /**
     * 二级目录名称
     */
    @JSONField(name = "second_name")
    private String secondName;

    /**
     * 审核状态（1：审核中； 2：审核不通过； 3：审核通过）
     */
    @JSONField(name = "audit_status")
    private Integer auditStatus;

    /**
     * 审核不通过原因
     */
    @JSONField(name = "audit_reason")
    private String auditReason;

    /**
     * 需要的资质信息
     */
    @JSONField(name = "certicates")
    private List<Certicate> certicates;

    public AppCategory() {
    }

    public AppCategory(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public AppCategory(Integer first, String firstName, Integer second, String secondName, Integer auditStatus, String auditReason, List<Certicate> certicates) {
        this.first = first;
        this.firstName = firstName;
        this.second = second;
        this.secondName = secondName;
        this.auditStatus = auditStatus;
        this.auditReason = auditReason;
        this.certicates = certicates;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditReason() {
        return auditReason;
    }

    public void setAuditReason(String auditReason) {
        this.auditReason = auditReason;
    }

    public List<Certicate> getCerticates() {
        return certicates;
    }

    public void setCerticates(List<Certicate> certicates) {
        this.certicates = certicates;
    }

    @Override
    public String toString() {
        return "AppCategory{" +
                "first=" + first +
                ", firstName='" + firstName + '\'' +
                ", second=" + second +
                ", secondName='" + secondName + '\'' +
                ", auditStatus=" + auditStatus +
                ", auditReason='" + auditReason + '\'' +
                ", certicates=" + certicates +
                '}';
    }
}
