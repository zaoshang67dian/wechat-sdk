package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.SetAppNicknameResponse;

/**
 * 小程序名称设置及改名
 * @date 2018/4/12 19:24
 */
public class SetAppNicknameRequest extends WechatRequest<SetAppNicknameResponse> {

    /**
     * 昵称
     */
    @JSONField(name = "nick_name")
    private String nickName;
    /**
     * 身份证照片–临时素材mediaid
     */
    @JSONField(name = "id_card")
    private String idCard;
    /**
     * 组织机构代码证或营业执照–临时素材mediaid
     */
    @JSONField(name = "license")
    private String license;
    /**
     * 其他证明材料---临时素材 mediaid
     */
    @JSONField(name = "naming_other_stuff_1")
    private String namingOtherStuff1;
    /**
     * 其他证明材料---临时素材 mediaid
     */
    @JSONField(name = "naming_other_stuff_2")
    private String namingOtherStuff2;
    /**
     * 其他证明材料---临时素材 mediaid
     */
    @JSONField(name = "naming_other_stuff_3")
    private String namingOtherStuff3;
    /**
     * 其他证明材料---临时素材 mediaid
     */
    @JSONField(name = "naming_other_stuff_4")
    private String namingOtherStuff4;
    /**
     * 其他证明材料---临时素材 mediaid
     */
    @JSONField(name = "naming_other_stuff_5")
    private String namingOtherStuff5;


    public SetAppNicknameRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.SET_APP_NICKNAME;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getNamingOtherStuff1() {
        return namingOtherStuff1;
    }

    public void setNamingOtherStuff1(String namingOtherStuff1) {
        this.namingOtherStuff1 = namingOtherStuff1;
    }

    public String getNamingOtherStuff2() {
        return namingOtherStuff2;
    }

    public void setNamingOtherStuff2(String namingOtherStuff2) {
        this.namingOtherStuff2 = namingOtherStuff2;
    }

    public String getNamingOtherStuff3() {
        return namingOtherStuff3;
    }

    public void setNamingOtherStuff3(String namingOtherStuff3) {
        this.namingOtherStuff3 = namingOtherStuff3;
    }

    public String getNamingOtherStuff4() {
        return namingOtherStuff4;
    }

    public void setNamingOtherStuff4(String namingOtherStuff4) {
        this.namingOtherStuff4 = namingOtherStuff4;
    }

    public String getNamingOtherStuff5() {
        return namingOtherStuff5;
    }

    public void setNamingOtherStuff5(String namingOtherStuff5) {
        this.namingOtherStuff5 = namingOtherStuff5;
    }

    @Override
    public String toString() {
        return "SetAppNicknameRequest{" +
                "nickName='" + nickName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", license='" + license + '\'' +
                ", namingOtherStuff1='" + namingOtherStuff1 + '\'' +
                ", namingOtherStuff2='" + namingOtherStuff2 + '\'' +
                ", namingOtherStuff3='" + namingOtherStuff3 + '\'' +
                ", namingOtherStuff4='" + namingOtherStuff4 + '\'' +
                ", namingOtherStuff5='" + namingOtherStuff5 + '\'' +
                '}';
    }

    @Override
    public Class<SetAppNicknameResponse> getResponseClass() {
        return SetAppNicknameResponse.class;
    }
}
