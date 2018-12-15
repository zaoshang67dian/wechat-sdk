package com.sky.open.wx.sdk;


import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * @author shipj
 * @create 2017-12-07-20:31
 */

public interface WechatClient {
    /**
     * 执行向微信端发送请求
     * @param request 具体的请求bean
     * @param <T> 响应类型的泛型
     * @return 微信端的响应
     * @throws WechatApiException 接口各种异常信息
     */
    public <T extends WechatResponse> T execute(WechatRequest<T> request) throws WechatApiException;
}
