package com.sky.open.wx.sdk.domain.material;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 媒体素材
 *
 * @author shipj
 * @create 2017-12-28-20:29
 */

public class Media extends WechatObject {

    private static final long serialVersionUID = 4917354300563143982L;

    /**
     * 图片，语音，视频响应的内容:文件名称
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 这篇图文消息素材的最后更新时间
     */
    @JSONField(name = "update_time")
    private Long updateTime;
    /**
     * 图文页的URL，或者，当获取的列表是图片素材列表时，该字段是图片的URL
     */
    @JSONField(name = "url")
    private String url;

    /**
     * 媒体信息的id
     */
    @JSONField(name = "media_id")
    private String mediaId;
    /**
     * 媒体信息集体内容
     */
    @JSONField(name = "content")
    private MediaContent content;

    public Media() {
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public MediaContent getContent() {
        return content;
    }

    public void setContent(MediaContent content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", url='" + url + '\'' +
                ", mediaId='" + mediaId + '\'' +
                ", content=" + content +
                '}';
    }
}
