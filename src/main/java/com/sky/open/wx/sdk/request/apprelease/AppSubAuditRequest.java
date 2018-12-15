package com.sky.open.wx.sdk.request.apprelease;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.apprelease.AuditItem;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.AppSubAuditResponse;

import java.util.List;

/**
 * 小程序提交微信审核
 * @date 2018/5/7 15:25
 */
public class AppSubAuditRequest extends WechatRequest<AppSubAuditResponse> {

    /**
     * 提交审核项的一个列表（至少填写1项，至多填写5项）
     */
    @JSONField(name = "item_list")
    private List<AuditItem> itemList;

    public AppSubAuditRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_SUB_AUDIT;
    }

    public List<AuditItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<AuditItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "AppSubAuditRequest{" +
                "itemList=" + itemList +
                '}';
    }

    @Override
    public Class<AppSubAuditResponse> getResponseClass() {
        return AppSubAuditResponse.class;
    }
}
