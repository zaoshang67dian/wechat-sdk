package com.sky.open.wx.sdk.request.card;

import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.domain.card.ModifyCardStockDto;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.card.ModifyCardStockResponse;

/**
 * @author shipj
 * @create 2017-11-15-19:44
 */

public class ModifyCardStockRequest extends WechatRequest<ModifyCardStockResponse> {

    private ModifyCardStockDto modifyCardStockDto;

    public ModifyCardStockRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.MODIFY_CARD_STOCK;
    }

    public ModifyCardStockDto getModifyCardStockDto() {
        return modifyCardStockDto;
    }

    public void setModifyCardStockDto(ModifyCardStockDto modifyCardStockDto) {
        this.modifyCardStockDto = modifyCardStockDto;
    }

    @Override
    public Class<ModifyCardStockResponse> getResponseClass() {
        return ModifyCardStockResponse.class;
    }

    @Override
    public String getPostBody() {
        return JSON.toJSONString(modifyCardStockDto);
    }
}
