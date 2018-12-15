package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 授权信息
 *
 * @author shipj
 * @create 2017-12-11-21:27
 */

public class AuthorizationInfoDto extends WechatResponse {

    private static final long serialVersionUID = -8120699319869256283L;
    /**
     * 授权方appid
     */
    @JSONField(name = "authorizer_appid")
    private String authorizerAppid;
    /**
     * 授权方接口调用凭据（在授权的公众号或小程序具备API权限时，才有此返回值），也简称为令牌
     */
    @JSONField(name = "authorizer_access_token")
    private String authorizerAccessToken;
    /**
     * 接口调用凭据刷新令牌，刷新令牌主要用于第三方平台获取和刷新已授权用户的access_token，
     * 只会在授权时刻提供，请妥善保存。 一旦丢失，只能让用户重新授权，才能再次拿到新的刷新令牌
     */
    @JSONField(name = "authorizer_refresh_token")
    private String authorizerRefreshToken;
    /**
     * 有效期（在授权的公众号或小程序具备API权限时，才有此返回值）
     */
    @JSONField(name = "expires_in")
    private Integer expiresIn;
    /**
     * 授权给开发者的权限集列表
     */
    @JSONField(name = "func_info")
    private List<FuncInfoDto> funcInfoDtos;
    @JSONField(name = "appid")
    private String appid;

    public AuthorizationInfoDto() {
    }

    public String getAuthorizerAppid() {
        return authorizerAppid;
    }

    public void setAuthorizerAppid(String authorizerAppid) {
        this.authorizerAppid = authorizerAppid;
    }

    public String getAuthorizerAccessToken() {
        return authorizerAccessToken;
    }

    public void setAuthorizerAccessToken(String authorizerAccessToken) {
        this.authorizerAccessToken = authorizerAccessToken;
    }

    public String getAuthorizerRefreshToken() {
        return authorizerRefreshToken;
    }

    public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
        this.authorizerRefreshToken = authorizerRefreshToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public List<FuncInfoDto> getFuncInfoDtos() {
        return funcInfoDtos;
    }

    public void setFuncInfoDtos(List<FuncInfoDto> funcInfoDtos) {
        this.funcInfoDtos = funcInfoDtos;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Override
    public String toString() {
        return "AuthorizationInfoDto{" +
                "authorizerAppid='" + authorizerAppid + '\'' +
                ", authorizerAccessToken='" + authorizerAccessToken + '\'' +
                ", authorizerRefreshToken='" + authorizerRefreshToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", funcInfoDtos=" + funcInfoDtos +
                ", appid='" + appid + '\'' +
                '}';
    }
}
