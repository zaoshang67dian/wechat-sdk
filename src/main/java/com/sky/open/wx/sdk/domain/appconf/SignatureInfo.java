package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 小程序的功能介绍
 * @date 2018/4/12 18:32
 */
public class SignatureInfo extends WechatObject {

    private static final long serialVersionUID = -496431481727959207L;
    /**
     * 功能介绍
     */
    @JSONField(name = "signature")
    private String signature;
    /**
     * 功能介绍已使用修改次数（本月）
     */
    @JSONField(name = "modify_used_count")
    private Integer modifyUsedCount;
    /**
     * 功能介绍修改次数总额度（本月）
     */
    @JSONField(name = "modify_quota")
    private Integer modifyQuota;

    public SignatureInfo() {
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
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
        return "SignatureInfo{" +
                "signature='" + signature + '\'' +
                ", modifyUsedCount=" + modifyUsedCount +
                ", modifyQuota=" + modifyQuota +
                '}';
    }
}
