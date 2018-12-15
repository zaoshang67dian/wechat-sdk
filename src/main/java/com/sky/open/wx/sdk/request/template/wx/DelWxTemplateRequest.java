package com.sky.open.wx.sdk.request.template.wx;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.wx.DelWxTemplateResponse;

/**
 * 删除微信公众号模板
 *
 * @author shipj
 * @create 2017-12-27-18:19
 */

public class DelWxTemplateRequest extends WechatRequest<DelWxTemplateResponse> {

    /**
     * 需要删除的公众号的模板id
     */
    @JSONField(name = "template_id")
    private String templateId;

    public DelWxTemplateRequest() {
        this.requestUrl = RequestUrlConst.DEL_TMP_ID;
        this.getMethod = false;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public String toString() {
        return "DelWxTemplateRequest{" +
                "templateId='" + templateId + '\'' +
                '}';
    }

    @Override
    public Class<DelWxTemplateResponse> getResponseClass() {
        return DelWxTemplateResponse.class;
    }
}
