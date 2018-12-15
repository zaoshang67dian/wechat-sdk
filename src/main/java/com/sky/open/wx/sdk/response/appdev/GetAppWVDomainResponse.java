package com.sky.open.wx.sdk.response.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


import java.util.List;

/**
 * 获取小程序全部业务域名：
 * 提示：
 * 1、需要先将域名登记到第三方平台的小程序业务域名中，才可以调用接口进行配置。
 * 2、为授权的小程序配置域名时支持配置子域名，
 *      例如第三方登记的业务域名如为qq.com，则可以直接将qq.com及其子域名（如xxx.qq.com）也配置到授权的小程序中。
 * @date 2018/5/7 10:57
 */
public class GetAppWVDomainResponse extends WechatResponse {

    private static final long serialVersionUID = 4148710617262303802L;
    /**
     * 小程序的业务域名列表
     */
    @JSONField(name = "webviewdomain")
    private List<String> webviewDomain;

    public GetAppWVDomainResponse() {
    }

    public List<String> getWebviewDomain() {
        return webviewDomain;
    }

    public void setWebviewDomain(List<String> webviewDomain) {
        this.webviewDomain = webviewDomain;
    }

    @Override
    public String toString() {
        return "GetAppWVDomainResponse{" +
                "webviewDomain=" + webviewDomain +
                '}';
    }
}
