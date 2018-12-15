package com.sky.open.wx.sdk.response.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.merchant.MerchantAudit;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 查询门店小程序审核结果
 *
 * @author shipj
 * @create 2017-12-15-23:20
 */

public class MerchantAuditStatusResponse extends WechatResponse {

    private static final long serialVersionUID = -2278980789434306219L;
    /**
     * 创建的门店小程序的审核状态信息，注意，一个认证公众号只能创建一个门店小程序，一个门店小程序可以创建多个门店
     */
    @JSONField(name = "data")
    private MerchantAudit data;

    public MerchantAuditStatusResponse() {
    }

    public MerchantAudit getData() {
        return data;
    }

    public void setData(MerchantAudit data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MerchantAuditStatusResponse{" +
                "data=" + data +
                '}';
    }
}
