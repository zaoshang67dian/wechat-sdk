package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 小程序的头像信息
 * @date 2018/4/12 18:35
 */
public class HeadImageInfo extends WechatObject {

    private static final long serialVersionUID = 6292480323598162708L;
    /**
     * 小程序头像url
     */
    @JSONField(name = "head_image_url")
    private String headImageUrl;
    /**
     * 头像已使用修改次数（本月）
     */
    @JSONField(name = "modify_used_count")
    private Integer modifyUsedCount;
    /**
     * 头像已使用修改次数（本月）
     */
    @JSONField(name = "modify_quota")
    private Integer modifyQuota;

    public HeadImageInfo() {
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public Integer getModifyUsedCount() {
        return modifyUsedCount;
    }

    public void setModifyUsedCount(Integer modifyUsedCount) {
        this.modifyUsedCount = modifyUsedCount;
    }

    public Integer getModifyQuota() {
        return modifyQuota;
    }

    public void setModifyQuota(Integer modifyQuota) {
        this.modifyQuota = modifyQuota;
    }

    @Override
    public String toString() {
        return "HeadImageInfo{" +
                "headImageUrl='" + headImageUrl + '\'' +
                ", modifyUsedCount=" + modifyUsedCount +
                ", modifyQuota=" + modifyQuota +
                '}';
    }
}
