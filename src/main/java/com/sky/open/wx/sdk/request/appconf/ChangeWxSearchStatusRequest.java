package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.ChangeWxSearchStatusResponse;

/**
 * 设置小程序隐私设置（是否可被搜索）
 * @date 2018/5/3 15:19
 */
public class ChangeWxSearchStatusRequest extends WechatRequest<ChangeWxSearchStatusResponse> {

    /**
     * 1表示不可搜索，0表示可搜索
     */
    @JSONField(name = "status")
    private Integer status;

    public ChangeWxSearchStatusRequest() {
        this.getMethod  = false;
        this.requestUrl = RequestUrlConst.SET_APP_SEARCH_STATUS;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ChangeWxSearchStatusRequest{" +
                "status=" + status +
                '}';
    }

    @Override
    public Class<ChangeWxSearchStatusResponse> getResponseClass() {
        return ChangeWxSearchStatusResponse.class;
    }
}
