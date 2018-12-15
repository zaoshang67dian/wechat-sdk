package com.sky.open.wx.sdk.request.verify;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.verify.InvoicePart;
import com.sky.open.wx.sdk.domain.verify.NamingPart;
import com.sky.open.wx.sdk.domain.verify.QualificationPart;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.verify.AppApplyWxVerifyResponse;

/**
 * 微信认证请求
 * @date 2018/5/21 15:33
 */
public class AppApplyWxVerifyRequest extends WechatRequest<AppApplyWxVerifyResponse> {

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

    public AppApplyWxVerifyRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APPLY_WX_VERIFY;
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
        return "AppApplyWxVerifyRequest{" +
                "qualificationPart=" + qualificationPart +
                ", namingPart=" + namingPart +
                ", invoicePart=" + invoicePart +
                '}';
    }

    @Override
    public Class<AppApplyWxVerifyResponse> getResponseClass() {
        return AppApplyWxVerifyResponse.class;
    }
}
