package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 公众号客服消息，文本类型消息
 * 发送文本消息时，支持插入跳小程序的文字链：
 *      文本内容<a href="http://www.qq.com" data-miniprogram-appid="appid" data-miniprogram-path="pages/index/index">点击跳小程序</a>
 *      说明：
            1.data-miniprogram-appid 项，填写小程序appid，则表示该链接跳小程序；
            2.data-miniprogram-path项，填写小程序路径，路径与app.json中保持一致，可带参数；
            3.对于不支持data-miniprogram-appid 项的客户端版本，如果有herf项，则仍然保持跳href中的网页链接；
            4.data-miniprogram-appid对应的小程序必须与公众号有绑定关系。
 * @date 2018/3/8 16:07
 */
public class TextMsgDto extends WechatObject {

    private static final long serialVersionUID = -1053828027787074315L;
    /**
     * 文本消息的内容
     */
    @JSONField(name = "content")
    private String content;

    public TextMsgDto() {
    }

    public TextMsgDto(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextMsgDto{" +
                "content='" + content + '\'' +
                '}';
    }
}
