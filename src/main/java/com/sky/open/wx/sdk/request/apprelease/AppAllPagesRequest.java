package com.sky.open.wx.sdk.request.apprelease;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.AppAllPagesResponse;

/**
 * 获取小程序的第三方提交代码的页面配置
 * @date 2018/5/7 15:14
 */
public class AppAllPagesRequest extends WechatRequest<AppAllPagesResponse> {

    public AppAllPagesRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.APP_COMMIT_PAGES;
    }

    @Override
    public Class<AppAllPagesResponse> getResponseClass() {
        return AppAllPagesResponse.class;
    }
}
