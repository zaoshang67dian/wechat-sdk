package com.sky.open.wx.sdk.domain.template.wx;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 模板消息中的小程序信息
 *
 * @author shipj
 * @create 2017-12-27-17:45
 */

public class MiniProgram extends WechatObject {

    private static final long serialVersionUID = 501425956987500800L;
    /**
     * 所需跳转到的小程序appid（该小程序appid必须与发模板消息的公众号是绑定关联关系）
     */
    @JSONField(name = "appid")
    private String appId;
    /**
     * 所需跳转到小程序的具体页面路径，支持带参数,（示例index?foo=bar）
     */
    @JSONField(name = "pagepath")
    private String pagePath;

    public MiniProgram() {
    }

    public MiniProgram(String appId, String pagePath) {
        this.appId = appId;
        this.pagePath = pagePath;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPagePath() {
        return pagePath;
    }

    public void setPagePath(String pagePath) {
        this.pagePath = pagePath;
    }

    @Override
    public String toString() {
        return "MiniProgram{" +
                "appId='" + appId + '\'' +
                ", pagePath='" + pagePath + '\'' +
                '}';
    }
}
