package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * 图文消息列表
 * @date 2018/3/8 16:30
 */
public class NewsListMsgDto extends WechatObject {

    private static final long serialVersionUID = 1719963042368695952L;
    /**
     * 图文列表
     */
    @JSONField(name = "articles")
    private List<NewsMsgDto> articles;

    public NewsListMsgDto() {
    }

    public NewsListMsgDto(List<NewsMsgDto> articles) {
        this.articles = articles;
    }

    public List<NewsMsgDto> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsMsgDto> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "NewsListMsgDto{" +
                "articles=" + articles +
                '}';
    }
}
