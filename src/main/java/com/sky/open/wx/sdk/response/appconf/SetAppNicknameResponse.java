package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 设置，修改小程序名称
 * @date 2018/4/12 18:47
 */
public class SetAppNicknameResponse extends WechatResponse {

    private static final long serialVersionUID = 1985976234143282328L;
    /**
     * 材料说明
     */
    @JSONField(name = "wording")
    private String wording;
    /**
     * 审核单id
     */
    @JSONField(name = "audit_id")
    private Integer auditId;

    public SetAppNicknameResponse() {
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    @Override
    public String toString() {
        return "SetAppNicknameResponse{" +
                "wording='" + wording + '\'' +
                ", auditId=" + auditId +
                '}';
    }
}
