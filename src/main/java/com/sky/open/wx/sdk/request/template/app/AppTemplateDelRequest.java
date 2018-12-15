package com.sky.open.wx.sdk.request.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.app.AppTemplateDelResponse;

/**
 * 删除帐号下的某个模板
 *
 * @author shipj
 * @create 2017-12-15-15:55
 */

public class AppTemplateDelRequest extends WechatRequest<AppTemplateDelResponse> {

    /**
     * 要删除的模板id
     */
    @JSONField(name = "template_id")
    private String templateId;

    public AppTemplateDelRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_TMP_DEL;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public String toString() {
        return "AppTemplateDelRequest{" +
                "templateId='" + templateId + '\'' +
                '}';
    }

    @Override
    public Class<AppTemplateDelResponse> getResponseClass() {
        return AppTemplateDelResponse.class;
    }
}
