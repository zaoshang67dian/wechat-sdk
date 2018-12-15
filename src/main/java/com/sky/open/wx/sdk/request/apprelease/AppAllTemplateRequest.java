package com.sky.open.wx.sdk.request.apprelease;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.AppAllTemplateResponse;

/**
 * 获取第三方创建的全部小程序模板
 * @date 2018/5/7 14:28
 */
public class AppAllTemplateRequest extends WechatRequest<AppAllTemplateResponse>{

    public AppAllTemplateRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.APP_TEMP_LIST;
    }

    @Override
    public Class<AppAllTemplateResponse> getResponseClass() {
        return AppAllTemplateResponse.class;
    }
}
