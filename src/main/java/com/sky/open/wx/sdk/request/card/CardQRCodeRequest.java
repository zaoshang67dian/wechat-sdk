package com.sky.open.wx.sdk.request.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.card.ActionInfoDto;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.card.CardQRCodeResponse;


/**
 * @date 2018/3/5 10:24
 */
public class CardQRCodeRequest extends WechatRequest<CardQRCodeResponse> {

    /**
     * 用户扫码领取卡券的行为设置：
     * QR_CARD：用户扫码领取单张卡券
     * QR_MULTIPLE_CARD：用户扫码领取多张卡券
     */
    @JSONField(name = "action_name")
    private String actionName;

    /**
     * 卡券有效期，不设置默认为365天
     */
    @JSONField(name = "expire_seconds")
    private Integer expireSeconds;

    /**
     * 根据不同的action_name需要填写的卡券领取信息
     */
    @JSONField(name = "action_info")
    private ActionInfoDto actionInfoDto;

    public CardQRCodeRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.CREATE_CARD_QRCODE;
    }

    public CardQRCodeRequest(String actionName, Integer expireSeconds, ActionInfoDto actionInfoDto) {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.CREATE_CARD_QRCODE;
        this.actionName = actionName;
        this.expireSeconds = expireSeconds;
        this.actionInfoDto = actionInfoDto;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Integer getExpireSeconds() {
        return expireSeconds;
    }

    public void setExpireSeconds(Integer expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public ActionInfoDto getActionInfoDto() {
        return actionInfoDto;
    }

    public void setActionInfoDto(ActionInfoDto actionInfoDto) {
        this.actionInfoDto = actionInfoDto;
    }

    @Override
    public Class<CardQRCodeResponse> getResponseClass() {
        return CardQRCodeResponse.class;
    }
}
