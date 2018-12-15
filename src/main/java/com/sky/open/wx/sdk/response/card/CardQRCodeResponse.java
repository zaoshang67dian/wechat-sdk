package com.sky.open.wx.sdk.response.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * @date 2018/3/5 10:19
 */
public class CardQRCodeResponse extends WechatResponse {

    private static final long serialVersionUID = 3029823580169263033L;
    /**
     * 获取的二维码ticket，凭借此ticket调用 通过ticket换取二维码接口 可以在有效时间内换取二维码
     */
    @JSONField(name = "ticket")
    private String ticket;

    /**
     * 二维码图片解析后的地址，开发者可根据该地址自行生成需要的二维码图片
     */
    @JSONField(name = "url")
    private String url;

    /**
     * 二维码显示地址，点击后跳转二维码页面
     */
    @JSONField(name = "show_qrcode_url")
    private String showQrcodeUrl;

    public CardQRCodeResponse() {
    }

    public CardQRCodeResponse(String ticket, String url, String showQrcodeUrl) {
        this.ticket = ticket;
        this.url = url;
        this.showQrcodeUrl = showQrcodeUrl;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShowQrcodeUrl() {
        return showQrcodeUrl;
    }

    public void setShowQrcodeUrl(String showQrcodeUrl) {
        this.showQrcodeUrl = showQrcodeUrl;
    }

    @Override
    public String toString() {
        return "CardQRCodeResponse{" +
                "ticket='" + ticket + '\'' +
                ", url='" + url + '\'' +
                ", showQrcodeUrl='" + showQrcodeUrl + '\'' +
                '}';
    }
}
