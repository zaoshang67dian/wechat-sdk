package com.sky.open.wx.sdk.request.statistics.imagetext;

import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.statistics.imagetext.ArticleTotalResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 图文统计
 *
 * @author shipj
 * @create 2017-12-08-20:42
 */

public class ArticleTotalRequest extends WechatRequest<ArticleTotalResponse> {

    private String beginDate;
    private String endDate;

    public ArticleTotalRequest() {
        this.requestUrl = RequestUrlConst.GET_ARTICLE_TOTAL;
        this.getMethod = false;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public Class<ArticleTotalResponse> getResponseClass() {
        return ArticleTotalResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("begin_date",beginDate);
        requestMap.put("end_date",endDate);

        return JSON.toJSONString(requestMap);
    }
}
