package com.sky.open.wx.sdk.request.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.app.AppTemplateKeyListResponse;

/**
 * 获取模板库某个模板标题下关键词库，请求内容
 *
 * @author shipj
 * @create 2017-12-15-11:26
 */

public class AppTemplateKeyListRequest extends WechatRequest<AppTemplateKeyListResponse> {

    /**
     * 模板标题id，可通过接口获取，也可登录小程序后台查看获取
     */
    @JSONField(name = "id")
    private String id;

    public AppTemplateKeyListRequest() {
        this.requestUrl = RequestUrlConst.APP_TMP_KEY_LIST;
        this.getMethod = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AppTemplateKeyListRequest{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public Class<AppTemplateKeyListResponse> getResponseClass() {
        return AppTemplateKeyListResponse.class;
    }
}
