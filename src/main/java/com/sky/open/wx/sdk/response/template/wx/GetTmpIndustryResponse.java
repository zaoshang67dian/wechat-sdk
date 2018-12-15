package com.sky.open.wx.sdk.response.template.wx;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.template.wx.IndustryClass;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 获取设置的行业信息
 *
 * @author shipj
 * @create 2017-12-27-17:07
 */

public class GetTmpIndustryResponse extends WechatResponse {

    private static final long serialVersionUID = -8207058882276939691L;
    /**
     * 帐号设置的主营行业
     */
    @JSONField(name = "primary_industry")
    private IndustryClass primaryIndustry;
    /**
     * 帐号设置的副营行业
     */
    @JSONField(name = "secondary_industry")
    private IndustryClass secondaryIndustry;

    public GetTmpIndustryResponse() {
    }

    public IndustryClass getPrimaryIndustry() {
        return primaryIndustry;
    }

    public void setPrimaryIndustry(IndustryClass primaryIndustry) {
        this.primaryIndustry = primaryIndustry;
    }

    public IndustryClass getSecondaryIndustry() {
        return secondaryIndustry;
    }

    public void setSecondaryIndustry(IndustryClass secondaryIndustry) {
        this.secondaryIndustry = secondaryIndustry;
    }

    @Override
    public String toString() {
        return "GetTmpIndustryResponse{" +
                "primaryIndustry=" + primaryIndustry +
                ", secondaryIndustry=" + secondaryIndustry +
                '}';
    }
}
