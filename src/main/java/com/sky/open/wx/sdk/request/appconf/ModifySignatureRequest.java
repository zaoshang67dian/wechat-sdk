package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.ModifySignatureResponse;

/**
 * 修改功能介绍接口
 * @date 2018/4/16 18:40
 */
public class ModifySignatureRequest extends WechatRequest<ModifySignatureResponse>{

    /**
     * 功能介绍（简介）
     */
    @JSONField(name = "signature")
    private String signature;

    public ModifySignatureRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.MODIFY_APP_SIG;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "ModifySignatureRequest{" +
                "signature='" + signature + '\'' +
                '}';
    }

    @Override
    public Class<ModifySignatureResponse> getResponseClass() {
        return ModifySignatureResponse.class;
    }
}
