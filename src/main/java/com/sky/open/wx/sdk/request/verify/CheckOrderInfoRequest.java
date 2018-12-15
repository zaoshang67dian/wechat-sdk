package com.sky.open.wx.sdk.request.verify;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.verify.CheckOrderInfoResponse;

/**
 * 获取订单信息
 * @date 2018/5/21 16:55
 */
public class CheckOrderInfoRequest extends WechatRequest<CheckOrderInfoResponse> {

    /**
     * 订单编号
     */
    @JSONField(name = "order_id")
    private String orderId;

    public CheckOrderInfoRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.CHECK_ORDER_INFO;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "CheckOrderInfoRequest{" +
                "orderId='" + orderId + '\'' +
                '}';
    }

    @Override
    public Class<CheckOrderInfoResponse> getResponseClass() {
        return CheckOrderInfoResponse.class;
    }
}
