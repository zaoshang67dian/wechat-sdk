package com.sky.open.wx.sdk.request.menu;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.menu.DelCondMenuResponse;

/**
 * 删除个性化菜单请求
 *
 * @author shipj
 * @create 2017-12-27-16:14
 */

public class DelCondMenuRequest extends WechatRequest<DelCondMenuResponse>{

    /**
     * 待删除的个性化菜单的id
     */
    @JSONField(name = "menuid")
    private String menuId;

    public DelCondMenuRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.WX_COND_MENU_DEL;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "DelCondMenuRequest{" +
                "menuId='" + menuId + '\'' +
                '}';
    }

    @Override
    public Class<DelCondMenuResponse> getResponseClass() {
        return DelCondMenuResponse.class;
    }
}
