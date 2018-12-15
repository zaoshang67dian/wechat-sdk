package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.appconf.MiniAppMember;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 获取体验者列表
 * @author shipj@ctrip.com
 * @date 2018/5/3 19:51
 */
public class GetBindTestersResponse extends WechatResponse {

    private static final long serialVersionUID = -2999006215310259913L;
    /**
     * 人员列表
     */
    @JSONField(name = "members")
    private List<MiniAppMember> members;

    public GetBindTestersResponse() {
    }

    public List<MiniAppMember> getMembers() {
        return members;
    }

    public void setMembers(List<MiniAppMember> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "GetBindTestersResponse{" +
                "members=" + members +
                '}';
    }
}
