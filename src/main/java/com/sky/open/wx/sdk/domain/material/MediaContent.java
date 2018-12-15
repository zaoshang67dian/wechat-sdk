package com.sky.open.wx.sdk.domain.material;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * 媒体信息的具体内容
 *
 * @author shipj
 * @create 2017-12-28-20:30
 */

public class MediaContent extends WechatObject {

    private static final long serialVersionUID = -956600249080537186L;
    /**
     * 图文素材中的媒体信息列表
     */
    @JSONField(name = "news_item")
    private List<NewsMaterial> newsItem;

    public MediaContent() {
    }

    public MediaContent(List<NewsMaterial> newsItem) {
        this.newsItem = newsItem;
    }

    public List<NewsMaterial> getNewsItem() {
        return newsItem;
    }

    public void setNewsItem(List<NewsMaterial> newsItem) {
        this.newsItem = newsItem;
    }

    @Override
    public String toString() {
        return "MediaContent{" +
                "newsItem=" + newsItem +
                '}';
    }
}
