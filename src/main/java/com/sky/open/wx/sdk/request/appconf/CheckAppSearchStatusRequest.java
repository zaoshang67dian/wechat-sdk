package com.sky.open.wx.sdk.request.appconf;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.CheckAppSearchStatusResponse;

/**
 * 查询小程序当前隐私设置（是否可被搜索）
 * @date 2018/5/3 15:26
 */
public class CheckAppSearchStatusRequest extends WechatRequest<CheckAppSearchStatusResponse> {

    public CheckAppSearchStatusRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.GET_APP_SEARCH_STATUS;
    }

    @Override
    public Class<CheckAppSearchStatusResponse> getResponseClass() {
        return CheckAppSearchStatusResponse.class;
    }
}
