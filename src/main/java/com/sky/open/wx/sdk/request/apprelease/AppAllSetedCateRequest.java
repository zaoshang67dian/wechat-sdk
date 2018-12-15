package com.sky.open.wx.sdk.request.apprelease;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.AppAllSetedCateResponse;

/**
 * 获取小程序已经设置的可用来选择的类目列表
 * @date 2018/5/7 15:03
 */
public class AppAllSetedCateRequest extends WechatRequest<AppAllSetedCateResponse> {

    public AppAllSetedCateRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.APP_SETED_CATE;
    }

    @Override
    public Class<AppAllSetedCateResponse> getResponseClass() {
        return AppAllSetedCateResponse.class;
    }
}
