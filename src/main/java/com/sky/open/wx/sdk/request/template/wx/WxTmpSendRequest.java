package com.sky.open.wx.sdk.request.template.wx;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.template.wx.KeyWord;
import com.sky.open.wx.sdk.domain.template.wx.MiniProgram;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.wx.WxTmpSendResponse;

import java.util.Map;

/**
 * 发送微信公众号模板消息请求体
 *
 * @author shipj
 * @create 2017-12-27-17:40
 */

public class WxTmpSendRequest extends WechatRequest<WxTmpSendResponse> {

    /**
     * 接收者openid
     */
    @JSONField(name = "touser")
    private String toUser;
    /**
     * 模板ID
     */
    @JSONField(name = "template_id")
    private String templateId;
    /**
     * 模板跳转链接
     */
    @JSONField(name = "url")
    private String url;
    /**
     * 跳小程序所需数据，不需跳小程序可不用传该数据
     */
    @JSONField(name = "miniprogram")
    private MiniProgram miniProgram;
    /**
     * 模板数据
     */
    @JSONField(name = "data")
    private Map<String, KeyWord> data;

    public WxTmpSendRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.TMP_SEND;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MiniProgram getMiniProgram() {
        return miniProgram;
    }

    public void setMiniProgram(MiniProgram miniProgram) {
        this.miniProgram = miniProgram;
    }

    public Map<String, KeyWord> getData() {
        return data;
    }

    public void setData(Map<String, KeyWord> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WxTmpSendRequest{" +
                "toUser='" + toUser + '\'' +
                ", templateId='" + templateId + '\'' +
                ", url='" + url + '\'' +
                ", miniProgram=" + miniProgram +
                ", data=" + data +
                '}';
    }

    @Override
    public Class<WxTmpSendResponse> getResponseClass() {
        return WxTmpSendResponse.class;
    }
}
