package com.sky.open.wx.sdk.domain.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 微信小程序模板消息基本内容
 *
 * @author shipj
 * @create 2017-12-15-10:17
 */

public class TemplateInfoDto extends WechatObject {

    private static final long serialVersionUID = -8583382373516056996L;
    //模板标题id（获取模板标题下的关键词库时需要）
    @JSONField(name = "id")
    private String id;
    //模板标题内容
    @JSONField(name = "title")
    private String title;

    public TemplateInfoDto() {
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

    @Override
    public String toString() {
        return "TemplateInfoDto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
