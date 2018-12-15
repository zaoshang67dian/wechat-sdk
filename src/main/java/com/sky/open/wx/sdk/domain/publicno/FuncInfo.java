package com.sky.open.wx.sdk.domain.publicno;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 微信认证及支付信息，0表示未开通，1表示开通
 * @date 2018/6/12 13:58
 */
public class FuncInfo extends WechatObject {

    private static final long serialVersionUID = 7638996533053165805L;
    /**
     * 支付状态
     */
    @JSONField(name = "status")
    private Integer status;

    /**
     * 认证的编号
     */
    @JSONField(name = "id")
    private Integer id;

    /**
     * 认证的名称
     */
    @JSONField(name = "name")
    private String name;

    public FuncInfo() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FuncInfo{" +
                "status=" + status +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
