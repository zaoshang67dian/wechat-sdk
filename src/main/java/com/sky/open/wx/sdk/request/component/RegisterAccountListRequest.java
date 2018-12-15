package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.RegisterAccountListResponse;

/**
 * 获取第三方平台创建的全部账号列表
 * @author shipj@ctrip.com
 * @date 2018/5/21 15:11
 */
public class RegisterAccountListRequest extends WechatRequest<RegisterAccountListResponse> {

    /**
     * 第三方平台appid
     */
    @JSONField(name = "component_appid")
    private String componentAppid;

    /**
     * 列表偏移
     */
    @JSONField(name = "offset")
    private Integer offset;

    /**
     * 本次请求获取多少个（最大100）
     */
    @JSONField(name = "count")
    private Integer count;

    public RegisterAccountListRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.REGIST_APP_LIST;
    }

    public String getComponentAppid() {
        return componentAppid;
    }

    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "RegisterAccountListRequest{" +
                "componentAppid='" + componentAppid + '\'' +
                ", offset=" + offset +
                ", count=" + count +
                '}';
    }

    @Override
    public Class<RegisterAccountListResponse> getResponseClass() {
        return RegisterAccountListResponse.class;
    }
}
