package com.sky.open.wx.sdk.response.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 该API用于获取授权方的公众号或小程序的选项设置信息，如：地理位置上报，语音识别开关，多客服开关
 *
 * @author shipj
 * @create 2017-12-12-17:14
 */

public class GetAuthorizerOptionResponse extends WechatResponse {

    private static final long serialVersionUID = 8817951433555861847L;
    /**
     * 授权公众号或小程序的appid
     */
    @JSONField(name = "authorizer_appid")
    private String authorizerAppid;
    /**
     * 选项名称
     */
    @JSONField(name = "option_name")
    private String optionName;
    /**
     * 选项值
     */
    @JSONField(name = "option_value")
    private String optionValue;

    public GetAuthorizerOptionResponse() {
    }

    public String getAuthorizerAppid() {
        return authorizerAppid;
    }

    public void setAuthorizerAppid(String authorizerAppid) {
        this.authorizerAppid = authorizerAppid;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    @Override
    public String toString() {
        return "GetAuthorizerOptionResponse{" +
                "authorizerAppid='" + authorizerAppid + '\'' +
                ", optionName='" + optionName + '\'' +
                ", optionValue='" + optionValue + '\'' +
                '}';
    }
}
