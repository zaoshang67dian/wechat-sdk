package com.sky.open.wx.sdk.response.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 组合模板并添加至帐号下的个人模板库
 *
 * @author shipj
 * @create 2017-12-15-12:54
 */

public class AppTemplateAddResponse extends WechatResponse {

    private static final long serialVersionUID = 5882473847012850885L;
    /**
     * 添加至帐号下的模板id，发送小程序模板消息时所需
     */
    @JSONField(name = "template_id")
    private String templateId;

    public AppTemplateAddResponse() {
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public String toString() {
        return "AppTemplateAddResponse{" +
                "templateId='" + templateId + '\'' +
                '}';
    }
}
