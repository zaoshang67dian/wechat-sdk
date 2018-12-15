package com.sky.open.wx.sdk.request.menu;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.menu.Button;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.menu.CreateMenuResponse;

import java.util.List;

/**
 * 创建自定义菜单请求
 *
 * @author shipj
 * @create 2017-12-26-13:39
 */

public class CreateMenuRequest extends WechatRequest<CreateMenuResponse> {

    /**
     * 一级菜单数组，个数应为1~3个
     */
    @JSONField(name = "button")
    private List<Button> button;

    public CreateMenuRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.WX_MENU_CREATE;
    }

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }

    @Override
    public Class<CreateMenuResponse> getResponseClass() {
        return CreateMenuResponse.class;
    }

    @Override
    public String toString() {
        return "CreateMenuRequest{" +
                "button=" + button +
                '}';
    }
}
