package com.sky.open.wx.sdk;

import com.sky.open.wx.sdk.response.WechatResponse;

/**
 * @date 2018/5/9 13:06
 */
public class DownloadTestCodeResponse extends WechatResponse {

    private byte[] data;

    public DownloadTestCodeResponse() {
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DownloadTestCodeResponse{" +
                "data=" + new String(data) +
                '}';
    }
}
