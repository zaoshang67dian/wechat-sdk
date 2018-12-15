package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 小程序改名审核状态查询
 * @date 2018/4/16 14:13
 */
public class NickNameStatusResponse extends WechatResponse {

    private static final long serialVersionUID = 1857098023166840148L;
    /**
     * 审核昵称
     */
    @JSONField(name = "nickname")
    private String nickName;

    /**
     * 审核状态，1：审核中，2：审核失败，3：审核成功
     */
    @JSONField(name = "audit_stat")
    private Integer auditStat;

    /**
     * 失败原因
     */
    @JSONField(name = "fail_reason")
    private String failReason;

    /**
     * 审核提交时间
     */
    @JSONField(name = "create_time")
    private Long createTime;

    /**
     * 审核完成时间
     */
    @JSONField(name = "audit_time")
    private Long auditTime;

    public NickNameStatusResponse() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAuditStat() {
        return auditStat;
    }

    public void setAuditStat(Integer auditStat) {
        this.auditStat = auditStat;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Long auditTime) {
        this.auditTime = auditTime;
    }

    @Override
    public String toString() {
        return "NickNameStatusResponse{" +
                "nickName='" + nickName + '\'' +
                ", auditStat=" + auditStat +
                ", failReason='" + failReason + '\'' +
                ", createTime=" + createTime +
                ", auditTime=" + auditTime +
                '}';
    }
}
