package com.sky.open.wx.sdk;

import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.request.publicno.GetAppTokenRequest;
import com.sky.open.wx.sdk.response.publicno.GetAppTokenResponse;

/**
 * 微信api默认客户端
 *
 * @author shipj
 * @create 2017-11-15-18:27
 */

public class WechatDefaultClient extends AbsWechatClient {

    public WechatDefaultClient() {
        super();
    }

    public WechatDefaultClient(boolean useProxy, String proxyUrl, int proxyPort) {
        super(useProxy, proxyUrl, proxyPort);
    }

    public static void main(String[] args) {
        WechatDefaultClient client = new WechatDefaultClient();
        GetAppTokenRequest request = new GetAppTokenRequest();
        request.setAppId("wx179423ee7fe2a907");
        request.setSecret("92a755c08fc8c879264e6685ec06bd63");

        try {
            GetAppTokenResponse response = client.execute(request);
            System.out.println(response);
        } catch (WechatApiException e) {
            e.printStackTrace();
        }
    }

}
