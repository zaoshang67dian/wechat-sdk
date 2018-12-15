package com.sky.open.wx.sdk.request.merchant;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.merchant.GetMerchantCategoryResponse;

/**
 * 拉取门店小程序类目
 *
 * @author shipj
 * @create 2017-12-15-19:30
 */

public class GetMerchantCategoryRequest extends WechatRequest<GetMerchantCategoryResponse>{

    public GetMerchantCategoryRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.MERCHANT_CATE_LIST;
    }

    @Override
    public Class<GetMerchantCategoryResponse> getResponseClass() {
        return GetMerchantCategoryResponse.class;
    }
}
