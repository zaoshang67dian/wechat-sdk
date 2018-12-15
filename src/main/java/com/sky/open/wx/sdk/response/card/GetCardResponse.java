package com.sky.open.wx.sdk.response.card;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 获取微信卡券响应
 *
 * @author shipj
 * @create 2017-11-27-9:39
 */

public class GetCardResponse extends WechatResponse {
    private static final long serialVersionUID = 7435163912501818246L;

    @JSONField(name = "card")
    private JSONObject card;

    public GetCardResponse() {
    }

    public JSONObject getCard() {
        return card;
    }

    public void setCard(JSONObject card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "GetCardResponse{" +
                "card=" + card +
                '}';
    }
}
