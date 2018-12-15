package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 图文
 *
 * @author shipj
 * @create 2017-11-16-14:55
 */

public class TextImageDto extends WechatObject {
    private static final long serialVersionUID = 4955415890235090403L;

    @JSONField(name = "image_url")
    private String imageUrl;

    @JSONField(name = "text")
    private String text;

    public TextImageDto() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextImageDto{" +
                "imageUrl='" + imageUrl + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
