package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * @date 2018/3/8 16:42
 */
public class CustomServiceDto extends WechatObject {

    private static final long serialVersionUID = 6306116127705997916L;
    /**
     *
     */
    @JSONField(name = "kf_account")
    private String kfAccount;

    public CustomServiceDto() {
    }

    public CustomServiceDto(String kfAccount) {
        this.kfAccount = kfAccount;
    }

    public String getKfAccount() {
        return kfAccount;
    }

    public void setKfAccount(String kfAccount) {
        this.kfAccount = kfAccount;
    }

    @Override
    public String toString() {
        return "CustomServiceDto{" +
                "kfAccount='" + kfAccount + '\'' +
                '}';
    }
}
