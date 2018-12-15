package com.sky.open.wx.sdk.request.apprelease;

import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.ReleaseAppResponse;

/**
 * 发布审核通过的小程序
 * @date 2018/5/7 17:25
 */
public class ReleaseAppRequest extends WechatRequest<ReleaseAppResponse> {

    public ReleaseAppRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_RELEASE;
    }

    @Override
    public String getPostBody() throws WechatApiException {
        return JSON.toJSONString(new Object());
    }

    @Override
    public Class<ReleaseAppResponse> getResponseClass() {
        return ReleaseAppResponse.class;
    }
}
