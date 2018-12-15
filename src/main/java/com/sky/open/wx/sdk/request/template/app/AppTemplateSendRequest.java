package com.sky.open.wx.sdk.request.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.template.app.KeywordDto;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.app.AppTemplateSendResponse;

import java.util.Map;

/**
 * 发送小程序模板消息
 *
 * @author shipj
 * @create 2017-12-15-16:23
 */

public class AppTemplateSendRequest extends WechatRequest<AppTemplateSendResponse> {

    /**
     * 接收者（用户）的 openid
     */
    @JSONField(name = "touser")
    private String touser;

    /**
     * 所需下发的模板消息的id
     */
    @JSONField(name = "template_id")
    private String templateId;

    /**
     * 点击模板卡片后的跳转页面，仅限本小程序内的页面。支持带参数,（示例index?foo=bar）。该字段不填则模板无跳转。
     */
    @JSONField(name = "page")
    private String page;

    /**
     * 表单提交场景下，为 submit 事件带上的 formId；支付场景下，为本次支付的 prepay_id
     */
    @JSONField(name = "form_id")
    private String formId;

    /**
     * 模板内容，不填则下发空模板
     */
    @JSONField(name = "data")
    private Map<String, KeywordDto> data;

    /**
     * 模板需要放大的关键词，不填则默认无放大
     */
    @JSONField(name = "emphasis_keyword")
    private String emphasisKeyword;


    public AppTemplateSendRequest() {
        this.requestUrl = RequestUrlConst.APP_TMP_SEND;
        this.getMethod = false;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public Map<String, KeywordDto> getData() {
        return data;
    }

    public void setData(Map<String, KeywordDto> data) {
        this.data = data;
    }

    public String getEmphasisKeyword() {
        return emphasisKeyword;
    }

    public void setEmphasisKeyword(String emphasisKeyword) {
        this.emphasisKeyword = emphasisKeyword;
    }

    @Override
    public String toString() {
        return "AppTemplateSendRequest{" +
                "touser='" + touser + '\'' +
                ", templateId='" + templateId + '\'' +
                ", page='" + page + '\'' +
                ", formId='" + formId + '\'' +
                ", data=" + data +
                ", emphasisKeyword='" + emphasisKeyword + '\'' +
                '}';
    }

    @Override
    public Class<AppTemplateSendResponse> getResponseClass() {
        return AppTemplateSendResponse.class;
    }
}
