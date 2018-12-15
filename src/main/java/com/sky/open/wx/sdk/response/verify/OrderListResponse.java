package com.sky.open.wx.sdk.response.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.verify.Order;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 订单列表信息
 * @date 2018/5/21 17:10
 */
public class OrderListResponse extends WechatResponse {

    private static final long serialVersionUID = -6649624181694667584L;
    /**
     * 订单列表
     */
    @JSONField(name = "order_list")
    private List<Order> orderList;

    public OrderListResponse() {
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "OrderListResponse{" +
                "orderList=" + orderList +
                '}';
    }
}
