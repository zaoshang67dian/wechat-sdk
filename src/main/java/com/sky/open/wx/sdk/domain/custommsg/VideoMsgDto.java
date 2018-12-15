package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 微信公众号发送视频客服消息
 * @date 2018/3/8 16:18
 */
public class VideoMsgDto extends WechatObject {

    private static final long serialVersionUID = 224732002471744130L;
    /**
     * 发送的图片/语音/视频/图文消息（点击跳转到图文消息页）的媒体ID
     */
    @JSONField(name = "media_id")
    private String mediaId;

    /**
     * 缩略图/小程序卡片图片的媒体ID，小程序卡片图片建议大小为520*416
     */
    @JSONField(name = "thumb_media_id")
    private String thumbMediaId;

    /**
     *  图文消息/视频消息/音乐消息/小程序卡片的标题
     */
    @JSONField(name = "title")
    private String title;

    /**
     * 图文消息/视频消息/音乐消息的描述
     */
    @JSONField(name = "description")
    private String description;

    public VideoMsgDto() {
    }

    public VideoMsgDto(String mediaId, String thumbMediaId, String title, String description) {
        this.mediaId = mediaId;
        this.thumbMediaId = thumbMediaId;
        this.title = title;
        this.description = description;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
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

    @Override
    public String toString() {
        return "VideoMsgDto{" +
                "mediaId='" + mediaId + '\'' +
                ", thumbMediaId='" + thumbMediaId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
