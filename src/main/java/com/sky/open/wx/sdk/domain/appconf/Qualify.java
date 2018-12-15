package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.List;

/**
 * 如果是敏感类目需要提供的认证资质资料
 * @date 2018/5/4 9:54
 */
public class Qualify extends WechatObject {

    private static final long serialVersionUID = 1366263015856232384L;
    /**
     *
     */
    @JSONField(name = "exter_list")
    private List<QualifyExter> exterList;

    /**
     *
     */
    @JSONField(name = "remark")
    private String remark;

    public Qualify() {
    }

    public List<QualifyExter> getExterList() {
        return exterList;
    }

    public void setExterList(List<QualifyExter> exterList) {
        this.exterList = exterList;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Qualify{" +
                "exterList=" + exterList +
                ", remark='" + remark + '\'' +
                '}';
    }
}
