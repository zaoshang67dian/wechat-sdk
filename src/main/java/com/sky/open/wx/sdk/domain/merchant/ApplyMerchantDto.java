package com.sky.open.wx.sdk.domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 创建小程序门店DTO
 *
 * @author shipj
 * @create 2017-12-06-11:27
 */

public class ApplyMerchantDto extends WechatObject {
    private static final long serialVersionUID = 3991364231298171393L;

    @JSONField(name = "first_catid")
    private Integer firstCatid;

    @JSONField(name = "second_catid")
    private Integer secondCatid;

    @JSONField(name = "qualification_list")
    private String qualificationList;

    @JSONField(name = "headimg_mediaid")
    private String headimgMediaid;

    @JSONField(name = "nickname")
    private String nickname;

    @JSONField(name = "intro")
    private String intro;

    @JSONField(name = "org_code")
    private String orgCode;

    @JSONField(name = "other_files")
    private String otherFiles;

    public ApplyMerchantDto() {
    }

    public ApplyMerchantDto(Integer firstCatid, Integer secondCatid, String qualificationList, String headimgMediaid, String nickname, String intro, String orgCode, String otherFiles) {

        this.firstCatid = firstCatid;
        this.secondCatid = secondCatid;
        this.qualificationList = qualificationList;
        this.headimgMediaid = headimgMediaid;
        this.nickname = nickname;
        this.intro = intro;
        this.orgCode = orgCode;
        this.otherFiles = otherFiles;
    }

    public Integer getFirstCatid() {
        return firstCatid;
    }

    public void setFirstCatid(Integer firstCatid) {
        this.firstCatid = firstCatid;
    }

    public Integer getSecondCatid() {
        return secondCatid;
    }

    public void setSecondCatid(Integer secondCatid) {
        this.secondCatid = secondCatid;
    }

    public String getQualificationList() {
        return qualificationList;
    }

    public void setQualificationList(String qualificationList) {
        this.qualificationList = qualificationList;
    }

    public String getHeadimgMediaid() {
        return headimgMediaid;
    }

    public void setHeadimgMediaid(String headimgMediaid) {
        this.headimgMediaid = headimgMediaid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOtherFiles() {
        return otherFiles;
    }

    public void setOtherFiles(String otherFiles) {
        this.otherFiles = otherFiles;
    }

    @Override
    public String toString() {
        return "ApplyMerchantDto{" +
                "firstCatid=" + firstCatid +
                ", secondCatid=" + secondCatid +
                ", qualificationList='" + qualificationList + '\'' +
                ", headimgMediaid='" + headimgMediaid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", intro='" + intro + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", otherFiles='" + otherFiles + '\'' +
                '}';
    }
}
