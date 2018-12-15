package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 授权方认证类型:
 *      -1代表未认证，
 *      0代表微信认证，
 *      1代表新浪微博认证，
 *      2代表腾讯微博认证，
 *      3代表已资质认证通过但还未通过名称认证，
 *      4代表已资质认证通过、还未通过名称认证，但通过了新浪微博认证，
 *      5代表已资质认证通过、还未通过名称认证，但通过了腾讯微博认证
 *
 * @author shipj
 * @create 2017-12-12-14:04
 */

public class VerifyTypeInfoDto extends WechatObject {

    private static final long serialVersionUID = -1404335429220689923L;
    @JSONField(name = "id")
    private Integer id;

    public VerifyTypeInfoDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VerifyTypeInfoDto{" +
                "id=" + id +
                '}';
    }
}
