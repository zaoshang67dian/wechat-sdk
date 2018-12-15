package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 代金券特殊信息
 *
 * @author shipj
 * @create 2017-11-16-14:29
 */

public class PayInfoDto extends WechatObject {
    private static final long serialVersionUID = -4283938646284558022L;

    @JSONField(name = "swipe_card")
    private SwipeCardDto swipeCardDto;

    public PayInfoDto() {
    }

    public SwipeCardDto getSwipeCardDto() {
        return swipeCardDto;
    }

    public void setSwipeCardDto(SwipeCardDto swipeCardDto) {
        this.swipeCardDto = swipeCardDto;
    }

    @Override
    public String toString() {
        return "PayInfoDto{" +
                "swipeCardDto=" + swipeCardDto +
                '}';
    }
}
