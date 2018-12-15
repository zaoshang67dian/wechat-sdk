package com.sky.open.wx.sdk.response.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.merchant.CategoryData;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 拉取门店小程序类目
 *
 * @author shipj
 * @create 2017-12-15-18:35
 */

public class GetMerchantCategoryResponse extends WechatResponse {

    private static final long serialVersionUID = 3105526924219505066L;
    @JSONField(name = "data")
    private CategoryData data;

    public GetMerchantCategoryResponse() {
    }

    public CategoryData getData() {
        return data;
    }

    public void setData(CategoryData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetMerchantCategoryResponse{" +
                "data=" + data +
                '}';
    }
}
