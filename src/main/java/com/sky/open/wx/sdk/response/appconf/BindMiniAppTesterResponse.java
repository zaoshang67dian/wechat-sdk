package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 绑定微信用户为小程序体验者
 * @date 2018/5/3 19:40
 */
public class BindMiniAppTesterResponse extends WechatResponse {

    private static final long serialVersionUID = -7160388382830487089L;

    /**
     * 添加成功后返回的用户对应的唯一字符串
     */
    @JSONField(name = "userstr")
    private String userStr;

    public BindMiniAppTesterResponse() {
    }

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

    @Override
    public String toString() {
        return "BindMiniAppTesterResponse{" +
                "userStr='" + userStr + '\'' +
                '}';
    }
}
