package com.sky.open.wx.sdk.response.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 微信业务域名设置
 * @date 2018/5/7 13:08
 */
public class AppWVDomainModifyResponse extends WechatResponse {

    private static final long serialVersionUID = 6191766295167531143L;
    /**
     * 小程序的业务域名列表
     */
    @JSONField(name = "webviewdomain")
    private List<String> webviewDomain;


    public AppWVDomainModifyResponse() {
    }

    public List<String> getWebviewDomain() {
        return webviewDomain;
    }

    public void setWebviewDomain(List<String> webviewDomain) {
        this.webviewDomain = webviewDomain;
    }

    @Override
    public String toString() {
        return "AppWVDomainModifyResponse{" +
                "webviewDomain=" + webviewDomain +
                '}';
    }
}
