package com.sky.open.wx.sdk.response.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 获取订单支付二维码
 * @date 2018/5/21 17:03
 */
public class GetPayQrcodeResposne extends WechatResponse {

    private static final long serialVersionUID = 8249623771095548989L;
    /**
     * 支付二维码地址
     */
    @JSONField(name = "pay_qrcode_url")
    private String payQrcodeUrl;

    public GetPayQrcodeResposne() {
    }

    public String getPayQrcodeUrl() {
        return payQrcodeUrl;
    }

    public void setPayQrcodeUrl(String payQrcodeUrl) {
        this.payQrcodeUrl = payQrcodeUrl;
    }

    @Override
    public String toString() {
        return "GetPayQrcodeResposne{" +
                "payQrcodeUrl='" + payQrcodeUrl + '\'' +
                '}';
    }
}
