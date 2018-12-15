package com.sky.open.wx.sdk.request.common;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.common.GetDistrictListResponse;

/**
 * 从腾讯地图拉取省市区信息
 *
 * @author shipj
 * @create 2017-12-15-23:55
 */

public class GetDistrictListRequest extends WechatRequest<GetDistrictListResponse> {

    public GetDistrictListRequest() {
        this.requestUrl = RequestUrlConst.GET_CITY_LOCATION;
        this.getMethod = true;
    }

    @Override
    public Class<GetDistrictListResponse> getResponseClass() {
        return GetDistrictListResponse.class;
    }
}
