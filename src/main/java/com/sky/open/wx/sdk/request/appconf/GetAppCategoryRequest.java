package com.sky.open.wx.sdk.request.appconf;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.GetAppCategoryResponse;

/**
 * 获取小程序已经添加的类目信息
 * @date 2018/5/3 14:24
 */
public class GetAppCategoryRequest extends WechatRequest<GetAppCategoryResponse> {

    public GetAppCategoryRequest(){
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.GET_APP_CATEGORY;
    }

    @Override
    public Class<GetAppCategoryResponse> getResponseClass() {
        return GetAppCategoryResponse.class;
    }
}
