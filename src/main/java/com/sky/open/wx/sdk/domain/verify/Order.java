package com.sky.open.wx.sdk.domain.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 订单
 * @date 2018/5/21 16:33
 */
public class Order extends WechatObject {

    private static final long serialVersionUID = 5211535988892749989L;
    /**
     * 订单编号（提交认证资料返回）
     */
    @JSONField(name = "order_id")
    private String orderId;

    /**
     * 费用（单位：分）
     */
    @JSONField(name = "fee")
    private String fee;

    /**
     *  订单状态（0：待支付，1：已支付）
     */
    @JSONField(name = "order_status")
    private Integer orderStatus;

    /**
     * 审核状态（1：审核中，2：审核通过，3：审核失败，4：打回修改，5：已过期）
     */
    @JSONField(name = "verify_status")
    private Integer verifyStatus;

    /**
     * 审核信息
     */
    @JSONField(name = "audit_detail")
    private AuditDetail auditDetail;

    /**
     * 订单信息
     */
    @JSONField(name = "order_desc")
    private OrderDesc orderDesc;

    /**
     * 是否开发票（0：否，1：是）
     */
    @JSONField(name = "need_invoice")
    private Integer needInvoice;

    /**
     * 发票信息
     */
    @JSONField(name = "invoice")
    private Invoice invoice;

    /**
     * 订单的创建时间
     */
    @JSONField(name = "create_time")
    private Long createTime;

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public AuditDetail getAuditDetail() {
        return auditDetail;
    }

    public void setAuditDetail(AuditDetail auditDetail) {
        this.auditDetail = auditDetail;
    }

    public OrderDesc getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(OrderDesc orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(Integer needInvoice) {
        this.needInvoice = needInvoice;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", fee='" + fee + '\'' +
                ", orderStatus=" + orderStatus +
                ", verifyStatus=" + verifyStatus +
                ", auditDetail=" + auditDetail +
                ", orderDesc=" + orderDesc +
                ", needInvoice=" + needInvoice +
                ", invoice=" + invoice +
                ", createTime=" + createTime +
                '}';
    }
}
