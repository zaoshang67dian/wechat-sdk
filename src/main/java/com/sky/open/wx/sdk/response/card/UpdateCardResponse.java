package com.sky.open.wx.sdk.response.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 更新卡券响应
 *
 * @author shipj
 * @create 2017-11-16-16:19
 */

public class UpdateCardResponse extends WechatResponse {
    private static final long serialVersionUID = -5394643552911325868L;

    @JSONField(name = "send_check")
    private boolean sendCheck;

    public UpdateCardResponse() {
    }

    public boolean isSendCheck() {
        return sendCheck;
    }

    public void setSendCheck(boolean sendCheck) {
        this.sendCheck = sendCheck;
    }

    @Override
    public String toString() {
        return "UpdateCardResponse{" +
                "sendCheck=" + sendCheck +
                '}';
    }
}
