package com.sky.open.wx.sdk.domain.material;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 图文消息类型的苏驰
 *
 * @author shipj
 * @create 2017-12-28-18:03
 */

public class NewsMaterial extends WechatObject {

    private static final long serialVersionUID = 8830312647204864350L;
    /**
     * 图文消息的标题
     */
    @JSONField(name = "title")
    private String title;
    /**
     * 图文消息的封面图片素材id（必须是永久mediaID）
     */
    @JSONField(name = "thumb_media_id")
    private String thumbMediaId;
    /**
     * 是否显示封面，0为false，即不显示，1为true，即显示
     */
    @JSONField(name = "show_cover_pic")
    private Integer showCoverPic;
    /**
     * 作者
     */
    @JSONField(name = "author")
    private String author;
    /**
     * 图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空
     */
    @JSONField(name = "digest")
    private String digest;
    /**
     * 图文消息的具体内容，支持HTML标签，必须少于2万字符，小于1M，且此处会去除JS
     */
    @JSONField(name = "content")
    private String content;
    /**
     * 图文页的URL
     */
    @JSONField(name = "url")
    private String url;
    /**
     * 图文消息的原文地址，即点击“阅读原文”后的URL
     */
    @JSONField(name = "content_source_url")
    private String contentSourceUrl;

    public NewsMaterial() {
    }

    public NewsMaterial(String title, String thumbMediaId, Integer showCoverPic, String author, String digest, String content, String url, String contentSourceUrl) {
        this.title = title;
        this.thumbMediaId = thumbMediaId;
        this.showCoverPic = showCoverPic;
        this.author = author;
        this.digest = digest;
        this.content = content;
        this.url = url;
        this.contentSourceUrl = contentSourceUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public Integer getShowCoverPic() {
        return showCoverPic;
    }

    public void setShowCoverPic(Integer showCoverPic) {
        this.showCoverPic = showCoverPic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentSourceUrl() {
        return contentSourceUrl;
    }

    public void setContentSourceUrl(String contentSourceUrl) {
        this.contentSourceUrl = contentSourceUrl;
    }

    @Override
    public String toString() {
        return "NewsMaterial{" +
                "title='" + title + '\'' +
                ", thumbMediaId='" + thumbMediaId + '\'' +
                ", showCoverPic=" + showCoverPic +
                ", author='" + author + '\'' +
                ", digest='" + digest + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", contentSourceUrl='" + contentSourceUrl + '\'' +
                '}';
    }
}
