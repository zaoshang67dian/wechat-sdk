package com.sky.open.wx.sdk.domain.component;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 小程序类目信息
 *
 * @author shipj
 * @create 2017-12-12-14:30
 */

public class CategoryDto extends WechatObject {

    private static final long serialVersionUID = -5280161174962666351L;
    @JSONField(name = "first")
    private String first;
    @JSONField(name = "second")
    private String second;

    public CategoryDto() {
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
