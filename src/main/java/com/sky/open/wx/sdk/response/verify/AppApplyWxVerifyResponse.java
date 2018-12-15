package com.sky.open.wx.sdk.response.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 提交微信认证响应
 * @date 2018/5/21 15:30
 */
public class AppApplyWxVerifyResponse extends WechatResponse {

    private static final long serialVersionUID = -1777779667896321601L;
    /**
     * 提交微信认证后生成的订单信息
     */
    @JSONField(name = "order_id")
    private String orderId;

    public AppApplyWxVerifyResponse() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "AppApplyWxVerifyResponse{" +
                "orderId='" + orderId + '\'' +
                '}';
    }
}
