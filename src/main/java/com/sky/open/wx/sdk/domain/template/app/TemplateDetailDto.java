package com.sky.open.wx.sdk.domain.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 模板消息详细内容
 *
 * @author shipj
 * @create 2017-12-15-15:19
 */

public class TemplateDetailDto extends WechatObject {

    private static final long serialVersionUID = 8161171976859448290L;
    /**
     * 添加至帐号下的模板id，发送小程序模板消息时所需
     */
    @JSONField(name = "template_id")
    private String templateId;
    /**
     * 模板标题
     */
    @JSONField(name = "title")
    private String title;
    /**
     * 模板内容
     */
    @JSONField(name = "content")
    private String content;
    /**
     * 模板内容示例
     */
    @JSONField(name = "example")
    private String example;

    public TemplateDetailDto() {
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
        return "TemplateDetailDto{" +
                "templateId='" + templateId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
