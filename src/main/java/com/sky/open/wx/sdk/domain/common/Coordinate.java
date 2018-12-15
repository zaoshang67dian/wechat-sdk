package com.sky.open.wx.sdk.domain.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 坐标
 *
 * @author shipj
 * @create 2017-12-15-23:49
 */

public class Coordinate extends WechatObject {

    private static final long serialVersionUID = -3580163727518354419L;
    /**
     *纬度
     */
    @JSONField(name = "lat")
    private Double lat;
    /**
     * 经度
     */
    @JSONField(name = "lng")
    private Double lng;

    public Coordinate() {
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
