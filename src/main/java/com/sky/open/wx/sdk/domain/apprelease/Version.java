package com.sky.open.wx.sdk.domain.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * @date 2018/5/8 16:53
 */
public class Version extends WechatObject {

    private static final long serialVersionUID = -3790706922135384668L;
    /**
     * 版本号
     */
    @JSONField(name = "version")
    private String version;

    /**
     * 当前版本所占比例
     */
    @JSONField(name = "percentage")
    private Double percentage;

    public Version() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Version{" +
                "version='" + version + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
