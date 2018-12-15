package com.sky.open.wx.sdk.request.card;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.card.DecryptCodeResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 解码微信code请求
 *
 * @author shipj
 * @create 2017-12-07-11:30
 */

public class DecryptCodeRequest extends WechatRequest<DecryptCodeResponse>{

    @JSONField(name = "encrypt_code")
    private String encryptCode;

    public DecryptCodeRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.DECRYPT_CODE;
    }

    public String getEncryptCode() {
        return encryptCode;
    }

    public void setEncryptCode(String encryptCode) {
        this.encryptCode = encryptCode;
    }

    @Override
    public Class<DecryptCodeResponse> getResponseClass() {
        return DecryptCodeResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("encrypt_code",encryptCode);
        return JSON.toJSONString(requestMap);
    }
}
