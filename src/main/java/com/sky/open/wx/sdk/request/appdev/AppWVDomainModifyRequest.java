package com.sky.open.wx.sdk.request.appdev;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appdev.AppWVDomainModifyResponse;

import java.util.List;

/**
 * 设置小程序业务域名
 * @date 2018/5/7 13:10
 */
public class AppWVDomainModifyRequest extends WechatRequest<AppWVDomainModifyResponse> {

    /**
     * add添加, delete删除, set覆盖, get获取。
     * 当参数是get时不需要填webviewdomain字段。
     * 如果没有action字段参数，则默认见开放平台第三方登记的小程序业务域名全部添加到授权的小程序中
     */
    @JSONField(name = "action")
    private String action;

    /**
     * 需要添加的业务域名列表
     */
    @JSONField(name = "webviewdomain")
    private List<String> webviewDomain;

    public AppWVDomainModifyRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_WV_DOMAIN;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<String> getWebviewDomain() {
        return webviewDomain;
    }

    public void setWebviewDomain(List<String> webviewDomain) {
        this.webviewDomain = webviewDomain;
    }

    @Override
    public String toString() {
        return "AppWVDomainModifyRequest{" +
                "action='" + action + '\'' +
                ", webviewDomain=" + webviewDomain +
                '}';
    }

    @Override
    public Class<AppWVDomainModifyResponse> getResponseClass() {
        return AppWVDomainModifyResponse.class;
    }
}
