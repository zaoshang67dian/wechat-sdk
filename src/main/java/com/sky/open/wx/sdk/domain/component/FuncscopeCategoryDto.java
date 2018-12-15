package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * ID为1到15时分别代表：
        消息管理权限
        用户管理权限
        帐号服务权限
        网页服务权限
        微信小店权限
        微信多客服权限
        群发与通知权限
        微信卡券权限
        微信扫一扫权限
        微信连WIFI权限
        素材管理权限
        微信摇周边权限
        微信门店权限
        微信支付权限
        自定义菜单权限
    ID为17到19时分别代表：
        17.帐号管理权限
        18.开发管理权限
        19.客服消息管理权限
 * @author shipj
 * @create 2017-12-11-21:30
 */

public class FuncscopeCategoryDto extends WechatObject {

    private static final long serialVersionUID = -2069482389286848284L;
    @JSONField(name = "id")
    private Integer id;

    public FuncscopeCategoryDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FuncscopeCategoryDto{" +
                "id=" + id +
                '}';
    }
}
