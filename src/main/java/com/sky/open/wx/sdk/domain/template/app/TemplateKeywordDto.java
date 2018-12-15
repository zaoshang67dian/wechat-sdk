package com.sky.open.wx.sdk.domain.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 模板消息关键词内容
 *
 * @author shipj
 * @create 2017-12-15-11:21
 */

public class TemplateKeywordDto extends WechatObject {

    private static final long serialVersionUID = -7931614025881733585L;
    /**
     * 关键词id，添加模板时需要
     */
    @JSONField(name = "keyword_id")
    private Integer keywordId;
    /**
     * 关键词内容
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 关键词内容对应的示例
     */
    @JSONField(name = "example")
    private String example;

    public TemplateKeywordDto() {
    }

    public Integer getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Integer keywordId) {
        this.keywordId = keywordId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "TemplateKeywordDto{" +
                "keywordId=" + keywordId +
                ", name='" + name + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
