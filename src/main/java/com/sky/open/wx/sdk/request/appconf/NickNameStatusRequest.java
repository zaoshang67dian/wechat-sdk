package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;

import com.sky.open.wx.sdk.response.appconf.NickNameStatusResponse;

/**
 * 小程序改名审核状态查询
 * @date 2018/4/16 14:17
 */
public class NickNameStatusRequest extends WechatRequest<NickNameStatusResponse> {

    /**
     * 审核单id
     */
    @JSONField(name = "audit_id")
    private Integer auditId;

    public NickNameStatusRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.NICK_NAME_STATUS;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    @Override
    public Class<NickNameStatusResponse> getResponseClass() {
        return NickNameStatusResponse.class;
    }

    @Override
    public String toString() {
        return "NickNameStatusRequest{" +
                "auditId=" + auditId +
                '}';
    }
}
