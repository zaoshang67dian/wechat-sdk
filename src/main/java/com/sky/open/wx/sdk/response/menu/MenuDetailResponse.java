package com.sky.open.wx.sdk.response.menu;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.menu.CommonMenu;
import com.sky.open.wx.sdk.domain.menu.ConditionalMenu;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 菜单详情
 *
 * @author shipj
 * @create 2017-12-27-16:21
 */

public class MenuDetailResponse extends WechatResponse {

    private static final long serialVersionUID = 6159855195783262543L;
    /**
     * 普通菜单列表
     */
    @JSONField(name = "menu")
    private CommonMenu menu;
    /**
     * 个性化菜单列表
     */
    @JSONField(name = "conditionalmenu")
    private List<ConditionalMenu> conditionalMenus;

    public MenuDetailResponse() {
    }

    public CommonMenu getMenu() {
        return menu;
    }

    public void setMenu(CommonMenu menu) {
        this.menu = menu;
    }

    public List<ConditionalMenu> getConditionalMenus() {
        return conditionalMenus;
    }

    public void setConditionalMenus(List<ConditionalMenu> conditionalMenus) {
        this.conditionalMenus = conditionalMenus;
    }

    @Override
    public String toString() {
        return "MenuDetailResponse{" +
                "menu=" + menu +
                ", conditionalMenus=" + conditionalMenus +
                '}';
    }
}
