package com.sky.open.wx.sdk.request.card;

import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.card.CheckCodeResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 下旬微信code接口
 *
 * @author shipj
 * @create 2017-12-06-14:56
 */

public class CheckCodeRequest extends WechatRequest<CheckCodeResponse> {

    private String cardId;
    private String code;
    private Boolean checkConsume;

    public CheckCodeRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.GET_CARD_CODE;
    }

    public CheckCodeRequest(String cardId, String code, Boolean checkConsume) {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.GET_CARD_CODE;
        this.cardId = cardId;
        this.code = code;
        this.checkConsume = checkConsume;
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

    public Boolean getCheckConsume() {
        return checkConsume;
    }

    public void setCheckConsume(Boolean checkConsume) {
        this.checkConsume = checkConsume;
    }

    @Override
    public Class<CheckCodeResponse> getResponseClass() {
        return CheckCodeResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("card_id",cardId);
        requestMap.put("code",code);
        requestMap.put("check_consume",checkConsume);

        return JSON.toJSONString(requestMap);
    }
}
