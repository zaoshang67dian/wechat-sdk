package com.sky.open.wx.sdk.response.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.verify.Order;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 获取订单信息响应
 * @date 2018/5/21 16:32
 */
public class CheckOrderInfoResponse extends WechatResponse {

    private static final long serialVersionUID = -4012258951527139720L;
    /**
     * 订单信息
     */
    @JSONField(name = "order")
    private Order order;

    public CheckOrderInfoResponse() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "CheckOrderInfoResponse{" +
                "order=" + order +
                '}';
    }
}
