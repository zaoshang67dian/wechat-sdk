package com.sky.open.wx.sdk.request.custommsg;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.custommsg.*;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.custommsg.CustomMsgSendResponse;

/**
 * 微信公众号客服消息发送请求
 * @date 2018/3/8 16:04
 */
public class CustomMsgSendRequest extends WechatRequest<CustomMsgSendResponse> {

    /**
     * 普通用户openid，必填
     */
    @JSONField(name = "touser")
    private String toUser;

    /**
     * 消息类型，（一下只能选择其中一个）
     *  文本为text；
     *  图片为image；
     *  语音为voice；
     *  视频消息为video；
     *  音乐消息为music；
     *  图文消息（点击跳转到外链）为news；
     *  图文消息（点击跳转到图文消息页面）为mpnews；
     *  卡券为wxcard；
     *  小程序为miniprogrampage
     */
    @JSONField(name = "msgtype")
    private String msgType;

    /**
     * 文本消息
     */
    @JSONField(name = "text")
    private TextMsgDto text;

    /**
     * 图片消息
     */
    @JSONField(name = "image")
    private ImageMsgDto image;

    /**
     * 音频消息
     */
    @JSONField(name = "voice")
    private VoiceMsgDto voice;

    /**
     * 视频消息
     */
    @JSONField(name = "video")
    private VideoMsgDto video;

    /**
     * 音乐消息
     */
    @JSONField(name = "music")
    private MusicMsgDto music;

    /**
     * 文本消息
     */
    @JSONField(name = "news")
    private NewsListMsgDto news;

    /**
     * 单个文本消息
     */
    @JSONField(name = "mpnews")
    private MpNewsMsgDto mpnews;

    /**
     * 小程序卡片
     */
    @JSONField(name = "miniprogrampage")
    private MiniprogrampageMsgDto miniProgramPage;

    /**
     * 如果需要以某个客服帐号来发消息（在微信6.0.2及以上版本中显示自定义头像），则需在JSON数据包的后半部分加入customservice参数
     */
    @JSONField(name = "customservice")
    private CustomServiceDto customservice;

    public CustomMsgSendRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.WX_CUSTOM_MSG_SEND;
    }

    public CustomMsgSendRequest(String toUser, String msgType, TextMsgDto text, ImageMsgDto image, VoiceMsgDto voice, VideoMsgDto video, MusicMsgDto music, NewsListMsgDto news, MpNewsMsgDto mpnews, MiniprogrampageMsgDto miniProgramPage, CustomServiceDto customservice) {
        this.toUser = toUser;
        this.msgType = msgType;
        this.text = text;
        this.image = image;
        this.voice = voice;
        this.video = video;
        this.music = music;
        this.news = news;
        this.mpnews = mpnews;
        this.miniProgramPage = miniProgramPage;
        this.customservice = customservice;
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.WX_CUSTOM_MSG_SEND;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public TextMsgDto getText() {
        return text;
    }

    public void setText(TextMsgDto text) {
        this.text = text;
    }

    public ImageMsgDto getImage() {
        return image;
    }

    public void setImage(ImageMsgDto image) {
        this.image = image;
    }

    public VoiceMsgDto getVoice() {
        return voice;
    }

    public void setVoice(VoiceMsgDto voice) {
        this.voice = voice;
    }

    public VideoMsgDto getVideo() {
        return video;
    }

    public void setVideo(VideoMsgDto video) {
        this.video = video;
    }

    public MusicMsgDto getMusic() {
        return music;
    }

    public void setMusic(MusicMsgDto music) {
        this.music = music;
    }

    public NewsListMsgDto getNews() {
        return news;
    }

    public void setNews(NewsListMsgDto news) {
        this.news = news;
    }

    public MpNewsMsgDto getMpnews() {
        return mpnews;
    }

    public void setMpnews(MpNewsMsgDto mpnews) {
        this.mpnews = mpnews;
    }

    public MiniprogrampageMsgDto getMiniProgramPage() {
        return miniProgramPage;
    }

    public void setMiniProgramPage(MiniprogrampageMsgDto miniProgramPage) {
        this.miniProgramPage = miniProgramPage;
    }

    public CustomServiceDto getCustomservice() {
        return customservice;
    }

    public void setCustomservice(CustomServiceDto customservice) {
        this.customservice = customservice;
    }

    @Override
    public String toString() {
        return "CustomMsgSendRequest{" +
                "toUser='" + toUser + '\'' +
                ", msgType='" + msgType + '\'' +
                ", text=" + text +
                ", image=" + image +
                ", voice=" + voice +
                ", video=" + video +
                ", music=" + music +
                ", news=" + news +
                ", mpnews=" + mpnews +
                ", miniProgramPage=" + miniProgramPage +
                ", customservice=" + customservice +
                '}';
    }

    @Override
    public Class<CustomMsgSendResponse> getResponseClass() {
        return CustomMsgSendResponse.class;
    }
}
