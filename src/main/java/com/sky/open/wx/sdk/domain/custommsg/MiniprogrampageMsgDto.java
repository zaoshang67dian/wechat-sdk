package com.sky.open.wx.sdk.domain.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 发送小程序卡片（要求小程序与公众号已关联）
 * @date 2018/3/8 16:37
 */
public class MiniprogrampageMsgDto extends WechatObject {

    private static final long serialVersionUID = -7977644127548737939L;
    /**
     * 图文消息/视频消息/音乐消息/小程序卡片的标题（选填）
     */
    @JSONField(name = "title")
    private String title;

    /**
     * 小程序的appid，要求小程序的appid需要与公众号有关联关系（必填）
     */
    @JSONField(name = "appid")
    private String appid;

    /**
     * 小程序的页面路径，跟app.json对齐，支持参数，比如pages/index/index?foo=bar（必填）
     */
    @JSONField(name = "pagepath")
    private String pagePath;

    /**
     * 缩略图/小程序卡片图片的媒体ID，小程序卡片图片建议大小为520*416（必填）
     */
    @JSONField(name = "thumb_media_id")
    private String thumbMediaId;

    public MiniprogrampageMsgDto() {
    }

    public MiniprogrampageMsgDto(String title, String appid, String pagePath, String thumbMediaId) {
        this.title = title;
        this.appid = appid;
        this.pagePath = pagePath;
        this.thumbMediaId = thumbMediaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPagePath() {
        return pagePath;
    }

    public void setPagePath(String pagePath) {
        this.pagePath = pagePath;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    @Override
    public String toString() {
        return "MiniprogrampageMsgDto{" +
                "title='" + title + '\'' +
                ", appid='" + appid + '\'' +
                ", pagePath='" + pagePath + '\'' +
                ", thumbMediaId='" + thumbMediaId + '\'' +
                '}';
    }
}
