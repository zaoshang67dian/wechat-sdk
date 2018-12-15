package com.sky.open.wx.sdk.domain.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 模板内容
 *
 * @author shipj
 * @create 2017-12-15-16:27
 */

public class KeywordDto extends WechatObject {

    private static final long serialVersionUID = 9024127154327643465L;
    /**
     * 模板的内容
     */
    @JSONField(name = "value")
    private String value;

    /**
     * 模板内容字体的颜色，不填默认黑色
     */
    @JSONField(name = "color")
    private String color;

    public KeywordDto() {
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
        return "KeywordDto{" +
                "value='" + value + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
