package com.sky.open.wx.sdk.response.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.apprelease.AppSetedCategory;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 获取小程序已经设置的可用来选择的类目列表
 * @date 2018/5/7 15:01
 */
public class AppAllSetedCateResponse extends WechatResponse {

    private static final long serialVersionUID = -746387426333568934L;
    /**
     * 可填选的类目列表
     */
    @JSONField(name = "category_list")
    private List<AppSetedCategory> categoryList;

    public AppAllSetedCateResponse() {
    }

    public List<AppSetedCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<AppSetedCategory> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public String toString() {
        return "AppAllSetedCateResponse{" +
                "categoryList=" + categoryList +
                '}';
    }
}
