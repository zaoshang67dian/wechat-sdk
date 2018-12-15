package com.sky.open.wx.sdk.domain.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * qualification_part 认证资质部分
 * @date 2018/5/21 15:34
 */
public class QualificationPart extends WechatObject {

    private static final long serialVersionUID = 5531369730470152817L;
    /**
     * 认证类型（1：企业，12：个体工商户）
     */
    @JSONField(name = "customer_type")
    private Integer customerType;

    /**
     * 主体名称（只能使用帐号当前的主体名称，不允许修改）
     */
    @JSONField(name = "name")
    private String name;

    /**
     * 营业执照注册号/统一社会信用代码
     */
    @JSONField(name = "registered_id")
    private String registeredId;

    /**
     * 对公账户户名
     */
    @JSONField(name = "account_name")
    private String accountName;

    /**
     * 对公银行账号
     */
    @JSONField(name = "bank_account")
    private String bankAccount;

    /**
     * 对公账户开户银行
     */
    @JSONField(name = "bank_name")
    private String bankName;

    /**
     * 企业工商营业执照
     */
    @JSONField(name = "business_license_stuff")
    private String businessLicenseStuff;

    /**
     * 申请公函
     */
    @JSONField(name = "application_letter")
    private String applicationLetter;

    /**
     * 其他证明材料
     */
    @JSONField(name = "other_stuff")
    private String otherStuff;

    /**
     * 运营者姓名
     */
    @JSONField(name = "mp_operator_name")
    private String mpOperatorName;

    /**
     * 运营者身份证号码
     */
    @JSONField(name = "mp_operator_idcard_number")
    private String mpOperatorIdcardNumber;

    /**
     * 运营者手机号
     */
    @JSONField(name = "mp_operator_phone")
    private String mpOperatorPhone;

    /**
     * 公众号运营者座机
     */
    @JSONField(name = "mp_operator_tel")
    private String mpOperatorTel;

    /**
     * 公众号运营者电子邮箱
     */
    @JSONField(name = "mp_operator_email")
    private String mpOperatorEmail;


    public QualificationPart() {
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(String registeredId) {
        this.registeredId = registeredId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBusinessLicenseStuff() {
        return businessLicenseStuff;
    }

    public void setBusinessLicenseStuff(String businessLicenseStuff) {
        this.businessLicenseStuff = businessLicenseStuff;
    }

    public String getApplicationLetter() {
        return applicationLetter;
    }

    public void setApplicationLetter(String applicationLetter) {
        this.applicationLetter = applicationLetter;
    }

    public String getOtherStuff() {
        return otherStuff;
    }

    public void setOtherStuff(String otherStuff) {
        this.otherStuff = otherStuff;
    }

    public String getMpOperatorName() {
        return mpOperatorName;
    }

    public void setMpOperatorName(String mpOperatorName) {
        this.mpOperatorName = mpOperatorName;
    }

    public String getMpOperatorIdcardNumber() {
        return mpOperatorIdcardNumber;
    }

    public void setMpOperatorIdcardNumber(String mpOperatorIdcardNumber) {
        this.mpOperatorIdcardNumber = mpOperatorIdcardNumber;
    }

    public String getMpOperatorPhone() {
        return mpOperatorPhone;
    }

    public void setMpOperatorPhone(String mpOperatorPhone) {
        this.mpOperatorPhone = mpOperatorPhone;
    }

    public String getMpOperatorTel() {
        return mpOperatorTel;
    }

    public void setMpOperatorTel(String mpOperatorTel) {
        this.mpOperatorTel = mpOperatorTel;
    }

    public String getMpOperatorEmail() {
        return mpOperatorEmail;
    }

    public void setMpOperatorEmail(String mpOperatorEmail) {
        this.mpOperatorEmail = mpOperatorEmail;
    }

    @Override
    public String toString() {
        return "QualificationPart{" +
                "customerType=" + customerType +
                ", name='" + name + '\'' +
                ", registeredId='" + registeredId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", bankName='" + bankName + '\'' +
                ", businessLicenseStuff='" + businessLicenseStuff + '\'' +
                ", applicationLetter='" + applicationLetter + '\'' +
                ", otherStuff='" + otherStuff + '\'' +
                ", mpOperatorName='" + mpOperatorName + '\'' +
                ", mpOperatorIdcardNumber='" + mpOperatorIdcardNumber + '\'' +
                ", mpOperatorPhone='" + mpOperatorPhone + '\'' +
                ", mpOperatorTel='" + mpOperatorTel + '\'' +
                ", mpOperatorEmail='" + mpOperatorEmail + '\'' +
                '}';
    }
}
