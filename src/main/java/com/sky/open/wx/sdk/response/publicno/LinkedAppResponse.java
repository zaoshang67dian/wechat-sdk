package com.sky.open.wx.sdk.response.publicno;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.publicno.WxOpen;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 获取公众号关联的小程序
 * @date 2018/6/12 13:54
 */
public class LinkedAppResponse extends WechatResponse {

    private static final long serialVersionUID = 8972362208889482243L;
    /**
     * 公众号关联的小程序
     */
    @JSONField(name = "wxopens")
    private WxOpen wxOpen;

    public LinkedAppResponse() {
    }

    public WxOpen getWxOpen() {
        return wxOpen;
    }

    public void setWxOpen(WxOpen wxOpen) {
        this.wxOpen = wxOpen;
    }

    @Override
    public String toString() {
        return "LinkedAppResponse{" +
                "wxOpen=" + wxOpen +
                '}';
    }
}
