package com.sky.open.wx.sdk.domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * @author shipj
 * @create 2017-12-15-18:22
 */

public class ExterInnerDto extends WechatObject {

    private static final long serialVersionUID = 2556333077282154162L;
    /**
     * 相关证件的名字
     */
    @JSONField(name = "name")
    private String name;

    public ExterInnerDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExterInnerDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
