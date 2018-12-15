package com.sky.open.wx.sdk.response.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 创建微信卡券响应
 *
 * @author shipj
 * @create 2017-11-16-10:52
 */

public class CreateCardResponse extends WechatResponse {
    private static final long serialVersionUID = -7835880376410873930L;

    @JSONField(name = "card_id")
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "CreateCardResponse{" +
                "cardId='" + cardId + '\'' +
                '}';
    }
}
