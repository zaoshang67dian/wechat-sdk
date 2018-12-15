package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 有效时间类型
 *
 * @author shipj
 * @create 2017-11-16-11:43
 */

public class DateInfoDto extends WechatObject {
    private static final long serialVersionUID = -4398551027462636796L;

    //时间类型（DATE_TYPE_FIX_TIME_RANGE：固定时间区间，DATE_TYPE_FIX_TERM：固定时长）
    @JSONField(name = "type")
    private String type;

    @JSONField(name = "begin_timestamp")
    private String beginTimeStamp;

    @JSONField(name = "end_timestamp")
    private String endTimeStamp;

    @JSONField(name = "fixed_term")
    private int fixedTerm;

    @JSONField(name = "fixed_begin_term")
    private int fixedBeginTerm;

    public DateInfoDto() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBeginTimeStamp() {
        return beginTimeStamp;
    }

    public void setBeginTimeStamp(String beginTimeStamp) {
        this.beginTimeStamp = beginTimeStamp;
    }

    public String getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public int getFixedTerm() {
        return fixedTerm;
    }

    public void setFixedTerm(int fixedTerm) {
        this.fixedTerm = fixedTerm;
    }

    public int getFixedBeginTerm() {
        return fixedBeginTerm;
    }

    public void setFixedBeginTerm(int fixedBeginTerm) {
        this.fixedBeginTerm = fixedBeginTerm;
    }

    @Override
    public String toString() {
        return "DataInfoDto{" +
                "type='" + type + '\'' +
                ", beginTimeStamp=" + beginTimeStamp +
                ", endTimeStamp=" + endTimeStamp +
                ", fixedTerm=" + fixedTerm +
                ", fixedBeginTerm=" + fixedBeginTerm +
                '}';
    }
}
