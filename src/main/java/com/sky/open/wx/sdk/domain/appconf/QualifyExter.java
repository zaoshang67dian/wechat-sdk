package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * 认证信息
 * @date 2018/5/4 9:55
 */
public class QualifyExter extends WechatObject {

    private static final long serialVersionUID = 8045882284976683303L;
    /**
     *
     */
    @JSONField(name = "inner_list")
    private List<QualifyExterInner> innerList;

    public QualifyExter() {
    }

    public List<QualifyExterInner> getInnerList() {
        return innerList;
    }

    public void setInnerList(List<QualifyExterInner> innerList) {
        this.innerList = innerList;
    }

    @Override
    public String toString() {
        return "QualifyExter{" +
                "innerList=" + innerList +
                '}';
    }
}
