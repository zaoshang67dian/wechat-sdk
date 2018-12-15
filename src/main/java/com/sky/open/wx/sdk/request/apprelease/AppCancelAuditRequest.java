package com.sky.open.wx.sdk.request.apprelease;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.AppCancelAuditResponse;

/**
 * 单个帐号每天审核撤回次数最多不超过1次，一个月不超过10次
 * @date 2018/6/12 9:50
 */
public class AppCancelAuditRequest extends WechatRequest<AppCancelAuditResponse> {

    public AppCancelAuditRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.APP_CANSEL_AUDIT;
    }

    @Override
    public Class<AppCancelAuditResponse> getResponseClass() {
        return AppCancelAuditResponse.class;
    }
}
