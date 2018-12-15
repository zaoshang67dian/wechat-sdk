package com.sky.open.wx.sdk.request.appconf;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.AllCategoryResponse;

/**
 * 获取账号可以设置的全部门类信息
 * @date 2018/5/4 10:17
 */
public class AllCategoryRequest extends WechatRequest<AllCategoryResponse>{

    public AllCategoryRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.GET_ALL_CATEGORY;
    }

    @Override
    public Class<AllCategoryResponse> getResponseClass() {
        return AllCategoryResponse.class;
    }
}
