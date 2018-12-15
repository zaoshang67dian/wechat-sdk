package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 获取微信卡券领取二维码信息
 * @date 2018/3/5 10:32
 */
public class ActionInfoDto extends WechatObject {

    private static final long serialVersionUID = -8004024660319813513L;
    /**
     * 扫描二维码领取单张卡券时需要填写的需要领取的卡券信息
     */
    @JSONField(name = "card")
    private CardQrDto cardQrDto;

    /**
     * 扫描二维码领取多张卡券时需要填写的需要领取的卡券信息
     */
    @JSONField(name = "multiple_card")
    private MultipleCardQrDto multipleCardQrDto;

    public ActionInfoDto() {
    }

    public ActionInfoDto(CardQrDto cardQrDto, MultipleCardQrDto multipleCardQrDto) {
        this.cardQrDto = cardQrDto;
        this.multipleCardQrDto = multipleCardQrDto;
    }

    public CardQrDto getCardQrDto() {
        return cardQrDto;
    }

    public void setCardQrDto(CardQrDto cardQrDto) {
        this.cardQrDto = cardQrDto;
    }

    public MultipleCardQrDto getMultipleCardQrDto() {
        return multipleCardQrDto;
    }

    public void setMultipleCardQrDto(MultipleCardQrDto multipleCardQrDto) {
        this.multipleCardQrDto = multipleCardQrDto;
    }

    @Override
    public String toString() {
        return "ActionInfoDto{" +
                "cardQrDto=" + cardQrDto +
                ", multipleCardQrDto=" + multipleCardQrDto +
                '}';
    }
}
