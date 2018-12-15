package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 图文消息
 * @date 2018/3/8 16:26
 */
public class NewsMsgDto extends WechatObject {

    private static final long serialVersionUID = -9007828454619845084L;
    /**
     * 图文消息/视频消息/音乐消息/小程序卡片的标题
     */
    @JSONField(name = "title")
    private String title;

    /**
     * 图文消息/视频消息/音乐消息的描述
     */
    @JSONField(name = "description")
    private String description;

    /**
     * 图文消息被点击后跳转的链接（选填）
     */
    @JSONField(name = "url")
    private String url;

    /**
     * 图文消息的图片链接，支持JPG、PNG格式，较好的效果为大图640*320，小图80*80（选填）
     */
    @JSONField(name = "picurl")
    private String picurl;

    public NewsMsgDto() {
    }

    public NewsMsgDto(String title, String description, String url, String picurl) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.picurl = picurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    @Override
    public String toString() {
        return "NewsMsgDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", picurl='" + picurl + '\'' +
                '}';
    }
}
