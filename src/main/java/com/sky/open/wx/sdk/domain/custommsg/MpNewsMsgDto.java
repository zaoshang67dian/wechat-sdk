package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * @date 2018/3/8 16:33
 */
public class MpNewsMsgDto extends WechatObject {

    private static final long serialVersionUID = -1970567169218333694L;
    /**
     * 消息媒体id
     */
    @JSONField(name = "media_id")
    private String mediaId;

    public MpNewsMsgDto() {
    }

    public MpNewsMsgDto(String mediaId) {
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
        return "MpNewsMsgDto{" +
                "mediaId='" + mediaId + '\'' +
                '}';
    }
}
