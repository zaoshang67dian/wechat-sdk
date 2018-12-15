package com.sky.open.wx.sdk.response.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


import java.util.List;

/**
 * 获取小程序的第三方提交代码的页面配置
 * @date 2018/5/7 15:13
 */
public class AppAllPagesResponse extends WechatResponse {

    private static final long serialVersionUID = -9153654370777672925L;
    /**
     *  page_list 页面配置列表
     */
    @JSONField(name = "page_list")
    private List<String> pageList;

    public AppAllPagesResponse() {
    }

    public List<String> getPageList() {
        return pageList;
    }

    public void setPageList(List<String> pageList) {
        this.pageList = pageList;
    }

    @Override
    public String toString() {
        return "AppAllPagesResponse{" +
                "pageList=" + pageList +
                '}';
    }
}
