package com.sky.open.wx.sdk.response.menu;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 创建爱你个性化菜单
 *
 * @author shipj
 * @create 2017-12-27-15:58
 */

public class CreateCondMenuResponse extends WechatResponse {

    private static final long serialVersionUID = 5657236158683274757L;
    /**
     * 菜单id，用于删除，更新
     */
    @JSONField(name = "menuid")
    private String menuid;

    public CreateCondMenuResponse() {
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    @Override
    public String toString() {
        return "CreateCondMenuResponse{" +
                "menuid='" + menuid + '\'' +
                '}';
    }
}
