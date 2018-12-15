package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 微信公众号音乐消息
 * @date 2018/3/8 16:21
 */
public class MusicMsgDto extends WechatObject {

    private static final long serialVersionUID = -3996061508996126344L;
    /**
     * 图文消息/视频消息/音乐消息/小程序卡片的标题（选填）
     */
    @JSONField(name = "title")
    private String title;

    /**
     * 图文消息/视频消息/音乐消息的描述 （选填）
     */
    @JSONField(name = "description")
    private String description;

    /**
     * 音乐链接 （必填）
     */
    @JSONField(name = "musicurl")
    private String musicUrl;

    /**
     * 高品质音乐链接，wifi环境优先使用该链接播放音乐 （必填）
     */
    @JSONField(name = "hqmusicurl")
    private String hqMusicUrl;

    /**
     * 缩略图/小程序卡片图片的媒体ID，小程序卡片图片建议大小为520*416 （必填）
     */
    @JSONField(name = "thumb_media_id")
    private String thumbMediaId;

    public MusicMsgDto() {
    }

    public MusicMsgDto(String title, String description, String musicUrl, String hqMusicUrl, String thumbMediaId) {
        this.title = title;
        this.description = description;
        this.musicUrl = musicUrl;
        this.hqMusicUrl = hqMusicUrl;
        this.thumbMediaId = thumbMediaId;
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

    public String getMusicUrl() {
        return musicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
    }

    public String getHqMusicUrl() {
        return hqMusicUrl;
    }

    public void setHqMusicUrl(String hqMusicUrl) {
        this.hqMusicUrl = hqMusicUrl;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    @Override
    public String toString() {
        return "MusicMsgDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", musicUrl='" + musicUrl + '\'' +
                ", hqMusicUrl='" + hqMusicUrl + '\'' +
                ", thumbMediaId='" + thumbMediaId + '\'' +
                '}';
    }
}
