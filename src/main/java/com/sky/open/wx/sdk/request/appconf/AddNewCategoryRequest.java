package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.appconf.AppCategory;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.AddNewCategoryResponse;


import java.util.List;

/**
 * 为账号添加新的类目
 * @date 2018/5/4 10:54
 */
public class AddNewCategoryRequest extends WechatRequest<AddNewCategoryResponse> {

    /**
     * 需要添加的类目列表
     */
    @JSONField(name = "categories")
    private List<AppCategory> categories;

    public AddNewCategoryRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.ADD_NEW_CATEGORY;
    }

    public List<AppCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<AppCategory> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "AddNewCategoryRequest{" +
                "categories=" + categories +
                '}';
    }

    @Override
    public Class<AddNewCategoryResponse> getResponseClass() {
        return AddNewCategoryResponse.class;
    }
}
