package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;

import com.sky.open.wx.sdk.domain.appconf.CategoryList;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 获取小程序可以设置的全部门类信息
 * @date 2018/5/4 10:12
 */
public class AllCategoryResponse extends WechatResponse {

    private static final long serialVersionUID = 5893676453668538084L;
    /**
     * 类目列表
     */
    @JSONField(name = "categories_list")
    private CategoryList categoryList;

    public AllCategoryResponse() {
    }

    public CategoryList getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(CategoryList categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public String toString() {
        return "AllCategoryResponse{" +
                "categoryList=" + categoryList +
                '}';
    }
}
