package com.sky.open.wx.sdk.domain.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * sensitive_type为1的时候需要提供的资质文件
 * @date 2018/5/4 9:56
 */
public class QualifyExterInner extends WechatObject {

    private static final long serialVersionUID = 224016739965953026L;
    /**
     * 资质文件的名称
     */
    @JSONField(name = "name")
    private String name;

    /**
     * 资质文件的样例
     */
    @JSONField(name = "url")
    private String url;

    public QualifyExterInner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "QualifyExterInner{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
