package com.sky.open.wx.sdk.response.webviewauth;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 这里通过code换取的是一个特殊的网页授权access_token,
 * 与基础支持中的access_token（该access_token用于调用其他接口）不同。
 * 如果网页授权的作用域为snsapi_base，则本步骤中获取到网页授权access_token的同时，也获取到了openid;
 * snsapi_base式的网页授权流程即到此为止;
 *
 * @author shipj
 * @create 2018-01-30-16:03
 */

public class GetWebViewAuthTokenResponse extends WechatResponse {

    private static final long serialVersionUID = -1909759823796481036L;
    /**
     * 网页授权接口调用凭证,注意：此access_token与基础支持的access_token不同
     */
    @JSONField(name = "access_token")
    private String accessToken;

    /**
     * access_token接口调用凭证超时时间，单位（秒）
     */
    @JSONField(name = "expires_in")
    private Integer expiresIn;

    /**
     * 用户刷新access_token
     */
    @JSONField(name = "refresh_token")
    private String refreshToken;

    /**
     * 用户唯一标识，请注意，在未关注公众号时，用户访问公众号的网页，也会产生一个用户和公众号唯一的OpenID
     */
    @JSONField(name = "openid")
    private String openid;

    /**
     * 用户授权的作用域，使用逗号（,）分隔
     */
    @JSONField(name = "scope")
    private String scope;

    public GetWebViewAuthTokenResponse() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "GetWebViewAuthTokenResponse{" +
                "accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", refreshToken='" + refreshToken + '\'' +
                ", openid='" + openid + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
