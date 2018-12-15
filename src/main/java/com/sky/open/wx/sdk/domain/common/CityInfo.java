package com.sky.open.wx.sdk.domain.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * 城市信息
 *
 * @author shipj
 * @create 2017-12-15-23:45
 */

public class CityInfo extends WechatObject {

    private static final long serialVersionUID = 6896749339949767455L;
    /**
     * 城市的编号
     */
    @JSONField(name = "id")
    private String id;
    /**
     * 城市的名字
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 城市的全名
     */
    @JSONField(name = "fullname")
    private String fullName;
    /**
     * 城市名称的拼音
     */
    @JSONField(name = "pinyin")
    private List<String> pinYin;
    /**
     * 城市的经纬度
     */
    @JSONField(name = "location")
    private Coordinate location;
    /**
     * 通过省的cidx，可以在 result[1] 中找到广东省下的所有市
     */
    @JSONField(name = "cidx")
    private List<Integer> cidx;

    public CityInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getPinYin() {
        return pinYin;
    }

    public void setPinYin(List<String> pinYin) {
        this.pinYin = pinYin;
    }

    public Coordinate getLocation() {
        return location;
    }

    public void setLocation(Coordinate location) {
        this.location = location;
    }

    public List<Integer> getCidx() {
        return cidx;
    }

    public void setCidx(List<Integer> cidx) {
        this.cidx = cidx;
    }

    @Override
    public String toString() {
        return "CityInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", pinYin=" + pinYin +
                ", location=" + location +
                ", cidx=" + cidx +
                '}';
    }
}
