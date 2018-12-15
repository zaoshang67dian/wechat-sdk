package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 小程序成员
 * @date 2018/5/3 19:52
 */
public class MiniAppMember extends WechatObject {

    private static final long serialVersionUID = 4901371348662022345L;
    /**
     * 人员对应的唯一字符串
     */
    @JSONField(name = "userstr")
    private String userstr;

    public MiniAppMember() {
    }

    public String getUserstr() {
        return userstr;
    }

    public void setUserstr(String userstr) {
        this.userstr = userstr;
    }

    @Override
    public String toString() {
        return "MiniAppMember{" +
                "userstr='" + userstr + '\'' +
                '}';
    }
}
