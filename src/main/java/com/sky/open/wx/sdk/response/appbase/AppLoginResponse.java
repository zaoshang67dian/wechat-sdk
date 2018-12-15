package com.sky.open.wx.sdk.response.appbase;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 代创建小程序登录获取openid，sessionkey
 * @date 2018/4/16 10:13
 */
public class AppLoginResponse extends WechatResponse {

    private static final long serialVersionUID = 1183491400695336520L;
    /**
     * 用户唯一标识的openid
     */
    @JSONField(name = "openid")
    private String openid;

    /**
     * 会话密钥
     */
    @JSONField(name = "session_key")
    private String sessionKey;

    /**
     * 用户的unionid
     */
    @JSONField(name = "unionid")
    private String unionid;

    public AppLoginResponse() {
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getUnionid() {
        return unionid;
    }

    @Override
    public String toString() {
        return "AppLoginResponse{" +
                "openid='" + openid + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                '}';
    }
}
