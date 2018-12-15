package com.sky.open.wx.sdk.request.menu;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.menu.Button;
import com.sky.open.wx.sdk.domain.menu.MatchRule;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.menu.CreateCondMenuResponse;

import java.util.List;

/**
 * 创建个性化菜单请求体
 *
 * @author shipj
 * @create 2017-12-27-16:00
 */

public class CreateCondMenuRequest extends WechatRequest<CreateCondMenuResponse> {

    /**
     * 菜单内容
     */
    @JSONField(name = "button")
    private List<Button> button;
    /**
     * 菜单规则匹配
     */
    @JSONField(name = "matchrule")
    private MatchRule matchrule;

    public CreateCondMenuRequest() {
        this.requestUrl = RequestUrlConst.WX_COND_MENU_CREATE;
        this.getMethod = false;
    }

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }

    public MatchRule getMatchrule() {
        return matchrule;
    }

    public void setMatchrule(MatchRule matchrule) {
        this.matchrule = matchrule;
    }

    @Override
    public String toString() {
        return "CreateCondMenuRequest{" +
                "button=" + button +
                ", matchrule=" + matchrule +
                '}';
    }

    @Override
    public Class<CreateCondMenuResponse> getResponseClass() {
        return CreateCondMenuResponse.class;
    }
}
