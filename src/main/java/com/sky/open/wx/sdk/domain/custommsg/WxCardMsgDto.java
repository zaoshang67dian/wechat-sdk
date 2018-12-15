package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 客服消息发送卡券消息
 * 特别注意: 客服消息接口投放卡券仅支持非自定义Code码和导入code模式的卡券的卡券
 * @date 2018/3/8 16:35
 */
public class WxCardMsgDto extends WechatObject {

    private static final long serialVersionUID = 5732133130255717160L;
    /**
     *
     */
    @JSONField(name = "card_id")
    private String cardId;

    public WxCardMsgDto() {
    }

    public WxCardMsgDto(String cardId) {
        this.cardId = cardId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "WxCardMsgDto{" +
                "cardId='" + cardId + '\'' +
                '}';
    }
}
