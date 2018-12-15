package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * @author shipj
 * @create 2017-12-06-14:58
 */

public class CheckCodeCardDto extends WechatObject {
    private static final long serialVersionUID = -4216748305964135535L;

    @JSONField(name = "card_id")
    private String cardId;
    @JSONField(name = "begin_time")
    private Long beginTime;
    @JSONField(name = "end_time")
    private Long endTime;

    public CheckCodeCardDto() {
    }

    public CheckCodeCardDto(String cardId, Long beginTime, Long endTime) {
        this.cardId = cardId;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "CheckCodeCardDto{" +
                "cardId='" + cardId + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}
