package com.sky.open.wx.sdk.domain.template.wx;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 行业信息
 *
 * @author shipj
 * @create 2017-12-27-17:08
 */

public class IndustryClass extends WechatObject {

    private static final long serialVersionUID = -7057706881466591526L;
    /**
     * 行业类型一级类目
     */
    @JSONField(name = "first_class")
    private String firstClass;
    /**
     * 行业类型二级类目
     */
    @JSONField(name = "second_class")
    private String secondClass;

    public IndustryClass() {
    }

    public IndustryClass(String firstClass, String secondClass) {
        this.firstClass = firstClass;
        this.secondClass = secondClass;
    }

    public String getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }

    public String getSecondClass() {
        return secondClass;
    }

    public void setSecondClass(String secondClass) {
        this.secondClass = secondClass;
    }

    @Override
    public String toString() {
        return "IndustryClass{" +
                "firstClass='" + firstClass + '\'' +
                ", secondClass='" + secondClass + '\'' +
                '}';
    }
}
