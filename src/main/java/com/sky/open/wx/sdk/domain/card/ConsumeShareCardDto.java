package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * @author shipj
 * @create 2017-11-27-17:04
 */

public class ConsumeShareCardDto extends WechatObject {
    private static final long serialVersionUID = 2648834858762737913L;

    @JSONField(name = "num")
    private Integer num;

    @JSONField(name = "card_id")
    private String cardId;

    public ConsumeShareCardDto() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ConsumeShareCardDto{" +
                "num=" + num +
                ", cardId='" + cardId + '\'' +
                '}';
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
