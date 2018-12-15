package com.sky.open.wx.sdk.domain.template.wx;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 模板消息详情
 *
 * @author shipj
 * @create 2017-12-27-17:28
 */

public class TemplateInfo extends WechatObject {

    private static final long serialVersionUID = -7506670961882029802L;
    /**
     * 模板ID
     */
    @JSONField(name = "template_id")
    private String templateId;
    /**
     * 模板标题
     */
    @JSONField(name = "title")
    private String title;
    /**
     * 模板所属行业的一级行业
     */
    @JSONField(name = "primary_industry")
    private String primaryIndustry;
    /**
     * 模板所属行业的二级行业
     */
    @JSONField(name = "deputy_industry")
    private String deputyIndustry;
    /**
     * 模板内容
     */
    @JSONField(name = "content")
    private String content;
    /**
     * 模板示例
     */
    @JSONField(name = "example")
    private String example;

    public TemplateInfo() {
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrimaryIndustry() {
        return primaryIndustry;
    }

    public void setPrimaryIndustry(String primaryIndustry) {
        this.primaryIndustry = primaryIndustry;
    }

    public String getDeputyIndustry() {
        return deputyIndustry;
    }

    public void setDeputyIndustry(String deputyIndustry) {
        this.deputyIndustry = deputyIndustry;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "TemplateInfo{" +
                "templateId='" + templateId + '\'' +
                ", title='" + title + '\'' +
                ", primaryIndustry='" + primaryIndustry + '\'' +
                ", deputyIndustry='" + deputyIndustry + '\'' +
                ", content='" + content + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
