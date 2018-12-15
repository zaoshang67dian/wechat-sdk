package com.sky.open.wx.sdk.request.merchant;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.merchant.MerchantAuditStatusResponse;

/**
 * 获取门店小程序审核状态
 *
 * @author shipj
 * @create 2017-12-15-23:22
 */

public class MerchantAuditStatusRequest extends WechatRequest<MerchantAuditStatusResponse>{

    public MerchantAuditStatusRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.MERCHENT_AUDIT_STATUS;
    }

    @Override
    public Class<MerchantAuditStatusResponse> getResponseClass() {
        return MerchantAuditStatusResponse.class;
    }
}
