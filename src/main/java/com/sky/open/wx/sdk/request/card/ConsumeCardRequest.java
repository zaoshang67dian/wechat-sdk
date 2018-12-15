package com.sky.open.wx.sdk.request.card;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.card.ConsumeCardResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 核销卡券请求
 *
 * @author shipj
 * @create 2017-12-07-11:15
 */

public class ConsumeCardRequest extends WechatRequest<ConsumeCardResponse>{
    @JSONField(name = "card_id")
    private String cardId;
    @JSONField(name = "code")
    private String code;

    public ConsumeCardRequest() {
        this.requestUrl = RequestUrlConst.CARD_CONSUME;
        this.getMethod = false;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public Class<ConsumeCardResponse> getResponseClass() {
        return ConsumeCardResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("card_id",cardId);
        requestMap.put("code",code);

        return JSON.toJSONString(requestMap);
    }

    @Override
    public String toString() {
        return "ConsumeCardRequest{" +
                "cardId='" + cardId + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
