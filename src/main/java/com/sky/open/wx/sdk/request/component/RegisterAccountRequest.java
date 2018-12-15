package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.RegisterAccountResponse;

/**
 * 第三方平台注册微信应用（目前只支持小程序）
 * @author shipj@ctrip.com
 * @date 2018/5/21 14:55
 */
public class RegisterAccountRequest extends WechatRequest<RegisterAccountResponse> {

    /**
     * 第三方平台的appid（默认：wx0f45d134d2d7b8a2）
     */
    @JSONField(name = "component_appid")
    private String componentAppid;

    /**
     * 注册的账号类型（1：订阅号，2：服务号，3：小程序），目前只支持 注册小程序
     */
    @JSONField(name = "account_type")
    private Integer accountType;

    /**
     * 注册方式（1：微信认证，目前只支持微信认证）
     */
    @JSONField(name = "register_method")
    private Integer registerMethod;

    /**
     * 主体类型（1：企业，目前只支持企业）
     */
    @JSONField(name = "principal_type")
    private Integer principalType;

    /**
     * 主体名称
     */
    @JSONField(name = "principal_name")
    private String principalName;

    public RegisterAccountRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.REGIST_APP_BY_VERIFY;
    }

    public String getComponentAppid() {
        return componentAppid;
    }

    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getRegisterMethod() {
        return registerMethod;
    }

    public void setRegisterMethod(Integer registerMethod) {
        this.registerMethod = registerMethod;
    }

    public Integer getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(Integer principalType) {
        this.principalType = principalType;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    @Override
    public String toString() {
        return "RegisterAccountRequest{" +
                "componentAppid='" + componentAppid + '\'' +
                ", accountType=" + accountType +
                ", registerMethod=" + registerMethod +
                ", principalType=" + principalType +
                ", principalName='" + principalName + '\'' +
                '}';
    }

    @Override
    public Class<RegisterAccountResponse> getResponseClass() {
        return RegisterAccountResponse.class;
    }
}
