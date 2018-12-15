package com.sky.open.wx.sdk;

import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.internal.utils.StringUtils;
import com.sky.open.wx.sdk.internal.utils.WebUtils;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.WechatResponse;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 微信api客户端
 *
 * @author shipj
 * @create 2017-11-15-17:44
 */

public abstract class AbsWechatClient implements WechatClient{

    /**
     * 是否使用代理
     */
    protected boolean useProxy = false;
    /**
     * 如果使用代理，提供代理的url
     */
    protected String proxyUrl = "";
    /**
     * 如果使用代理，提供代理的端口号
     */
    protected int proxyPort = 8080;

    /**
     * 默认构造器
     */
    public AbsWechatClient() {
        this.proxyPort = 8080;
        this.useProxy = false;
        this.proxyUrl = "";
    }

    public AbsWechatClient(boolean useProxy, String proxyUrl, int proxyPort) {
        this.useProxy = useProxy;
        this.proxyUrl = proxyUrl;
        this.proxyPort = proxyPort;
    }

    public void setUseProxy(boolean useProxy) {
        this.useProxy = useProxy;
    }

    public void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * 执行向微信端发送请求
     * @param request 具体的请求bean
     * @param <T> 响应类型的泛型
     * @return 微信端的响应
     * @throws WechatApiException 接口各种异常信息
     */
    public <T extends WechatResponse> T execute(WechatRequest<T> request) throws WechatApiException {
        T response = null;
        Map<String,String> tags = new HashMap<>();
        tags.put("api",request.getClass().getSimpleName());
        try {
            if(useProxy && StringUtils.isEmpty(proxyUrl)){
                throw new WechatApiException("使用代理，需要提供代理url");
            }

            String responseStr = sendRequest(request.getRequestUrl(),request.getUrlParams(),request.getPostBody(),request.isGetMethod());

            if(StringUtils.isEmpty(responseStr)){
                throw new WechatApiException("微信端没有响应信息");
            }
            response = JSON.parseObject(responseStr,request.getResponseClass());
            return response;
        }finally {
            tags.put("errcode",null == response ? "-1" : response.getErrcode());
        }

    }

    private String sendRequest(String url,Map<String,String> urlParams,String postBody,boolean get) throws WechatApiException {
        String responseStr;
        try {
            if(get){
                responseStr = WebUtils.doGet(url,urlParams,useProxy,proxyUrl,proxyPort);
            }else {
                responseStr = WebUtils.doPost(url,postBody,urlParams,useProxy,proxyUrl,proxyPort);
            }
        } catch (IOException e) {
            throw new WechatApiException("客户端执行网络请求异常，调用的地址：" + url,e);
        }
        return responseStr;
    }
}
