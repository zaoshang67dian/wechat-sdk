package com.sky.open.wx.sdk.request.registe;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.registe.FastRegisteByPubResponse;

/**
 * 复用公众号认证资料注册小程序接口
 * @date 2018/4/12 15:55
 */
public class FastRegisteByPubRequest extends WechatRequest<FastRegisteByPubResponse> {

    /**
     * 公众号扫码授权的凭证(公众平台扫码页面回跳到第三方平台时携带)
     */
    @JSONField(name = "ticket")
    private String ticket;

    public FastRegisteByPubRequest() {
        this.requestUrl = RequestUrlConst.FAST_REGISTE_BY_PUB;
        this.getMethod = false;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getTicket() {
        return ticket;
    }

    @Override
    public Class<FastRegisteByPubResponse> getResponseClass() {
        return FastRegisteByPubResponse.class;
    }
}
