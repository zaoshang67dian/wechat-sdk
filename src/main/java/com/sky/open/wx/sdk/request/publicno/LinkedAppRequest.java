package com.sky.open.wx.sdk.request.publicno;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.publicno.LinkedAppResponse;

/**
 * @date 2018/6/12 14:14
 */
public class LinkedAppRequest extends WechatRequest<LinkedAppResponse> {

    public LinkedAppRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.PUBNO_LINK_APP;
    }

    @Override
    public Class<LinkedAppResponse> getResponseClass() {
        return LinkedAppResponse.class;
    }
}
