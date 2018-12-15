package com.sky.open.wx.sdk.internal.exception;

/**
 * 微信api异常类
 *
 * @author shipj
 * @create 2017-12-18-14:43
 */

public class WechatApiException extends Exception{
    private static final long serialVersionUID = -8308272593586821072L;

    public WechatApiException() {
        super();
    }

    public WechatApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public WechatApiException(String message) {
        super(message);
    }

    public WechatApiException(Throwable cause) {
        super(cause);
    }
}
