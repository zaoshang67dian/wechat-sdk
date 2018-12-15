package com.sky.open.wx.sdk.response.template.wx;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 微信公众号模板消息发送
 *
 * @author shipj
 * @create 2017-12-27-17:38
 */

public class WxTmpSendResponse extends WechatResponse {

    private static final long serialVersionUID = -6216287475321152684L;
    /**
     * 发送的消息id
     */
    @JSONField(name = "msgid")
    private String msgid;

    public WxTmpSendResponse() {
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    @Override
    public String toString() {
        return "WxTmpSendResponse{" +
                "msgid='" + msgid + '\'' +
                '}';
    }
}
