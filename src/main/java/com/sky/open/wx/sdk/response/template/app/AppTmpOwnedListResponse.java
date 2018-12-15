package com.sky.open.wx.sdk.response.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.template.app.TemplateDetailDto;
import com.sky.open.wx.sdk.response.WechatResponse;


import java.util.List;

/**
 * 获取帐号下已存在的模板列表
 *
 * @author shipj
 * @create 2017-12-15-15:17
 */

public class AppTmpOwnedListResponse extends WechatResponse {

    /**
     * 帐号下的模板列表
     */
    @JSONField(name = "list")
    private List<TemplateDetailDto> list;

    public AppTmpOwnedListResponse() {
    }

    public List<TemplateDetailDto> getList() {
        return list;
    }

    public void setList(List<TemplateDetailDto> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AppTmpOwnedListResponse{" +
                "list=" + list +
                '}';
    }
}
