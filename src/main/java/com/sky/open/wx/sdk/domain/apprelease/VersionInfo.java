package com.sky.open.wx.sdk.domain.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * @date 2018/5/8 16:56
 */
public class VersionInfo extends WechatObject {

    private static final long serialVersionUID = 5948038634877957173L;
    /**
     * 指定小程序的全部版本及其占有率
     */
    @JSONField(name = "items")
    private List<Version> versions;

    public VersionInfo() {
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }

    @Override
    public String toString() {
        return "VersionInfo{" +
                "versions=" + versions +
                '}';
    }
}
