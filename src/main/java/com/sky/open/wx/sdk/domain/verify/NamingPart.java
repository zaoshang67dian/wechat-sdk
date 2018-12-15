package com.sky.open.wx.sdk.domain.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 命名认证部分
 * @date 2018/5/21 15:46
 */
public class NamingPart extends WechatObject {

    private static final long serialVersionUID = 6467999253030747294L;
    /**
     * 名称
     */
    @JSONField(name = "nick_name")
    private String nickName;

    /**
     * 名称类型（1：基于商标，6：基于媒体，11：基于自选）
     */
    @JSONField(name = "naming_type")
    private Integer namingType;

    /**
     * 名称基于商标时，必填（商标注册证）
     */
    @JSONField(name = "brand_register_stuff")
    private String brandRegisterStuff;

    /**
     * 名称基于商标时，选填（商标授权书）
     */
    @JSONField(name = "brand_auth_stuff")
    private String brandAuthStuff;

    /**
     * 基于商标时，选填（商标授权书）
     */
    @JSONField(name = "brand_auth_stuff1")
    private String brandAuthStuff1;

    /**
     * 基于商标时，选填（商标授权书）
     */
    @JSONField(name = "brand_auth_stuff2")
    private String brandAuthStuff2;

    /**
     * 基于商标时，选填（商标授权书）
     */
    @JSONField(name = "brand_auth_stuff3")
    private String brandAuthStuff3;

    /**
     * 基于商标时，选填（商标授权书）
     */
    @JSONField(name = "brand_auth_stuff4")
    private String brandAuthStuff4;

    /**
     * 基于媒体时，选填(基于媒体命名提交的资料)
     */
    @JSONField(name = "naming_media_licesnse_stuff")
    private String namingMediaLicesnseStuff;

    /**
     * 基于媒体时，选填(基于媒体命名提交的资料)
     */
    @JSONField(name = "naming_media_licesnse_stuff1")
    private String namingMediaLicesnseStuff1;

    /**
     * 基于媒体时，选填(基于媒体命名提交的资料)
     */
    @JSONField(name = "naming_media_licesnse_stuff2")
    private String namingMediaLicesnseStuff2;

    /**
     * 基于媒体时，选填(基于媒体命名提交的资料)
     */
    @JSONField(name = "naming_media_licesnse_stuff3")
    private String namingMediaLicesnseStuff3;

    /**
     * 基于媒体时，选填(基于媒体命名提交的资料)
     */
    @JSONField(name = "naming_media_licesnse_stuff4")
    private String namingMediaLicesnseStuff4;

    /**
     * 命中关键词时可选填（命中关键词需使用检测名称接口获取）
     */
    @JSONField(name = "naming_keyword_stuff")
    private String namingKeywordStuff;

    /**
     * 命中关键词时可选填（命中关键词需使用检测名称接口获取）
     */
    @JSONField(name = "naming_keyword_stuff1")
    private String namingKeywordStuff1;

    /**
     * 命中关键词时可选填（命中关键词需使用检测名称接口获取）
     */
    @JSONField(name = "naming_keyword_stuff2")
    private String namingKeywordStuff2;

    /**
     * 命中关键词时可选填（命中关键词需使用检测名称接口获取）
     */
    @JSONField(name = "naming_keyword_stuff3")
    private String namingKeywordStuff3;

    /**
     * 命中关键词时可选填（命中关键词需使用检测名称接口获取）
     */
    @JSONField(name = "naming_keyword_stuff4")
    private String namingKeywordStuff4;

    public NamingPart() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getNamingType() {
        return namingType;
    }

    public void setNamingType(Integer namingType) {
        this.namingType = namingType;
    }

    public String getBrandRegisterStuff() {
        return brandRegisterStuff;
    }

    public void setBrandRegisterStuff(String brandRegisterStuff) {
        this.brandRegisterStuff = brandRegisterStuff;
    }

    public String getBrandAuthStuff() {
        return brandAuthStuff;
    }

    public void setBrandAuthStuff(String brandAuthStuff) {
        this.brandAuthStuff = brandAuthStuff;
    }

    public String getBrandAuthStuff1() {
        return brandAuthStuff1;
    }

    public void setBrandAuthStuff1(String brandAuthStuff1) {
        this.brandAuthStuff1 = brandAuthStuff1;
    }

    public String getBrandAuthStuff2() {
        return brandAuthStuff2;
    }

    public void setBrandAuthStuff2(String brandAuthStuff2) {
        this.brandAuthStuff2 = brandAuthStuff2;
    }

    public String getBrandAuthStuff3() {
        return brandAuthStuff3;
    }

    public void setBrandAuthStuff3(String brandAuthStuff3) {
        this.brandAuthStuff3 = brandAuthStuff3;
    }

    public String getBrandAuthStuff4() {
        return brandAuthStuff4;
    }

    public void setBrandAuthStuff4(String brandAuthStuff4) {
        this.brandAuthStuff4 = brandAuthStuff4;
    }

    public String getNamingMediaLicesnseStuff() {
        return namingMediaLicesnseStuff;
    }

    public void setNamingMediaLicesnseStuff(String namingMediaLicesnseStuff) {
        this.namingMediaLicesnseStuff = namingMediaLicesnseStuff;
    }

    public String getNamingMediaLicesnseStuff1() {
        return namingMediaLicesnseStuff1;
    }

    public void setNamingMediaLicesnseStuff1(String namingMediaLicesnseStuff1) {
        this.namingMediaLicesnseStuff1 = namingMediaLicesnseStuff1;
    }

    public String getNamingMediaLicesnseStuff2() {
        return namingMediaLicesnseStuff2;
    }

    public void setNamingMediaLicesnseStuff2(String namingMediaLicesnseStuff2) {
        this.namingMediaLicesnseStuff2 = namingMediaLicesnseStuff2;
    }

    public String getNamingMediaLicesnseStuff3() {
        return namingMediaLicesnseStuff3;
    }

    public void setNamingMediaLicesnseStuff3(String namingMediaLicesnseStuff3) {
        this.namingMediaLicesnseStuff3 = namingMediaLicesnseStuff3;
    }

    public String getNamingMediaLicesnseStuff4() {
        return namingMediaLicesnseStuff4;
    }

    public void setNamingMediaLicesnseStuff4(String namingMediaLicesnseStuff4) {
        this.namingMediaLicesnseStuff4 = namingMediaLicesnseStuff4;
    }

    public String getNamingKeywordStuff() {
        return namingKeywordStuff;
    }

    public void setNamingKeywordStuff(String namingKeywordStuff) {
        this.namingKeywordStuff = namingKeywordStuff;
    }

    public String getNamingKeywordStuff1() {
        return namingKeywordStuff1;
    }

    public void setNamingKeywordStuff1(String namingKeywordStuff1) {
        this.namingKeywordStuff1 = namingKeywordStuff1;
    }

    public String getNamingKeywordStuff2() {
        return namingKeywordStuff2;
    }

    public void setNamingKeywordStuff2(String namingKeywordStuff2) {
        this.namingKeywordStuff2 = namingKeywordStuff2;
    }

    public String getNamingKeywordStuff3() {
        return namingKeywordStuff3;
    }

    public void setNamingKeywordStuff3(String namingKeywordStuff3) {
        this.namingKeywordStuff3 = namingKeywordStuff3;
    }

    public String getNamingKeywordStuff4() {
        return namingKeywordStuff4;
    }

    public void setNamingKeywordStuff4(String namingKeywordStuff4) {
        this.namingKeywordStuff4 = namingKeywordStuff4;
    }

    @Override
    public String toString() {
        return "NamingPart{" +
                "nickName='" + nickName + '\'' +
                ", namingType=" + namingType +
                ", brandRegisterStuff='" + brandRegisterStuff + '\'' +
                ", brandAuthStuff='" + brandAuthStuff + '\'' +
                ", brandAuthStuff1='" + brandAuthStuff1 + '\'' +
                ", brandAuthStuff2='" + brandAuthStuff2 + '\'' +
                ", brandAuthStuff3='" + brandAuthStuff3 + '\'' +
                ", brandAuthStuff4='" + brandAuthStuff4 + '\'' +
                ", namingMediaLicesnseStuff='" + namingMediaLicesnseStuff + '\'' +
                ", namingMediaLicesnseStuff1='" + namingMediaLicesnseStuff1 + '\'' +
                ", namingMediaLicesnseStuff2='" + namingMediaLicesnseStuff2 + '\'' +
                ", namingMediaLicesnseStuff3='" + namingMediaLicesnseStuff3 + '\'' +
                ", namingMediaLicesnseStuff4='" + namingMediaLicesnseStuff4 + '\'' +
                ", namingKeywordStuff='" + namingKeywordStuff + '\'' +
                ", namingKeywordStuff1='" + namingKeywordStuff1 + '\'' +
                ", namingKeywordStuff2='" + namingKeywordStuff2 + '\'' +
                ", namingKeywordStuff3='" + namingKeywordStuff3 + '\'' +
                ", namingKeywordStuff4='" + namingKeywordStuff4 + '\'' +
                '}';
    }
}
