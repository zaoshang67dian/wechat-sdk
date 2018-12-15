package com.sky.open.wx.sdk.response.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.card.CheckCodeCardDto;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 查询微信code响应接口
 *
 * @author shipj
 * @create 2017-12-06-14:56
 */

public class CheckCodeResponse extends WechatResponse {
    private static final long serialVersionUID = 2424208248370643891L;

    @JSONField(name = "card")
    private CheckCodeCardDto card;
    @JSONField(name = "openid")
    private String openid;
    @JSONField(name = "can_consume")
    private Boolean canConsume;
    @JSONField(name = "user_card_status")
    private String userCardStatus;

    public CheckCodeResponse(){}

    public CheckCodeCardDto getCard() {
        return card;
    }

    public void setCard(CheckCodeCardDto card) {
        this.card = card;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Boolean getCanConsume() {
        return canConsume;
    }

    public void setCanConsume(Boolean canConsume) {
        this.canConsume = canConsume;
    }

    public String getUserCardStatus() {
        return userCardStatus;
    }

    public void setUserCardStatus(String userCardStatus) {
        this.userCardStatus = userCardStatus;
    }

    @Override
    public String toString() {
        return "CheckCodeResponse{" +
                "card=" + card +
                ", openid='" + openid + '\'' +
                ", canConsume=" + canConsume +
                ", userCardStatus='" + userCardStatus + '\'' +
                '}';
    }
}
