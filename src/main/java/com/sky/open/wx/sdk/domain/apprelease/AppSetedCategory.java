package com.sky.open.wx.sdk.domain.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 小程序已经设置的类目信息
 * @date 2018/5/7 14:57
 */
public class AppSetedCategory extends WechatObject {

    private static final long serialVersionUID = 6436988817560007151L;
    /**
     * 一级类目名称
     */
    @JSONField(name = "first_class")
    private String firstClass;

    /**
     * 二级类目名称
     */
    @JSONField(name = "second_class")
    private String secondClass;

    /**
     * 三级类目名称
     */
    @JSONField(name = "third_class")
    private String thirdClass;

    /**
     * 一级类目的ID编号
     */
    @JSONField(name = "first_id")
    private Integer firstId;

    /**
     * 二级类目的ID编号
     */
    @JSONField(name = "second_id")
    private Integer secondId;

    /**
     * 三级类目的ID编号
     */
    @JSONField(name = "third_id")
    private Integer thirdId;

    public AppSetedCategory() {
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

    public String getThirdClass() {
        return thirdClass;
    }

    public void setThirdClass(String thirdClass) {
        this.thirdClass = thirdClass;
    }

    public Integer getFirstId() {
        return firstId;
    }

    public void setFirstId(Integer firstId) {
        this.firstId = firstId;
    }

    public Integer getSecondId() {
        return secondId;
    }

    public void setSecondId(Integer secondId) {
        this.secondId = secondId;
    }

    public Integer getThirdId() {
        return thirdId;
    }

    public void setThirdId(Integer thirdId) {
        this.thirdId = thirdId;
    }

    @Override
    public String toString() {
        return "AppSetedCategory{" +
                "firstClass='" + firstClass + '\'' +
                ", secondClass='" + secondClass + '\'' +
                ", thirdClass='" + thirdClass + '\'' +
                ", firstId=" + firstId +
                ", secondId=" + secondId +
                ", thirdId=" + thirdId +
                '}';
    }
}
