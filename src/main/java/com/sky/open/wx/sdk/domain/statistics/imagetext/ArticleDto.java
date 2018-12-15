package com.sky.open.wx.sdk.domain.statistics.imagetext;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.List;

/**
 * 图文消息dto
 *
 * @author shipj
 * @create 2017-12-08-20:06
 */

public class ArticleDto extends WechatObject {
    private static final long serialVersionUID = -6662127880412770545L;

    @JSONField(name = "ref_date")
    private String refDate;
    @JSONField(name = "msgid")
    private String msgid;
    @JSONField(name = "title")
    private String title;
    @JSONField(name = "details")
    private List<ArticleDetailDto> details;

    public ArticleDto() {
    }

    public ArticleDto(String refDate, String msgid, String title, List<ArticleDetailDto> details) {
        this.refDate = refDate;
        this.msgid = msgid;
        this.title = title;
        this.details = details;
    }

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ArticleDetailDto> getDetails() {
        return details;
    }

    public void setDetails(List<ArticleDetailDto> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "refDate='" + refDate + '\'' +
                ", msgid='" + msgid + '\'' +
                ", title='" + title + '\'' +
                ", details=" + details +
                '}';
    }
}
