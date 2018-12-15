package com.sky.open.wx.sdk.response.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.component.AuthorizationInfoDto;
import com.sky.open.wx.sdk.domain.component.AuthorizerInfoDto;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * 获取授权方详细信息
 *
 * @author shipj
 * @create 2017-12-12-13:53
 */

public class GetAuthorizerInfoResponse extends WechatResponse {

    private static final long serialVersionUID = -5707692496059072521L;
    /**
     * 授权方基本信息
     */
    @JSONField(name = "authorizer_info")
    private AuthorizerInfoDto authorizerInfoDto;
    /**
     * 授权方授权权限信息
     */
    @JSONField(name = "authorization_info")
    private AuthorizationInfoDto authorizationInfoDto;

    public GetAuthorizerInfoResponse() {
    }

    public AuthorizerInfoDto getAuthorizerInfoDto() {
        return authorizerInfoDto;
    }

    public void setAuthorizerInfoDto(AuthorizerInfoDto authorizerInfoDto) {
        this.authorizerInfoDto = authorizerInfoDto;
    }

    public AuthorizationInfoDto getAuthorizationInfoDto() {
        return authorizationInfoDto;
    }

    public void setAuthorizationInfoDto(AuthorizationInfoDto authorizationInfoDto) {
        this.authorizationInfoDto = authorizationInfoDto;
    }

    @Override
    public String toString() {
        return "GetAuthorizerInfoResponse{" +
                "authorizerInfoDto=" + authorizerInfoDto +
                ", authorizationInfoDto=" + authorizationInfoDto +
                '}';
    }
}
