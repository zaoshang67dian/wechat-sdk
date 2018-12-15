package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.GetBindTestersResponse;

/**
 * 获取全部体验者
 * @date 2018/5/3 19:57
 */
public class GetBindTestersRequest extends WechatRequest<GetBindTestersResponse> {

    /**
     * 动作，默认：get_experiencer
     */
    @JSONField(name = "action")
    private String action;

    public GetBindTestersRequest() {
        this.action = "get_experiencer";
        this.requestUrl = RequestUrlConst.GET_MINI_APP_TESTERS;
        this.getMethod = false;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "GetBindTestersRequest{" +
                "action='" + action + '\'' +
                '}';
    }

    @Override
    public Class<GetBindTestersResponse> getResponseClass() {
        return GetBindTestersResponse.class;
    }
}
