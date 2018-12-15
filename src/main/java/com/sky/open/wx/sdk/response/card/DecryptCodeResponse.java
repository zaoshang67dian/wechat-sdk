package com.sky.open.wx.sdk.response.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 解码微信卡券code
 *
 * @author shipj
 * @create 2017-12-07-11:28
 */

public class DecryptCodeResponse extends WechatResponse {
    private static final long serialVersionUID = 4342723945577419486L;

    @JSONField(name = "code")
    private String code;

    public DecryptCodeResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "DecryptCodeResponse{" +
                "code='" + code + '\'' +
                '}';
    }
}
