package com.sky.open.wx.sdk.response.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.apprelease.VersionInfo;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 查询当前设置的最低基础库版本及各版本用户占比 （仅供第三方代小程序调用）
 * @date 2018/5/8 16:53
 */
public class AppSuportVersionResponse extends WechatResponse {

    private static final long serialVersionUID = -381420064754183047L;
    /**
     * 当前版本
     */
    @JSONField(name = "now_version")
    private String nowVersion;

    /**
     * 受影响用户占比，item参数里面为一系列数组，每个数组带有参数percentage（受影响比例）以及version（版本号）
     */
    @JSONField(name = "uv_info")
    private VersionInfo uvInfo;

    public AppSuportVersionResponse() {
    }

    public String getNowVersion() {
        return nowVersion;
    }

    public void setNowVersion(String nowVersion) {
        this.nowVersion = nowVersion;
    }

    public VersionInfo getUvInfo() {
        return uvInfo;
    }

    public void setUvInfo(VersionInfo uvInfo) {
        this.uvInfo = uvInfo;
    }

    @Override
    public String toString() {
        return "AppSuportVersionResponse{" +
                "nowVersion='" + nowVersion + '\'' +
                ", uvInfo=" + uvInfo +
                '}';
    }
}
