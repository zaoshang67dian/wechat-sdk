package com.sky.open.wx.sdk.response.statistics.imagetext;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.statistics.imagetext.ArticleDto;
import com.sky.open.wx.sdk.response.WechatResponse;


import java.util.List;

/**
 * 获取图文群发每日数据
 *
 * @author shipj
 * @create 2017-12-08-19:56
 */

public class ArticleTotalResponse extends WechatResponse {

    private static final long serialVersionUID = -1082725426585522491L;
    @JSONField(name = "list")
    private List<ArticleDto> list;

    public ArticleTotalResponse() {
    }

    public ArticleTotalResponse(List<ArticleDto> list) {
        this.list = list;
    }

    public List<ArticleDto> getList() {
        return list;
    }

    public void setList(List<ArticleDto> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ArticleTotalResponse{" +
                "list=" + list +
                '}';
    }
}
