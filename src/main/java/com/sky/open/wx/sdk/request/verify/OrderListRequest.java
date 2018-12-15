package com.sky.open.wx.sdk.request.verify;


import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.verify.OrderListResponse;

/**
 * @date 2018/5/21 17:11
 */
public class OrderListRequest extends WechatRequest<OrderListResponse> {

    public OrderListRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.ORDER_LIST;
    }

    @Override
    public String getPostBody() {
        return JSON.toJSONString(new Object());
    }


    @Override
    public Class<OrderListResponse> getResponseClass() {
        return OrderListResponse.class;
    }
}
