package com.sky.open.wx.sdk.request.apprelease;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.AppRollbackResponse;

/**
 * 小程序发布回退
 * @date 2018/5/7 17:48
 */
public class AppRollbackRequest extends WechatRequest<AppRollbackResponse> {

    public AppRollbackRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.APP_RELEASE_ROLLBACK;
    }

    @Override
    public Class<AppRollbackResponse> getResponseClass() {
        return AppRollbackResponse.class;
    }
}
