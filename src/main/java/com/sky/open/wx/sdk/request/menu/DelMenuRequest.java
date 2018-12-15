package com.sky.open.wx.sdk.request.menu;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.menu.DelMenuResponse;

/**
 * 删除普通菜单请求
 *
 * @author shipj
 * @create 2017-12-27-16:42
 */

public class DelMenuRequest extends WechatRequest<DelMenuResponse>{

    public DelMenuRequest() {
        this.getMethod = true;
        this.requestUrl = RequestUrlConst.WX_MENU_DEL;
    }

    @Override
    public Class<DelMenuResponse> getResponseClass() {
        return DelMenuResponse.class;
    }
}
