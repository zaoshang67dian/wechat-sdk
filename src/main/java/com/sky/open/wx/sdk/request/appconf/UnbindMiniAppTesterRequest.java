package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.UnbindMiniAppTesterResponse;

/**
 * 解除绑定小程序的体验者
 * @date 2018/5/3 20:02
 */
public class UnbindMiniAppTesterRequest extends WechatRequest<UnbindMiniAppTesterResponse>{

    /**
     * 需要解绑定的用户的微信号
     */
    @JSONField(name = "wechatid")
    private String wechatId;

    public UnbindMiniAppTesterRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.UNBIND_MINI_APP_TESTER;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    @Override
    public String toString() {
        return "UnbindMiniAppTesterRequest{" +
                "wechatId='" + wechatId + '\'' +
                '}';
    }

    @Override
    public Class<UnbindMiniAppTesterResponse> getResponseClass() {
        return UnbindMiniAppTesterResponse.class;
    }
}
