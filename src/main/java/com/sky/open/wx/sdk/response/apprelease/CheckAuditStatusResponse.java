package com.sky.open.wx.sdk.response.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 查询某个指定版本的审核状态
 * @date 2018/5/7 15:29
 */
public class CheckAuditStatusResponse extends WechatResponse {

    private static final long serialVersionUID = -6533834494815833598L;
    /**
     * 审核状态，其中0为审核成功，1为审核失败，2为审核中
     */
    @JSONField(name = "status")
    private Integer status;

    /**
     * 当status=1，审核被拒绝时，返回的拒绝原因
     */
    @JSONField(name = "reason")
    private String reason;

    public CheckAuditStatusResponse() {
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "CheckAuditStatusResponse{" +
                "status=" + status +
                ", reason='" + reason + '\'' +
                '}';
    }
}
