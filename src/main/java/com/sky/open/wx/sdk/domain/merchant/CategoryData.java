package com.sky.open.wx.sdk.domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 门店类目
 *
 * @author shipj
 * @create 2017-12-15-18:40
 */

public class CategoryData extends WechatObject {

    private static final long serialVersionUID = 8682331782314736183L;
    @JSONField(name = "all_category_info")
    private AllCategoryInfo allCategoryInfo;

    public CategoryData() {
    }

    public AllCategoryInfo getAllCategoryInfo() {
        return allCategoryInfo;
    }

    public void setAllCategoryInfo(AllCategoryInfo allCategoryInfo) {
        this.allCategoryInfo = allCategoryInfo;
    }

    @Override
    public String toString() {
        return "CategoryData{" +
                "allCategoryInfo=" + allCategoryInfo +
                '}';
    }
}
