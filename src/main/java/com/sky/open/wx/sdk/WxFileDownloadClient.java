package com.sky.open.wx.sdk;


import com.alibaba.fastjson.JSON;
import com.sky.open.wx.sdk.internal.exception.WechatApiException;
import com.sky.open.wx.sdk.internal.utils.StringUtils;
import com.sky.open.wx.sdk.internal.utils.WebUtils;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;


public class WxFileDownloadClient {

    private String accessToken;
    private String proxyHost;
    private Integer proxyPort;
    private boolean userProxy = true;

    public WxFileDownloadClient(String accessToken, String proxyHost, Integer proxyPort) {
        this.accessToken = accessToken;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        if(StringUtils.isEmpty(proxyHost) || null == proxyPort){
            userProxy = false;
        }
    }

    /**
     * 获取体验二维码字节数组
     * @param request 请求
     * @return 字节数组
     * @throws WechatApiException 微信api异常
     */
    public DownloadTestCodeResponse downloadTestCode(DownloadTestCodeRequest request) throws WechatApiException {

        String url = request.getUrl() + accessToken;
        if(!StringUtils.isEmpty(request.getPath())){
            url += "&path=";
            url += URLEncoder.encode(request.getPath());
        }
        DownloadTestCodeResponse response = new DownloadTestCodeResponse();
        Map<String,String> tags = new HashMap<>();
        tags.put("api",request.getClass().getSimpleName());
        try {
            byte[] result = WebUtils.getFileBytes(url,null,userProxy,proxyHost,proxyPort);
            if(null == result){
                response.setErrcode("-1");
                response.setErrmsg("null resposne");
            }else if (1000 > result.length){
                response = JSON.parseObject(new String(result),DownloadTestCodeResponse.class);
            }else {
                response.setData(result);
            }
        }catch (IOException e){
            throw new WechatApiException("客户端执行GET方法异常，调用的地址：" + url,e);
        }finally {
        }

        return response;
    }
}
