package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 微信公众号语音消息
 * @date 2018/3/8 16:15
 */
public class VoiceMsgDto extends WechatObject {

    private static final long serialVersionUID = 8432933877888588385L;
    /**
     * 语音消息的素材id
     */
    @JSONField(name = "media_id")
    private String mediaId;

    public VoiceMsgDto() {
    }

    public VoiceMsgDto(String mediaId) {
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
        return "VoiceMsgDto{" +
                "mediaId='" + mediaId + '\'' +
                '}';
    }
}
