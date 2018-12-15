package com.sky.open.wx.sdk.request.menu;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.menu.MenuDetailResponse;

/**
 * 菜单详情
 *
 * @author shipj
 * @create 2017-12-27-16:32
 */

public class MenuDetailRequest extends WechatRequest<MenuDetailResponse>{

    public MenuDetailRequest() {
        this.requestUrl = RequestUrlConst.WX_MENU_DETAIL;
        this.getMethod = true;
    }

    @Override
    public Class<MenuDetailResponse> getResponseClass() {
        return MenuDetailResponse.class;
    }
}
