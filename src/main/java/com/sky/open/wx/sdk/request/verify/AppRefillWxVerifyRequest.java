package com.sky.open.wx.sdk.request.verify;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.verify.InvoicePart;
import com.sky.open.wx.sdk.domain.verify.NamingPart;
import com.sky.open.wx.sdk.domain.verify.QualificationPart;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.verify.AppRefillWxVerifyResponse;

/**
 * 重新提交认证资料请求
 * @date 2018/5/21 17:19
 */
public class AppRefillWxVerifyRequest extends WechatRequest<AppRefillWxVerifyResponse>{

    /**
     * 需要重新提交认证的订单编号
     */
    @JSONField(name = "order_id")
    private String orderId;

    /**
     * 资质部分
     */
    @JSONField(name = "qualification_part")
    private QualificationPart qualificationPart;

    /**
     * 小程序名称命名认证资料
     */
    @JSONField(name = "naming_part")
    private NamingPart namingPart;

    /**
     * 发票部分
     */
    @JSONField(name = "invoice_part")
    private InvoicePart invoicePart;

    public AppRefillWxVerifyRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.REFILL_WX_VERIFY;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public QualificationPart getQualificationPart() {
        return qualificationPart;
    }

    public void setQualificationPart(QualificationPart qualificationPart) {
        this.qualificationPart = qualificationPart;
    }

    public NamingPart getNamingPart() {
        return namingPart;
    }

    public void setNamingPart(NamingPart namingPart) {
        this.namingPart = namingPart;
    }

    public InvoicePart getInvoicePart() {
        return invoicePart;
    }

    public void setInvoicePart(InvoicePart invoicePart) {
        this.invoicePart = invoicePart;
    }

    @Override
    public String toString() {
        return "AppRefillWxVerifyRequest{" +
                "orderId='" + orderId + '\'' +
                ", qualificationPart=" + qualificationPart +
                ", namingPart=" + namingPart +
                ", invoicePart=" + invoicePart +
                '}';
    }

    @Override
    public Class<AppRefillWxVerifyResponse> getResponseClass() {
        return AppRefillWxVerifyResponse.class;
    }
}
