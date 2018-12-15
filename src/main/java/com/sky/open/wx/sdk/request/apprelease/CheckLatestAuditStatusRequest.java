package com.sky.open.wx.sdk.request.apprelease;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.CheckLatestAuditStatusResponse;

/**
 * 查询最新一次提交的审核状态
 * @date 2018/5/7 15:37
 */
public class CheckLatestAuditStatusRequest extends WechatRequest<CheckLatestAuditStatusResponse> {

    public CheckLatestAuditStatusRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.APP_LATEST_AUDIT_STATUS;
    }

    @Override
    public Class<CheckLatestAuditStatusResponse> getResponseClass() {
        return CheckLatestAuditStatusResponse.class;
    }
}
