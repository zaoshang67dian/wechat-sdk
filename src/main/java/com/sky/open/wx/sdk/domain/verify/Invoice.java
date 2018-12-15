package com.sky.open.wx.sdk.domain.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 发票信息
 * @date 2018/5/21 16:47
 */
public class Invoice extends WechatObject {

    private static final long serialVersionUID = -382837226214039118L;
    /**
     * 发票类型（0：普通发票，1：增值税专用发票）
     */
    @JSONField(name = "invoice_type")
    private Integer invoiceType;

    /**
     * 发票抬头
     */
    @JSONField(name = "title")
    private String title;

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
     * 发票状态（0：未开票，1：开票中，2：发票已寄出）
     */
    @JSONField(name = "invoice_status")
    private Integer invoiceStatus;

    /**
     * 发票快递编号
     */
    @JSONField(name = "exp_no")
    private String expNo;

    /**
     * 发票快递时间
     */
    @JSONField(name = "exp_time")
    private Long expTime;

    public Invoice() {
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getExpNo() {
        return expNo;
    }

    public void setExpNo(String expNo) {
        this.expNo = expNo;
    }

    public Long getExpTime() {
        return expTime;
    }

    public void setExpTime(Long expTime) {
        this.expTime = expTime;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceType=" + invoiceType +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", mobile='" + mobile + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", invoiceStatus=" + invoiceStatus +
                ", expNo='" + expNo + '\'' +
                ", expTime=" + expTime +
                '}';
    }
}
