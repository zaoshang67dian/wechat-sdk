package com.sky.open.wx.sdk.domain.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 订单详情
 * @date 2018/5/21 16:40
 */
public class OrderDesc extends WechatObject {

    private static final long serialVersionUID = 7703573244212511562L;
    /**
     * 审核公司名称
     */
    @JSONField(name = "provider")
    private String provider;

    /**
     * 审核公司联系方式
     */
    @JSONField(name = "contact")
    private String contact;

    /**
     * 该订单已打回重填的次数
     */
    @JSONField(name = "refill_count")
    private Integer refillCount;

    /**
     * 最大打回重填次数
     */
    @JSONField(name = "max_refill_count")
    private Integer maxRefillCount;

    /**
     * 提交重填的截止日期
     */
    @JSONField(name = "deadline")
    private Long deadline;

    /**
     * 审核备注（一般包含打回修改的原因，审核失败的原因等）
     */
    @JSONField(name = "remark")
    private String remark;

    public OrderDesc() {
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getRefillCount() {
        return refillCount;
    }

    public void setRefillCount(Integer refillCount) {
        this.refillCount = refillCount;
    }

    public Integer getMaxRefillCount() {
        return maxRefillCount;
    }

    public void setMaxRefillCount(Integer maxRefillCount) {
        this.maxRefillCount = maxRefillCount;
    }

    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OrderDesc{" +
                "provider='" + provider + '\'' +
                ", contact='" + contact + '\'' +
                ", refillCount=" + refillCount +
                ", maxRefillCount=" + maxRefillCount +
                ", deadline=" + deadline +
                ", remark='" + remark + '\'' +
                '}';
    }
}
