package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
 *
 * @author shipj
 * @create 2017-12-12-13:59
 */

public class ServiceTypeInfoDto extends WechatObject {

    private static final long serialVersionUID = -6680965375587395091L;
    /**
     * 授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
     */
    @JSONField(name = "id")
    private Integer id;

    public ServiceTypeInfoDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ServiceTypeInfoDto{" +
                "id=" + id +
                '}';
    }
}
