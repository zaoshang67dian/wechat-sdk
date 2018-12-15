package com.sky.open.wx.sdk.response.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.component.AuthorizationInfoDto;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 使用授权码换取授权公众号或小程序的授权信息，并换取authorizer_access_token和authorizer_refresh_token
 *
 * @author shipj
 * @create 2017-12-11-21:25
 */

public class GetApiQueryAuthResponse extends WechatResponse {

    private static final long serialVersionUID = 8174692006450216494L;
    /**
     * 小程序/公众号的授权信息
     */
    @JSONField(name = "authorization_info")
    private AuthorizationInfoDto authorizationInfoDto;

    public GetApiQueryAuthResponse() {
    }

    public AuthorizationInfoDto getAuthorizationInfoDto() {
        return authorizationInfoDto;
    }

    public void setAuthorizationInfoDto(AuthorizationInfoDto authorizationInfoDto) {
        this.authorizationInfoDto = authorizationInfoDto;
    }

    @Override
    public String toString() {
        return "GetApiQueryAuthResponse{" +
                "authorizationInfoDto=" + authorizationInfoDto +
                '}';
    }
}
