package com.sky.open.wx.sdk.response.template.wx;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.template.wx.TemplateInfo;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 模板列表
 *
 * @author shipj
 * @create 2017-12-27-17:26
 */

public class TmpListResponse extends WechatResponse {

    private static final long serialVersionUID = 5354002143551148023L;
    /**
     * 当前账号已经拥有的模板详细信息列表
     */
    @JSONField(name = "template_list")
    private List<TemplateInfo> templateList;

    public TmpListResponse() {
    }

    public List<TemplateInfo> getTemplateList() {
        return templateList;
    }

    public void setTemplateList(List<TemplateInfo> templateList) {
        this.templateList = templateList;
    }

    @Override
    public String toString() {
        return "TmpListResponse{" +
                "templateList=" + templateList +
                '}';
    }
}
