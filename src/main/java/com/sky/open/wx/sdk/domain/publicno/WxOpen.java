package com.sky.open.wx.sdk.domain.publicno;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * @date 2018/6/12 14:11
 */
public class WxOpen extends WechatObject {

    private static final long serialVersionUID = -5310555866704048991L;
    /**
     * 关联的小程序列表
     */
    @JSONField(name = "items")
    private List<LinkedItem> items;

    public WxOpen() {
    }

    public List<LinkedItem> getItems() {
        return items;
    }

    public void setItems(List<LinkedItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "WxOpen{" +
                "items=" + items +
                '}';
    }
}
