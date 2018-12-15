package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.BindMiniAppTesterResponse;

/**
 * 绑定微信用户为小程序体验者
 * @date 2018/5/3 19:42
 */
public class BindMiniAppTesterRequest extends WechatRequest<BindMiniAppTesterResponse> {

    /**
     * 微信号
     */
    @JSONField(name = "wechatid")
    private String wechatId;

    public BindMiniAppTesterRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.BIND_MINI_APP_TESTER;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    @Override
    public Class<BindMiniAppTesterResponse> getResponseClass() {
        return BindMiniAppTesterResponse.class;
    }
}
