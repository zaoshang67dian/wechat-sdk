package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * @author shipj
 * @create 2017-11-15-19:52
 */

public class ModifyCardStockDto extends WechatObject {
    private static final long serialVersionUID = 2379602803664652675L;

    @JSONField(name = "card_id")
    private String cardId;

    @JSONField(name = "increase_stock_value")
    private int increaseStockValue;

    @JSONField(name = "reduce_stock_value")
    private int reduceStockValue;

    public ModifyCardStockDto() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getIncreaseStockValue() {
        return increaseStockValue;
    }

    public void setIncreaseStockValue(int increaseStockValue) {
        this.increaseStockValue = increaseStockValue;
    }

    public int getReduceStockValue() {
        return reduceStockValue;
    }

    public void setReduceStockValue(int reduceStockValue) {
        this.reduceStockValue = reduceStockValue;
    }

    @Override
    public String toString() {
        return "{" +
                "cardId='" + cardId + '\'' +
                ", increaseStockValue=" + increaseStockValue +
                ", reduceStockValue=" + reduceStockValue +
                '}';
    }
}
