package com.sky.open.wx.sdk.request.verify;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.verify.GetPayQrcodeResposne;

/**
 * 获取指定订单的支付二维码
 * @date 2018/5/21 17:05
 */
public class GetPayQrcodeRequest extends WechatRequest<GetPayQrcodeResposne> {

    /**
     * 订单号
     */
    @JSONField(name = "order_id")
    private String orderId;

    public GetPayQrcodeRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.PAY_QR_CODE;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "GetPayQrcodeRequest{" +
                "orderId='" + orderId + '\'' +
                '}';
    }

    @Override
    public Class<GetPayQrcodeResposne> getResponseClass() {
        return GetPayQrcodeResposne.class;
    }
}
