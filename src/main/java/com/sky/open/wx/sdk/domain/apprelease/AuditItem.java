package com.sky.open.wx.sdk.domain.apprelease;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 提交审核项
 * @date 2018/5/7 15:18
 */
public class AuditItem extends WechatObject {

    private static final long serialVersionUID = -3697708007269086585L;
    /**
     * 小程序的页面，可通过“获取小程序的第三方提交代码的页面配置”接口获得
     */
    @JSONField(name = "address")
    private String address;

    /**
     * 小程序的标签，多个标签用空格分隔，标签不能多于10个，标签长度不超过20
     */
    @JSONField(name = "tag")
    private String tag;

    /**
     * 一级类目名称,可通过“获取授权小程序帐号的可选类目”接口获得
     */
    @JSONField(name = "first_class")
    private String firstClass;

    /**
     * 二级类目名称(同上)
     */
    @JSONField(name = "second_class")
    private String secondClass;

    /**
     * 三级类目名称（同上）
     */
    @JSONField(name = "third_class")
    private String thirdClass;

    /**
     * 一级类目的ID编号，可通过“获取授权小程序帐号的可选类目”接口获得
     */
    @JSONField(name = "first_id")
    private Integer firstId;

    /**
     * 二级类目的ID编号（同上）
     */
    @JSONField(name = "second_id")
    private Integer secondId;

    /**
     * 三级类目的ID编号（同上）
     */
    @JSONField(name = "third_id")
    private Integer thirdId;

    /**
     * 小程序页面的标题,标题长度不超过32
     */
    @JSONField(name = "title")
    private String title;

    public AuditItem() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "AuditItem{" +
                "address='" + address + '\'' +
                ", tag='" + tag + '\'' +
                ", firstClass='" + firstClass + '\'' +
                ", secondClass='" + secondClass + '\'' +
                ", thirdClass='" + thirdClass + '\'' +
                ", firstId=" + firstId +
                ", secondId=" + secondId +
                ", thirdId=" + thirdId +
                ", title='" + title + '\'' +
                '}';
    }
}
