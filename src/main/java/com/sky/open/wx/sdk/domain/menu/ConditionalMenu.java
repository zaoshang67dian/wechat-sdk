package com.sky.open.wx.sdk.domain.menu;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.List;

/**
 * 个性化菜单
 *
 * @author shipj
 * @create 2017-12-27-16:27
 */

public class ConditionalMenu extends WechatObject {

    private static final long serialVersionUID = -1806052933304266359L;
    /**
     * 个性化菜单中的菜单项列表
     */
    @JSONField(name = "button")
    private List<Button> button;
    /**
     * 个性化菜单的匹配规则
     */
    @JSONField(name = "matchrule")
    private MatchRule matchRule;
    /**
     * 个性化菜单的id
     */
    @JSONField(name = "menuid")
    private String menuId;

    public ConditionalMenu() {
    }

    public ConditionalMenu(List<Button> button, MatchRule matchRule, String menuId) {
        this.button = button;
        this.matchRule = matchRule;
        this.menuId = menuId;
    }

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }

    public MatchRule getMatchRule() {
        return matchRule;
    }

    public void setMatchRule(MatchRule matchRule) {
        this.matchRule = matchRule;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "ConditionalMenu{" +
                "button=" + button +
                ", matchRule=" + matchRule +
                ", menuId='" + menuId + '\'' +
                '}';
    }
}
