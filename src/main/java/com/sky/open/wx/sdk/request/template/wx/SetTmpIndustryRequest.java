package com.sky.open.wx.sdk.request.template.wx;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.wx.SetTmpIndustryResponse;

/**
 * 设置模板消息行业
 *
 * @author shipj
 * @create 2017-12-27-16:54
 */

public class SetTmpIndustryRequest extends WechatRequest<SetTmpIndustryResponse> {

    /**
     * 公众号模板消息所属行业编号
     */
    @JSONField(name = "industry_id1")
    private String industryId1;
    /**
     * 公众号模板消息所属行业编号
     */
    @JSONField(name = "industry_id2")
    private String industryId2;

    public SetTmpIndustryRequest() {
        this.requestUrl = RequestUrlConst.SET_INDUSTR;
        this.getMethod = false;
    }

    public String getIndustryId1() {
        return industryId1;
    }

    public void setIndustryId1(String industryId1) {
        this.industryId1 = industryId1;
    }

    public String getIndustryId2() {
        return industryId2;
    }

    public void setIndustryId2(String industryId2) {
        this.industryId2 = industryId2;
    }

    @Override
    public String toString() {
        return "SetTmpIndustryRequest{" +
                "industryId1='" + industryId1 + '\'' +
                ", industryId2='" + industryId2 + '\'' +
                '}';
    }

    @Override
    public Class<SetTmpIndustryResponse> getResponseClass() {
        return SetTmpIndustryResponse.class;
    }
}
