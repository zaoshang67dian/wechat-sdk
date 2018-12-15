package com.sky.open.wx.sdk.response.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.apprelease.AppTemplate;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 第三方创建的全部小程序模板
 * @date 2018/5/7 14:26
 */
public class AppAllTemplateResponse extends WechatResponse {

    private static final long serialVersionUID = 5415422630151895780L;
    /**
     * 第三方添加的全部小程序模板
     */
    @JSONField(name = "template_list")
    private List<AppTemplate> templateList;

    public AppAllTemplateResponse() {
    }

    public List<AppTemplate> getTemplateList() {
        return templateList;
    }

    public void setTemplateList(List<AppTemplate> templateList) {
        this.templateList = templateList;
    }

    @Override
    public String toString() {
        return "AppAllTemplateResponse{" +
                "templateList=" + templateList +
                '}';
    }
}
