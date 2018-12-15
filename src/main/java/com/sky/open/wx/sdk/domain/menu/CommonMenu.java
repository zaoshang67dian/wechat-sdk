package com.sky.open.wx.sdk.domain.menu;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.List;

/**
 * 普通菜单
 *
 * @author shipj
 * @create 2017-12-27-16:23
 */

public class CommonMenu extends WechatObject {
    private static final long serialVersionUID = -4555189573062799585L;
    /**
     * 普通菜单中的菜单列表
     */
    @JSONField(name = "button")
    private List<Button> button;
    /**
     * 普通菜单的id
     */
    @JSONField(name = "menuid")
    private String menuId;

    public CommonMenu() {
    }

    public CommonMenu(List<Button> button, String menuId) {
        this.button = button;
        this.menuId = menuId;
    }

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "CommonMenu{" +
                "button=" + button +
                ", menuId='" + menuId + '\'' +
                '}';
    }
}
