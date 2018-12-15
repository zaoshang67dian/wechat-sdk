package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.List;

/**
 * 微信定义的门类信息
 * @date 2018/5/4 9:40
 */
public class Category extends WechatObject {

    private static final long serialVersionUID = -7080547218604169830L;
    /**
     * 类目ID
     */
    @JSONField(name = "id")
    private Integer id;

    /**
     * 类目的名称
     */
    @JSONField(name = "name")
    private String name;

    /**
     * 类目层级
     */
    @JSONField(name = "level")
    private Integer level;

    /**
     * 类目父级ID
     */
    @JSONField(name = "father")
    private Integer father;

    /**
     * 子级类目
     */
    @JSONField(name = "children")
    private List<Integer> children;

    /**
     * 是否为敏感目录，（1：为敏感类目，需要提供响应资质审核；0：为非敏感类目，无需审核）
     */
    @JSONField(name = "sensitive_type")
    private Integer sensitiveType;

    /**
     * 未知
     */
    @JSONField(name = "type")
    private String type;

    /**
     * 资质文件说明
     */
    @JSONField(name = "qualify")
    private Qualify qualify;

    public Category() {
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

    public Integer getSensitiveType() {
        return sensitiveType;
    }

    public void setSensitiveType(Integer sensitiveType) {
        this.sensitiveType = sensitiveType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Qualify getQualify() {
        return qualify;
    }

    public void setQualify(Qualify qualify) {
        this.qualify = qualify;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", father=" + father +
                ", children=" + children +
                ", sensitiveType=" + sensitiveType +
                ", type='" + type + '\'' +
                ", qualify=" + qualify +
                '}';
    }
}
