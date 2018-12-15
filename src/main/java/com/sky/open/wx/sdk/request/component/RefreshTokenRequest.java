package com.sky.open.wx.sdk.request.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.component.RefreshTokenResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 刷新授权方api调用凭证
 *
 * @author shipj
 * @create 2017-12-12-13:25
 */

public class RefreshTokenRequest extends WechatRequest<RefreshTokenResponse>{

    /**
     * 第三方平台appid
     */
    @JSONField(name = "component_appid")
    private String componentAppid;
    /**
     * 授权方appid
     */
    @JSONField(name = "authorizer_appid")
    private String authorizerAppid;
    /**
     * 授权方的刷新令牌，刷新令牌主要用于第三方平台获取和刷新已授权用户的access_token，只会在授权时刻提供，请妥善保存。一旦丢失，只能让用户重新授权，才能再次拿到新的刷新令牌
     */
    @JSONField(name = "authorizer_refresh_token")
    private String authorizerRefreshToken;

    public RefreshTokenRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.COMPONENT_ACCESS_TOKEN;
    }

    public String getComponentAppid() {
        return componentAppid;
    }

    public void setComponentAppid(String componentAppid) {
        this.componentAppid = componentAppid;
    }

    public String getAuthorizerAppid() {
        return authorizerAppid;
    }

    public void setAuthorizerAppid(String authorizerAppid) {
        this.authorizerAppid = authorizerAppid;
    }

    public String getAuthorizerRefreshToken() {
        return authorizerRefreshToken;
    }

    public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
        this.authorizerRefreshToken = authorizerRefreshToken;
    }

    @Override
    public Class<RefreshTokenResponse> getResponseClass() {
        return RefreshTokenResponse.class;
    }

    @Override
    public String getPostBody() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("component_appid",componentAppid);
        requestMap.put("authorizer_appid",authorizerAppid);
        requestMap.put("authorizer_refresh_token",authorizerRefreshToken);

        return JSON.toJSONString(requestMap);
    }
}
