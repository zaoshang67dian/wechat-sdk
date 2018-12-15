package com.sky.open.wx.sdk.response.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.template.app.TemplateInfoDto;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 获取小程序模板库标题列表
 *
 * @author shipj
 * @create 2017-12-15-10:15
 */

public class AppTemplateListResponse extends WechatResponse {

    private static final long serialVersionUID = -8704823789866955260L;
    //模板库标题总数
    @JSONField(name = "total_count")
    private Integer totalCount;
    //模板基本信息列表
    @JSONField(name = "list")
    private List<TemplateInfoDto> list;

    public AppTemplateListResponse() {
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<TemplateInfoDto> getList() {
        return list;
    }

    public void setList(List<TemplateInfoDto> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AppTemplateListResponse{" +
                "totalCount=" + totalCount +
                ", list=" + list +
                '}';
    }
}
