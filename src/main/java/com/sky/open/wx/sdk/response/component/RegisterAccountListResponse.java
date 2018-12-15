package com.sky.open.wx.sdk.response.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.component.RegistAccount;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 获取第三方平台注册的微信账号列表
 * @date 2018/5/21 15:04
 */
public class RegisterAccountListResponse extends WechatResponse {

    private static final long serialVersionUID = 6680143228129551932L;
    /**
     * 应用列表
     */
    @JSONField(name = "account_list")
    private List<RegistAccount> accountList;

    /**
     * 总共有多少个帐号
     */
    @JSONField(name = "total")
    private Integer total;

    public RegisterAccountListResponse() {
    }

    public List<RegistAccount> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<RegistAccount> accountList) {
        this.accountList = accountList;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "RegisterAccountListResponse{" +
                "accountList=" + accountList +
                ", total=" + total +
                '}';
    }
}
