package com.sky.open.wx.sdk;


import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;

/**
 * 获取小程序体验码请求
 * @date 2018/5/9 11:14
 */
public class DownloadTestCodeRequest {
    /**
     * 默认
     */
    private String url = RequestUrlConst.APP_TESER_CODE;
    /**
     * 指定体验版二维码跳转到某个具体页面（如果不需要的话，则不需要填path参数，可在路径后以“?参数”方式传入参数）
     具体的路径加参数需要urlencode，比如page/index?action=1编码后得到page%2Findex%3Faction%3D1
     */
    private String path;

    public DownloadTestCodeRequest() {
    }

    public DownloadTestCodeRequest(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "DownloadTestCodeRequest{" +
                "url='" + url + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
