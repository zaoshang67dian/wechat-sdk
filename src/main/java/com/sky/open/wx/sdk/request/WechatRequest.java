package com.sky.open.wx.sdk.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.internal.utils.StringUtils;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 微信api请求抽象
 *
 * @author shipj
 * @create 2017-11-15-18:08
 */

public abstract class WechatRequest<T extends WechatResponse> {
    /**
     * 微信接口的url
     */
    protected String requestUrl;
    /**
     * 接口请求的方法（true：GET;false：POST）
     */
    protected boolean getMethod;

    /**
     * 接口调用需要的 api access_token
     */
    protected String accessToken;

    /**
     * 第三方平台需要的api 调用凭证； component_access_token
     */
    protected String componentAccessToken;

    public WechatRequest() {
    }

    public WechatRequest(String requestUrl, boolean getMethod) {
        this.requestUrl = requestUrl;
        this.getMethod = getMethod;
    }

    public boolean isGetMethod() {
        return getMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * 所有的请求体需要明确接口是否需要url参数，如果需要则组织成map，不需要直接返回null
     *
     * @return 请求url的上的参数
     */
    public Map<String, String> getUrlParams() {
        Map<String, String> params = new HashMap<>();
        if (!StringUtils.isEmpty(accessToken)) {
            params.put("access_token", accessToken);
        }

        if (!StringUtils.isEmpty(componentAccessToken)){
            params.put("component_access_token", componentAccessToken);
        }

        return params;
    }


    /**
     * 通过反射获取接口请求的post报文
     *
     * @return 请求接口报文
     * @throws WechatApiException 微信api异常
     */
    public String getPostBody() throws WechatApiException {
        Map<String, Object> requstMap = new HashMap<>();

        Field[] fields = this.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            JSONField fieldAnotation = field.getAnnotation(JSONField.class);
            String fieldName = field.getName();
            String first = fieldName.substring(0, 1);
            String getMethodName = "get" + fieldName.replaceFirst(first, first.toUpperCase());

            Method method = null;
            try {
                method = this.getClass().getDeclaredMethod(getMethodName, null);
            } catch (NoSuchMethodException e) {
                throw new WechatApiException("没有指定的请求字段", e);
            }
            try {
                requstMap.put(fieldAnotation.name(), method.invoke(this, null));
            } catch (IllegalAccessException e) {
                throw new WechatApiException("指定的字段不可访问", e);
            } catch (InvocationTargetException e) {
                throw new WechatApiException("目标方法执行异常", e);
            }
        }
        return JSON.toJSONString(requstMap);
    }

    /**
     * 获取请求体对应的响应体的类型信息，方便序列化
     *
     * @return clazz
     */
    public abstract Class<T> getResponseClass();
}
