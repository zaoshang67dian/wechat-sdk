package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 资质dto
 * @date 2018/5/4 10:47
 */
public class Certicate extends WechatObject {

    private static final long serialVersionUID = -5990834658721655297L;
    /**
     * 资质名称
     */
    @JSONField(name = "key")
    private String key;

    /**
     * 资质图片的media_id
     */
    @JSONField(name = "value")
    private String value;

    public Certicate() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Certicate{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
