package com.sky.open.wx.sdk.response.card;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.card.CheckCodeCardDto;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 核销卡券响应
 *
 * @author shipj
 * @create 2017-12-07-11:12
 */

public class ConsumeCardResponse extends WechatResponse {

    private static final long serialVersionUID = 9021664519572864769L;

    @JSONField(name = "card")
    private CheckCodeCardDto card;
    @JSONField(name = "cardid")
    private String cardid;

    public ConsumeCardResponse() {

    }

    public CheckCodeCardDto getCard() {
        return card;
    }

    public void setCard(CheckCodeCardDto card) {
        this.card = card;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    @Override
    public String toString() {
        return "ConsumeCardResponse{" +
                "card=" + card +
                ", cardid='" + cardid + '\'' +
                '}';
    }
}
