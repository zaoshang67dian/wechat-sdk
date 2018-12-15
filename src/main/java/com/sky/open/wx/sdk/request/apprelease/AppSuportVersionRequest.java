package com.sky.open.wx.sdk.request.apprelease;


import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.AppSuportVersionResponse;

/**
 * 查询当前设置的最低基础库版本及各版本用户占比 （仅供第三方代小程序调用）
 * @date 2018/5/8 16:59
 */
public class AppSuportVersionRequest extends WechatRequest<AppSuportVersionResponse> {

    public AppSuportVersionRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_VERSION_DATA;
    }

    @Override
    public String getPostBody() throws WechatApiException {
        return JSON.toJSONString(new Object());
    }

    @Override
    public Class<AppSuportVersionResponse> getResponseClass() {
        return AppSuportVersionResponse.class;
    }
}
