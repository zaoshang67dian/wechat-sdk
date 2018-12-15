package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 图片消息对象
 * @date 2018/3/8 16:12
 */
public class ImageMsgDto extends WechatObject {

    private static final long serialVersionUID = 8266477707896544383L;
    /**
     * 发送的图片/语音/视频/图文消息（点击跳转到图文消息页）的媒体ID
     */
    @JSONField(name = "media_id")
    private String mediaId;

    public ImageMsgDto() {
    }

    public ImageMsgDto(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public String toString() {
        return "ImageMsgDto{" +
                "mediaId='" + mediaId + '\'' +
                '}';
    }
}
