package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.CheckVfNicknameResponse;

/**
 * 微信认证名称检测
 * @date 2018/4/16 14:54
 */
public class CheckVfNicknameRequest extends WechatRequest<CheckVfNicknameResponse> {

    /**
     * 需要认证的名称
     */
    @JSONField(name = "nick_name")
    private String nickName;

    public CheckVfNicknameRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.NICK_NAME_CHECK;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "CheckVfNicknameRequest{" +
                "nickName='" + nickName + '\'' +
                '}';
    }

    @Override
    public Class<CheckVfNicknameResponse> getResponseClass() {
        return CheckVfNicknameResponse.class;
    }
}
