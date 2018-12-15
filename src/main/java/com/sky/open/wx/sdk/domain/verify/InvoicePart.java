package com.sky.open.wx.sdk.domain.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 发票部分
 * @date 2018/5/21 15:57
 */
public class InvoicePart extends WechatObject {

    private static final long serialVersionUID = -2892735049766324075L;
    /**
     * 是否开发票（0：否； 1：是）
     */
    @JSONField(name = "need_invoice")
    private Integer needInvoice;

    /**
     * 发票类型（0：普通发票；1：增值税专用发票）：开发票时必填
     */
    @JSONField(name = "invoice_type")
    private Integer invoiceType;

    /**
     * 发票寄送地址：开发票时必填
     */
    @JSONField(name = "address")
    private String address;

    /**
     * 发票联系人：开发票时必填
     */
    @JSONField(name = "contact")
    private String contact;

    /**
     * 发票联系人手机号：开发票时必填
     */
    @JSONField(name = "mobile")
    private String mobile;

    /**
     * 发票寄送省份：开发票时必填
     */
    @JSONField(name = "province")
    private String province;

    /**
     * 发票寄送城市：开发票时必填
     */
    @JSONField(name = "city")
    private String city;

    /**
     * 邮政编码：开发票时必填
     */
    @JSONField(name = "postcode")
    private String postcode;

    /**
     * 专票纳税号：开发票且为增值税专用发票时必填
     */
    @JSONField(name = "tax_num")
    private String taxNum;

    /**
     * 企业电话：开发票且为增值税专用发票时必填
     */
    @JSONField(name = "enterprise_tel")
    private String enterpriseTel;

    /**
     * 企业开户银行：开发票且为增值税专用发票时必填
     */
    @JSONField(name = "bank_name")
    private String bankName;

    /**
     * 企业银行账号：开发票且为增值税专用发票时必填
     */
    @JSONField(name = "bank_account")
    private String bankAccount;

    /**
     * 企业开户许可证：开发票且为增值税专用发票时必填
     */
    @JSONField(name = "open_license_stuff")
    private String openLicenseStuff;

    /**
     * 税务登记证:开发票且为增值税专用发票时必填
     */
    @JSONField(name = "tax_reg_certificate")
    private String taxRegCertificate;

    /**
     * 企业注册地址: 开发票且为增值税专用发票时必填
     */
    @JSONField(name = "register_addr")
    private String registerAddr;

    public InvoicePart() {
    }

    public Integer getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(Integer needInvoice) {
        this.needInvoice = needInvoice;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum;
    }

    public String getEnterpriseTel() {
        return enterpriseTel;
    }

    public void setEnterpriseTel(String enterpriseTel) {
        this.enterpriseTel = enterpriseTel;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getOpenLicenseStuff() {
        return openLicenseStuff;
    }

    public void setOpenLicenseStuff(String openLicenseStuff) {
        this.openLicenseStuff = openLicenseStuff;
    }

    public String getTaxRegCertificate() {
        return taxRegCertificate;
    }

    public void setTaxRegCertificate(String taxRegCertificate) {
        this.taxRegCertificate = taxRegCertificate;
    }

    public String getRegisterAddr() {
        return registerAddr;
    }

    public void setRegisterAddr(String registerAddr) {
        this.registerAddr = registerAddr;
    }

    @Override
    public String toString() {
        return "InvoicePart{" +
                "needInvoice=" + needInvoice +
                ", invoiceType=" + invoiceType +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", mobile='" + mobile + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", taxNum='" + taxNum + '\'' +
                ", enterpriseTel='" + enterpriseTel + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", openLicenseStuff='" + openLicenseStuff + '\'' +
                ", taxRegCertificate='" + taxRegCertificate + '\'' +
                ", registerAddr='" + registerAddr + '\'' +
                '}';
    }
}
