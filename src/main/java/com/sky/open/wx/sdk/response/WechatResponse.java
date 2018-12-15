package com.sky.open.wx.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * 微信api响应
 *
 * @author shipj
 * @create 2017-11-15-17:47
 */

public abstract class WechatResponse implements Serializable{
    private static final long   serialVersionUID = 5014379068811962021L;
    /**
     * 微信接口公共响应errcode
     */
    @JSONField(name = "errcode")
    private String errcode = "0";
    /**
     * 微信接口公共响应errmsg
     */
    @JSONField(name = "errmsg")
    private String errmsg = "Ok";

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
