package com.sky.open.wx.sdk.domain.template.wx;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 模板消息信息
 *
 * @author shipj
 * @create 2017-12-27-17:57
 */

public class KeyWord extends WechatObject {

    private static final long serialVersionUID = -5967481569416753070L;
    /**
     * 模板消息关键词的内容
     */
    @JSONField(name = "value")
    private String value;
    /**
     * 模板消息关键词的颜色
     */
    @JSONField(name = "color")
    private String color;

    public KeyWord() {
    }

    public KeyWord(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "KeyWord{" +
                "value='" + value + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
