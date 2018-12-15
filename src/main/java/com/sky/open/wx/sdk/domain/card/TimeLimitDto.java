package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 使用时间限制
 *
 * @author shipj
 * @create 2017-11-16-15:00
 */

public class TimeLimitDto extends WechatObject {
    private static final long serialVersionUID = 306834254177276361L;

    @JSONField(name = "type")
    private String type;

    @JSONField(name = "begin_hour")
    private int beginHour;

    @JSONField(name = "begin_minute")
    private int beginMinute;

    @JSONField(name = "end_hour")
    private int endHour;

    @JSONField(name = "end_minute")
    private int endMinute;

    public TimeLimitDto() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBeginHour() {
        return beginHour;
    }

    public void setBeginHour(int beginHour) {
        this.beginHour = beginHour;
    }

    public int getBeginMinute() {
        return beginMinute;
    }

    public void setBeginMinute(int beginMinute) {
        this.beginMinute = beginMinute;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    @Override
    public String toString() {
        return "TimeLimitDto{" +
                "type='" + type + '\'' +
                ", beginHour=" + beginHour +
                ", beginMinute=" + beginMinute +
                ", endHour=" + endHour +
                ", endMinute=" + endMinute +
                '}';
    }
}
