package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.DelCategoryResponse;

/**
 * 删除类目请求
 * @date 2018/5/4 11:16
 */
public class DelCategoryRequest extends WechatRequest<DelCategoryResponse> {

    /**
     * 需要删除的一级类目的ID
     */
    @JSONField(name = "first")
    private Integer first;

    /**
     * 需要删除类目的二级类目ID
     */
    @JSONField(name = "second")
    private Integer second;

    public DelCategoryRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.DEL_OLD_CATEGORY;
    }

    public DelCategoryRequest(Integer first, Integer second) {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.DEL_OLD_CATEGORY;
        this.first = first;
        this.second = second;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    @Override
    public Class<DelCategoryResponse> getResponseClass() {
        return DelCategoryResponse.class;
    }
}
