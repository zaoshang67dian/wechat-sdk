package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 微信认证信息
 * @date 2018/4/12 18:25
 */
public class WxVerifyInfo extends WechatObject {

    private static final long serialVersionUID = -4911238729211467147L;
    /**
     * 是否资质认证（true：是，false：否）若是，拥有微信认证相关的权限
     */
    @JSONField(name = "qualification_verify")
    private Boolean qualificationVerify;
    /**
     * 是否名称认证（true：是，false：否）对于公众号（订阅号、服务号），是名称认证，微信客户端才会有微信认证打勾的标识。
     */
    @JSONField(name = "naming_verify")
    private Boolean namingVerify;
    /**
     * 是否需要年审（true：是，false：否）（qualification_verify = true时才有该字段）
     */
    @JSONField(name = "annual_review")
    private Boolean annualReview;
    /**
     * 年审开始时间，时间戳（qualification_verify = true时才有该字段）
     */
    @JSONField(name = "annual_review_begin_time")
    private Long annualReviewBeginTime;
    /**
     * 年审截止时间，时间戳（qualification_verify = true时才有该字段）
     */
    @JSONField(name = "annual_review_end_time")
    private Long annualReviewEndTime;

    public WxVerifyInfo() {
    }

    public Boolean getQualificationVerify() {
        return qualificationVerify;
    }

    public void setQualificationVerify(Boolean qualificationVerify) {
        this.qualificationVerify = qualificationVerify;
    }

    public Boolean getNamingVerify() {
        return namingVerify;
    }

    public void setNamingVerify(Boolean namingVerify) {
        this.namingVerify = namingVerify;
    }

    public Boolean getAnnualReview() {
        return annualReview;
    }

    public void setAnnualReview(Boolean annualReview) {
        this.annualReview = annualReview;
    }

    public Long getAnnualReviewBeginTime() {
        return annualReviewBeginTime;
    }

    public void setAnnualReviewBeginTime(Long annualReviewBeginTime) {
        this.annualReviewBeginTime = annualReviewBeginTime;
    }

    public Long getAnnualReviewEndTime() {
        return annualReviewEndTime;
    }

    public void setAnnualReviewEndTime(Long annualReviewEndTime) {
        this.annualReviewEndTime = annualReviewEndTime;
    }

    @Override
    public String toString() {
        return "WxVerifyInfo{" +
                "qualificationVerify=" + qualificationVerify +
                ", namingVerify=" + namingVerify +
                ", annualReview=" + annualReview +
                ", annualReviewBeginTime=" + annualReviewBeginTime +
                ", annualReviewEndTime=" + annualReviewEndTime +
                '}';
    }
}
