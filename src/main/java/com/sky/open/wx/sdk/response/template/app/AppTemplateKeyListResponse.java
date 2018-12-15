package com.sky.open.wx.sdk.response.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.template.app.TemplateKeywordDto;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 获取模板库某个模板标题下关键词库，响应内容
 *
 * @author shipj
 * @create 2017-12-15-11:18
 */

public class AppTemplateKeyListResponse extends WechatResponse {

    private static final long serialVersionUID = 5500028414276715349L;
    /**
     * 模板标题id，可通过接口获取，也可登录小程序后台查看获取
     */
    @JSONField(name = "id")
    private String id;
    /**
     * 模板的标题
     */
    @JSONField(name = "title")
    private String title;
    /**
     * 模板的关键词列表
     */
    @JSONField(name = "keyword_list")
    private List<TemplateKeywordDto> keywordList;

    public AppTemplateKeyListResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TemplateKeywordDto> getKeywordList() {
        return keywordList;
    }

    public void setKeywordList(List<TemplateKeywordDto> keywordList) {
        this.keywordList = keywordList;
    }

    @Override
    public String toString() {
        return "AppTemplateKeyListResponse{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", keywordList=" + keywordList +
                '}';
    }
}
