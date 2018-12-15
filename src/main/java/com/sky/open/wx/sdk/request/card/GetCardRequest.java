package com.sky.open.wx.sdk.request.card;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.card.GetCardResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询微信卡券详情
 *
 * @author shipj
 * @create 2017-11-27-9:33
 */

public class GetCardRequest extends WechatRequest<GetCardResponse>{

    @JSONField(name = "card_id")
    private String cardId;

    public GetCardRequest(){
        this.requestUrl = RequestUrlConst.GET_CARD_DETAIL;
        this.getMethod = false;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public Class<GetCardResponse> getResponseClass() {
        return GetCardResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,String> requestMap = new HashMap<>();
        requestMap.put("card_id",cardId);
        return JSON.toJSONString(requestMap);
    }

    @Override
    public String toString() {
        return "GetCardRequest{" +
                "cardId='" + cardId + '\'' +
                '}';
    }
}
