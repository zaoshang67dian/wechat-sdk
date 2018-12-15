package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.appconf.AppCategory;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 获取账号已经设置的所有类目
 * @date 2018/5/3 11:04
 */
public class GetAppCategoryResponse extends WechatResponse {

    private static final long serialVersionUID = 6805202972637200972L;
    /**
     * 小程序已经设置的门类列表
     */
    @JSONField(name = "categories")
    private List<AppCategory> categories;

    /**
     * 一个更改中期内可以设置类目的次数
     */
    @JSONField(name = "limit")
    private Integer limit;

    /**
     * 本周期内还可以设置类目的次数
     */
    @JSONField(name = "quota")
    private Integer quota;

    /**
     * 最多可以设置的类目数量
     */
    @JSONField(name = "category_limit")
    private Integer categoryLimit;

    public GetAppCategoryResponse() {
    }

    public List<AppCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<AppCategory> categories) {
        this.categories = categories;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getCategoryLimit() {
        return categoryLimit;
    }

    public void setCategoryLimit(Integer categoryLimit) {
        this.categoryLimit = categoryLimit;
    }

    @Override
    public String toString() {
        return "GetAppCategoryResponse{" +
                "categories=" + categories +
                ", limit=" + limit +
                ", quota=" + quota +
                ", categoryLimit=" + categoryLimit +
                '}';
    }
}
