package com.sky.open.wx.sdk.request.merchant;

import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.domain.merchant.ApplyMerchantDto;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.merchant.ApplyMerchantResponse;

/**
 * 创建门店小程序
 *
 * @author shipj
 * @create 2017-12-06-11:23
 */

public class ApplyMerchantRequest extends WechatRequest<ApplyMerchantResponse> {

    private ApplyMerchantDto applyMerchantDto;

    public ApplyMerchantRequest() {
        this.requestUrl = RequestUrlConst.APPLY_MERCHANT;
        this.getMethod = false;
    }

    public ApplyMerchantDto getApplyMerchantDto() {
        return applyMerchantDto;
    }

    public void setApplyMerchantDto(ApplyMerchantDto applyMerchantDto) {
        this.applyMerchantDto = applyMerchantDto;
    }

    @Override
    public Class<ApplyMerchantResponse> getResponseClass() {
        return ApplyMerchantResponse.class;
    }

    @Override
    public String getPostBody() {
        return JSON.toJSONString(applyMerchantDto);
    }

}
