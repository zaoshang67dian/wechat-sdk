package com.sky.open.wx.sdk.request.apprelease;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.VisitStatusChangeResponse;

/**
 * 更新小程序线上可见状态
 * @date 2018/5/7 17:33
 */
public class VisitStatusChangeRequest extends WechatRequest<VisitStatusChangeResponse> {

    /**
     * 设置可访问状态，发布后默认可访问，close为不可见，open为可见
     */
    @JSONField(name = "action")
    private String action;

    public VisitStatusChangeRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_VISIT_STATUS_CHANGE;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "VisitStatusChangeRequest{" +
                "action='" + action + '\'' +
                '}';
    }

    @Override
    public Class<VisitStatusChangeResponse> getResponseClass() {
        return VisitStatusChangeResponse.class;
    }
}
