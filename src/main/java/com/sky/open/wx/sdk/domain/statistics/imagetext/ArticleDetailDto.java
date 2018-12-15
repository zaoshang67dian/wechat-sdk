package com.sky.open.wx.sdk.domain.statistics.imagetext;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 详情
 *
 * @author shipj
 * @create 2017-12-08-20:25
 */

public class ArticleDetailDto extends WechatObject {

    private static final long serialVersionUID = 67468939699276925L;
    @JSONField(name = "stat_date")
    private String statDate;
    @JSONField(name = "target_user")
    private Integer targetUser;
    @JSONField(name = "int_page_read_user")
    private Integer intPageReadUser;
    @JSONField(name = "int_page_read_count")
    private Integer intPageReadCount;
    @JSONField(name = "ori_page_read_user")
    private Integer oriPageReadUser;
    @JSONField(name = "ori_page_read_count")
    private Integer oriPageReadCount;
    @JSONField(name = "share_user")
    private Integer shareUser;
    @JSONField(name = "share_count")
    private Integer shareCount;
    @JSONField(name = "add_to_fav_user")
    private Integer addToFavUser;
    @JSONField(name = "add_to_fav_count")
    private Integer addToFavCount;
    @JSONField(name = "int_page_from_session_read_user")
    private Integer intPageFromSessionReadUser;
    @JSONField(name = "int_page_from_session_read_count")
    private Integer intPageFromSessionReadCount;
    @JSONField(name = "int_page_from_hist_msg_read_user")
    private Integer intPageFromHistMsgReadUser;
    @JSONField(name = "int_page_from_hist_msg_read_count")
    private Integer intPageFromHistMsgReadCount;
    @JSONField(name = "int_page_from_feed_read_user")
    private Integer intPageFromFeedReadUser;
    @JSONField(name = "int_page_from_feed_read_count")
    private Integer intPageFromFeedReadCount;
    @JSONField(name = "int_page_from_friends_read_user")
    private Integer intPageFromFriendsReadUser;
    @JSONField(name = "int_page_from_friends_read_count")
    private Integer intPageFromFriendsReadCount;
    @JSONField(name = "int_page_from_other_read_user")
    private Integer intPageFromOtherReadUser;
    @JSONField(name = "int_page_from_other_read_count")
    private Integer intPageFromOtherReadCount;
    @JSONField(name = "feed_share_from_session_user")
    private Integer feedShareFromSessionUser;
    @JSONField(name = "feed_share_from_session_cnt")
    private Integer feedShareFromSessionCnt;
    @JSONField(name = "feed_share_from_feed_user")
    private Integer feedShareFromFeedUser;
    @JSONField(name = "feed_share_from_feed_cnt")
    private Integer feedShareFromFeedCnt;
    @JSONField(name = "feed_share_from_other_user")
    private Integer feedShareFromOtherUser;
    @JSONField(name = "feed_share_from_other_cnt")
    private Integer feedShareFromOtherCnt;

    public ArticleDetailDto() {
    }

    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

    public Integer getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(Integer targetUser) {
        this.targetUser = targetUser;
    }

    public Integer getIntPageReadUser() {
        return intPageReadUser;
    }

    public void setIntPageReadUser(Integer intPageReadUser) {
        this.intPageReadUser = intPageReadUser;
    }

    public Integer getIntPageReadCount() {
        return intPageReadCount;
    }

    public void setIntPageReadCount(Integer intPageReadCount) {
        this.intPageReadCount = intPageReadCount;
    }

    public Integer getOriPageReadUser() {
        return oriPageReadUser;
    }

    public void setOriPageReadUser(Integer oriPageReadUser) {
        this.oriPageReadUser = oriPageReadUser;
    }

    public Integer getOriPageReadCount() {
        return oriPageReadCount;
    }

    public void setOriPageReadCount(Integer oriPageReadCount) {
        this.oriPageReadCount = oriPageReadCount;
    }

    public Integer getShareUser() {
        return shareUser;
    }

    public void setShareUser(Integer shareUser) {
        this.shareUser = shareUser;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getAddToFavUser() {
        return addToFavUser;
    }

    public void setAddToFavUser(Integer addToFavUser) {
        this.addToFavUser = addToFavUser;
    }

    public Integer getAddToFavCount() {
        return addToFavCount;
    }

    public void setAddToFavCount(Integer addToFavCount) {
        this.addToFavCount = addToFavCount;
    }

    public Integer getIntPageFromSessionReadUser() {
        return intPageFromSessionReadUser;
    }

    public void setIntPageFromSessionReadUser(Integer intPageFromSessionReadUser) {
        this.intPageFromSessionReadUser = intPageFromSessionReadUser;
    }

    public Integer getIntPageFromSessionReadCount() {
        return intPageFromSessionReadCount;
    }

    public void setIntPageFromSessionReadCount(Integer intPageFromSessionReadCount) {
        this.intPageFromSessionReadCount = intPageFromSessionReadCount;
    }

    public Integer getIntPageFromHistMsgReadUser() {
        return intPageFromHistMsgReadUser;
    }

    public void setIntPageFromHistMsgReadUser(Integer intPageFromHistMsgReadUser) {
        this.intPageFromHistMsgReadUser = intPageFromHistMsgReadUser;
    }

    public Integer getIntPageFromHistMsgReadCount() {
        return intPageFromHistMsgReadCount;
    }

    public void setIntPageFromHistMsgReadCount(Integer intPageFromHistMsgReadCount) {
        this.intPageFromHistMsgReadCount = intPageFromHistMsgReadCount;
    }

    public Integer getIntPageFromFeedReadUser() {
        return intPageFromFeedReadUser;
    }

    public void setIntPageFromFeedReadUser(Integer intPageFromFeedReadUser) {
        this.intPageFromFeedReadUser = intPageFromFeedReadUser;
    }

    public Integer getIntPageFromFeedReadCount() {
        return intPageFromFeedReadCount;
    }

    public void setIntPageFromFeedReadCount(Integer intPageFromFeedReadCount) {
        this.intPageFromFeedReadCount = intPageFromFeedReadCount;
    }

    public Integer getIntPageFromFriendsReadUser() {
        return intPageFromFriendsReadUser;
    }

    public void setIntPageFromFriendsReadUser(Integer intPageFromFriendsReadUser) {
        this.intPageFromFriendsReadUser = intPageFromFriendsReadUser;
    }

    public Integer getIntPageFromFriendsReadCount() {
        return intPageFromFriendsReadCount;
    }

    public void setIntPageFromFriendsReadCount(Integer intPageFromFriendsReadCount) {
        this.intPageFromFriendsReadCount = intPageFromFriendsReadCount;
    }

    public Integer getIntPageFromOtherReadUser() {
        return intPageFromOtherReadUser;
    }

    public void setIntPageFromOtherReadUser(Integer intPageFromOtherReadUser) {
        this.intPageFromOtherReadUser = intPageFromOtherReadUser;
    }

    public Integer getIntPageFromOtherReadCount() {
        return intPageFromOtherReadCount;
    }

    public void setIntPageFromOtherReadCount(Integer intPageFromOtherReadCount) {
        this.intPageFromOtherReadCount = intPageFromOtherReadCount;
    }

    public Integer getFeedShareFromSessionUser() {
        return feedShareFromSessionUser;
    }

    public void setFeedShareFromSessionUser(Integer feedShareFromSessionUser) {
        this.feedShareFromSessionUser = feedShareFromSessionUser;
    }

    public Integer getFeedShareFromSessionCnt() {
        return feedShareFromSessionCnt;
    }

    public void setFeedShareFromSessionCnt(Integer feedShareFromSessionCnt) {
        this.feedShareFromSessionCnt = feedShareFromSessionCnt;
    }

    public Integer getFeedShareFromFeedUser() {
        return feedShareFromFeedUser;
    }

    public void setFeedShareFromFeedUser(Integer feedShareFromFeedUser) {
        this.feedShareFromFeedUser = feedShareFromFeedUser;
    }

    public Integer getFeedShareFromFeedCnt() {
        return feedShareFromFeedCnt;
    }

    public void setFeedShareFromFeedCnt(Integer feedShareFromFeedCnt) {
        this.feedShareFromFeedCnt = feedShareFromFeedCnt;
    }

    public Integer getFeedShareFromOtherUser() {
        return feedShareFromOtherUser;
    }

    public void setFeedShareFromOtherUser(Integer feedShareFromOtherUser) {
        this.feedShareFromOtherUser = feedShareFromOtherUser;
    }

    public Integer getFeedShareFromOtherCnt() {
        return feedShareFromOtherCnt;
    }

    public void setFeedShareFromOtherCnt(Integer feedShareFromOtherCnt) {
        this.feedShareFromOtherCnt = feedShareFromOtherCnt;
    }

    @Override
    public String toString() {
        return "ArticleDetailDto{" +
                "statDate='" + statDate + '\'' +
                ", targetUser=" + targetUser +
                ", intPageReadUser=" + intPageReadUser +
                ", intPageReadCount=" + intPageReadCount +
                ", oriPageReadUser=" + oriPageReadUser +
                ", oriPageReadCount=" + oriPageReadCount +
                ", shareUser=" + shareUser +
                ", shareCount=" + shareCount +
                ", addToFavUser=" + addToFavUser +
                ", addToFavCount=" + addToFavCount +
                ", intPageFromSessionReadUser=" + intPageFromSessionReadUser +
                ", intPageFromSessionReadCount=" + intPageFromSessionReadCount +
                ", intPageFromHistMsgReadUser=" + intPageFromHistMsgReadUser +
                ", intPageFromHistMsgReadCount=" + intPageFromHistMsgReadCount +
                ", intPageFromFeedReadUser=" + intPageFromFeedReadUser +
                ", intPageFromFeedReadCount=" + intPageFromFeedReadCount +
                ", intPageFromFriendsReadUser=" + intPageFromFriendsReadUser +
                ", intPageFromFriendsReadCount=" + intPageFromFriendsReadCount +
                ", intPageFromOtherReadUser=" + intPageFromOtherReadUser +
                ", intPageFromOtherReadCount=" + intPageFromOtherReadCount +
                ", feedShareFromSessionUser=" + feedShareFromSessionUser +
                ", feedShareFromSessionCnt=" + feedShareFromSessionCnt +
                ", feedShareFromFeedUser=" + feedShareFromFeedUser +
                ", feedShareFromFeedCnt=" + feedShareFromFeedCnt +
                ", feedShareFromOtherUser=" + feedShareFromOtherUser +
                ", feedShareFromOtherCnt=" + feedShareFromOtherCnt +
                '}';
    }
}
