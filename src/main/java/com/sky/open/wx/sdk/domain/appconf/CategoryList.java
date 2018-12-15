package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * @date 2018/5/4 10:13
 */
public class CategoryList extends WechatObject {

    private static final long serialVersionUID = -3565895459391921480L;
    /**
     * 类目列表
     */
    @JSONField(name = "categories")
    private List<Category> categories;

    public CategoryList() {
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "CategoryList{" +
                "categories=" + categories +
                '}';
    }
}
