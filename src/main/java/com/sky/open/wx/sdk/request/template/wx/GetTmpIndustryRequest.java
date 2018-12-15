package com.sky.open.wx.sdk.request.template.wx;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.wx.GetTmpIndustryResponse;

/**
 * 获取账号设置的行业信息
 *
 * @author shipj
 * @create 2017-12-27-17:12
 */

public class GetTmpIndustryRequest extends WechatRequest<GetTmpIndustryResponse> {

    public GetTmpIndustryRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.GET_INDUSTR;
    }

    @Override
    public Class<GetTmpIndustryResponse> getResponseClass() {
        return GetTmpIndustryResponse.class;
    }
}
