package com.sky.open.wx.sdk.domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * 门店小程序类目
 *
 * @author shipj
 * @create 2017-12-15-18:14
 */

public class MerchantCategoryDto extends WechatObject {

    private static final long serialVersionUID = -6433129317476406870L;
    /**
     * 类目id
     */
    @JSONField(name = "id")
    private Integer id;
    /**
     * 类目的名字
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 类目的级别，一级或者二级类目
     */
    @JSONField(name = "level")
    private Integer level;
    /**
     * 当前类目的副类目的id
     */
    @JSONField(name = "father")
    private Integer father;
    /**
     * 当前类目的子类目的id列表
     */
    @JSONField(name = "children")
    private List<Integer> children;
    /**
     *
     */
    @JSONField(name = "scene")
    private Integer scene;
    /**
     * 0或者1， 0表示不用特殊处理 1表示创建该类目的门店小程序时，需要添加相关证件
     */
    @JSONField(name = "sensitive_type")
    private Integer sensitiveType;
    /**
     * 相关证件的名字
     */
    @JSONField(name = "qualify")
    private MerchantQualifyDto qualify;

    public MerchantCategoryDto() {
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getFather() {
        return father;
    }

    public void setFather(Integer father) {
        this.father = father;
    }

    public List<Integer> getChildren() {
        return children;
    }

    public void setChildren(List<Integer> children) {
        this.children = children;
    }

    public Integer getScene() {
        return scene;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public Integer getSensitiveType() {
        return sensitiveType;
    }

    public void setSensitiveType(Integer sensitiveType) {
        this.sensitiveType = sensitiveType;
    }

    public MerchantQualifyDto getQualify() {
        return qualify;
    }

    public void setQualify(MerchantQualifyDto qualify) {
        this.qualify = qualify;
    }

    @Override
    public String toString() {
        return "MerchantCategoryDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", father=" + father +
                ", children=" + children +
                ", scene=" + scene +
                ", sensitiveType=" + sensitiveType +
                ", qualify=" + qualify +
                '}';
    }
}
