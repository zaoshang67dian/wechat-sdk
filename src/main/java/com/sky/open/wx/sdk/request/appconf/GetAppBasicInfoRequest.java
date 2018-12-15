package com.sky.open.wx.sdk.request.appconf;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.GetAppBasicInfoResponse;

/**
 * 获取小程序基本信息
 * @date 2018/4/12 18:38
 */
public class GetAppBasicInfoRequest extends WechatRequest<GetAppBasicInfoResponse>{

    public GetAppBasicInfoRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.GET_APP_BASE_INFO;
    }

    @Override
    public Class<GetAppBasicInfoResponse> getResponseClass() {
        return GetAppBasicInfoResponse.class;
    }
}
