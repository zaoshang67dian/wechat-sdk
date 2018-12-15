package com.sky.open.wx.sdk.domain.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 第三方创建的全部可用小程序模板
 * @date 2018/5/7 14:22
 */
public class AppTemplate extends WechatObject {

    private static final long serialVersionUID = 2879535944140883393L;
    /**
     * 被添加为模版的时间
     */
    @JSONField(name = "create_time")
    private Long createTime;

    /**
     * 模版版本号，开发者自定义字段
     */
    @JSONField(name = "user_version")
    private String userVersion;

    /**
     * 模版描述 开发者自定义字段
     */
    @JSONField(name = "user_desc")
    private String userDesc;

    /**
     * 模版id
     */
    @JSONField(name = "template_id")
    private Integer templateId;

    public AppTemplate() {
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getUserVersion() {
        return userVersion;
    }

    public void setUserVersion(String userVersion) {
        this.userVersion = userVersion;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    @Override
    public String toString() {
        return "AppTemplate{" +
                "createTime=" + createTime +
                ", userVersion='" + userVersion + '\'' +
                ", userDesc='" + userDesc + '\'' +
                ", templateId=" + templateId +
                '}';
    }
}
