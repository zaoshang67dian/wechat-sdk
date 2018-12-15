package com.sky.open.wx.sdk.request.card;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sky.open.wx.sdk.domain.card.BaseInfoDto;
import com.sky.open.wx.sdk.domain.card.CardDto;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.internal.utils.StringUtils;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.card.UpdateCardResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 更新卡券信息
 *
 * @author shipj
 * @create 2017-11-16-16:18
 */

public class UpdateCardRequest extends WechatRequest<UpdateCardResponse>{

    private CardDto cardDto;

    private String cardId;

    public UpdateCardRequest(){
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.UPDATE_CARD_DETAIL;
    }

    @Override
    public Class<UpdateCardResponse> getResponseClass() {
        return UpdateCardResponse.class;
    }

    @Override
    public String getPostBody() {
        //防止卡券类型出现空指针异常
        String cardType = cardDto.getCardType();
        if(StringUtils.isEmpty(cardType)){
            cardType = "GENERAL_COUPON";
        }
        Map<String,Object> body = new HashMap<>();
        body.put("card_id",cardId);
        Map<String,Object> cardDetail = new HashMap<>();
        cardDetail.put("base_info",getBaseInfo(cardDto.getBaseInfoDto()));
        cardDetail.put("advanced_info",cardDto.getAdvancedInfoDto());


        //region **** 只有一下几种类型可以修改特有字段
        switch (cardDto.getCardType()){
            case "MEMBER_CARD":

                break;
            case "BOARDING_PASS":

                break;
            case "MOVIE_TICKET":

                break;
            case "MEETING_TICKET":

                break;
            default:
                break;

        }
        //endregion
        body.put(cardType.toLowerCase(),cardDetail);

        return JSON.toJSONString(body);
    }

    private JSONObject getBaseInfo(BaseInfoDto baseInfoDto){
        String baseInfo = JSON.toJSONString(baseInfoDto);
        JSONObject baseObj = JSON.parseObject(baseInfo);
        if(baseInfoDto.getLocationIdList() == null || baseInfoDto.getLocationIdList().length <= 0){
            baseObj.put("location_id_list","0");
        }
        return baseObj;
    }

    public CardDto getCardDto() {
        return cardDto;
    }

    public void setCardDto(CardDto cardDto) {
        this.cardDto = cardDto;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
