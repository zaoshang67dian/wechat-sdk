package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 查询小程序当前隐私设置（是否可被搜索）
 * @date 2018/5/3 15:24
 */
public class CheckAppSearchStatusResponse extends WechatResponse {

    private static final long serialVersionUID = -5077027160301067723L;
    /**
     *  1表示不可搜索，0表示可搜索
     */
    @JSONField(name = "status")
    private Integer status;

    public CheckAppSearchStatusResponse() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CheckAppSearchStatusResponse{" +
                "status=" + status +
                '}';
    }
}
