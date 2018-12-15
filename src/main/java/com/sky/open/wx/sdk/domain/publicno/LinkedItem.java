package com.sky.open.wx.sdk.domain.publicno;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * 关联的小程序项
 */
public class LinkedItem extends WechatObject {

    private static final long serialVersionUID = 6781490852365918158L;
    /**
     * 关联状态:
     *  1：已关联；
        2：等待小程序管理员确认中；
        3：小程序管理员拒绝关联
        12：等到公众号管理员确认中；
     */
    @JSONField(name = "status")
    private Integer status;

    /**
     * 小程序原始id
     */
    @JSONField(name = "username")
    private String username;

    /**
     * 小程序昵称
     */
    @JSONField(name = "nickname")
    private String nickname;

    /**
     * 是否在公众号管理页展示中
     */
    @JSONField(name = "selected")
    private Integer selected;

    /**
     * 是否展示在附近的小程序中
     */
    @JSONField(name = "nearby_display_status")
    private Integer nearbyDisplayStatus;

    /**
     * 是否已经发布
     */
    @JSONField(name = "released")
    private Integer released;

    /**
     * 头像url
     */
    @JSONField(name = "headimg_url")
    private String headimgUrl;

    /**
     * 微信认证及支付信息，0表示未开通，1表示开通
     */
    @JSONField(name = "func_infos")
    private List<FuncInfo> funcInfos;

    /**
     *
     */
    @JSONField(name = "copy_verify_status")
    private Integer copyVerifyStatus;

    /**
     * 小程序邮箱
     */
    @JSONField(name = "email")
    private String email;


    public LinkedItem() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Integer getNearbyDisplayStatus() {
        return nearbyDisplayStatus;
    }

    public void setNearbyDisplayStatus(Integer nearbyDisplayStatus) {
        this.nearbyDisplayStatus = nearbyDisplayStatus;
    }

    public Integer getReleased() {
        return released;
    }

    public void setReleased(Integer released) {
        this.released = released;
    }

    public String getHeadimgUrl() {
        return headimgUrl;
    }

    public void setHeadimgUrl(String headimgUrl) {
        this.headimgUrl = headimgUrl;
    }

    public List<FuncInfo> getFuncInfos() {
        return funcInfos;
    }

    public void setFuncInfos(List<FuncInfo> funcInfos) {
        this.funcInfos = funcInfos;
    }

    public Integer getCopyVerifyStatus() {
        return copyVerifyStatus;
    }

    public void setCopyVerifyStatus(Integer copyVerifyStatus) {
        this.copyVerifyStatus = copyVerifyStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LinkedItem{" +
                "status=" + status +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", selected=" + selected +
                ", nearbyDisplayStatus=" + nearbyDisplayStatus +
                ", released=" + released +
                ", headimgUrl='" + headimgUrl + '\'' +
                ", funcInfos=" + funcInfos +
                ", copyVerifyStatus=" + copyVerifyStatus +
                ", email='" + email + '\'' +
                '}';
    }
}
