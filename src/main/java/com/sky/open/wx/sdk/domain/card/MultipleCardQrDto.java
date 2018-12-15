package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * @author shipj@ctrip.com
 * @date 2018/3/5 10:43
 */
public class MultipleCardQrDto extends WechatObject {

    private static final long serialVersionUID = 4351419791346995407L;
    /**
     * 领取多个卡券需要设置
     */
    @JSONField(name = "card_list")
    private List<CardQrDto> cardList;

    public MultipleCardQrDto() {
    }

    public MultipleCardQrDto(List<CardQrDto> cardList) {
        this.cardList = cardList;
    }

    public List<CardQrDto> getCardList() {
        return cardList;
    }

    public void setCardList(List<CardQrDto> cardList) {
        this.cardList = cardList;
    }

    @Override
    public String toString() {
        return "MultipleCardQrDto{" +
                "cardList=" + cardList +
                '}';
    }
}
