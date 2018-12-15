package com.sky.open.wx.sdk.request.card;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sky.open.wx.sdk.domain.card.BaseInfoDto;
import com.sky.open.wx.sdk.domain.card.CardDto;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.internal.utils.StringUtils;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.card.CreateCardResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建微信卡券请求
 *
 * @author shipj
 * @create 2017-11-16-10:52
 */

public class CreateCardRequest extends WechatRequest<CreateCardResponse>{

    private CardDto cardDto;

    public CreateCardRequest() {
        this.requestUrl = RequestUrlConst.CARD_CREATE;
        this.getMethod = false;
    }

    @Override
    public Class<CreateCardResponse> getResponseClass() {
        return CreateCardResponse.class;
    }

    @Override
    public String getPostBody() {
        //防止卡券类型出现空指针异常
        String cardType = cardDto.getCardType();
        if(StringUtils.isEmpty(cardType)){
            cardType = "GENERAL_COUPON";
        }
        Map<String,Object> body = new HashMap<>();
        Map<String,Object> card = new HashMap<>();
        Map<String,Object> cardDetail = new HashMap<>();
        card.put("card_type",cardType);
        cardDetail.put("base_info",getBaseInfo(cardDto.getBaseInfoDto()));
        cardDetail.put("advanced_info",cardDto.getAdvancedInfoDto());
        card.put(cardType.toLowerCase(),cardDetail);

        //region **** 根据不同的卡券类型添加不同的特定信息
        switch (cardDto.getCardType()){
            case "GROUPON":
                cardDetail.put("deal_detail",cardDto.getDealDetail());
                break;
            case "CASH":
                cardDetail.put("least_cost",cardDto.getLeastCost());
                cardDetail.put("reduce_cost",cardDto.getReduceCost());
                break;
            case "DISCOUNT":
                cardDetail.put("discount",cardDto.getDiscount());
                break;
            case "GIFT":
                cardDetail.put("gift",cardDto.getGift());
                cardDetail.put("gift_name",cardDto.getGiftName());
                cardDetail.put("gift_num",cardDto.getGiftNum());
                cardDetail.put("gift_unit",cardDto.getGiftUnit());
                break;
            case "GENERAL_COUPON":
                cardDetail.put("default_detail",cardDto.getDefaultDetail());
                break;
            default:
                break;

        }
        //endregion

        body.put("card",card);

        return JSON.toJSONString(body);
    }

    public CardDto getCardDto() {
        return cardDto;
    }

    public void setCardDto(CardDto cardDto) {
        this.cardDto = cardDto;
    }

    private JSONObject getBaseInfo(BaseInfoDto baseInfoDto){
        String baseInfo = JSON.toJSONString(baseInfoDto);
        JSONObject baseObj = JSON.parseObject(baseInfo);
        if(baseInfoDto.getLocationIdList() == null || baseInfoDto.getLocationIdList().length <= 0){
            baseObj.put("location_id_list","0");
        }
        return baseObj;
    }
}
