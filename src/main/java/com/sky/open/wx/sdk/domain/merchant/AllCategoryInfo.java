package com.sky.open.wx.sdk.domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.List;

/**
 * 门限小程序全部类目信息
 *
 * @author shipj
 * @create 2017-12-15-18:37
 */

public class AllCategoryInfo extends WechatObject {

    private static final long serialVersionUID = 6290021943259244740L;
    /**
     * 全部信息
     */
    @JSONField(name = "categories")
    private List<MerchantCategoryDto> categories;

    public AllCategoryInfo() {
    }

    public List<MerchantCategoryDto> getCategories() {
        return categories;
    }

    public void setCategories(List<MerchantCategoryDto> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "AllCategoryInfo{" +
                "categories=" + categories +
                '}';
    }
}
