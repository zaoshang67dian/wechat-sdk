package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * @date 2018/3/5 10:35
 */
public class CardQrDto extends WechatObject {
    private static final long serialVersionUID = -8038821685496168143L;
    /**
     * 卡券ID
     */
    @JSONField(name = "card_id")
    private String cardId;
    /**
     * 卡券Code码,use_custom_code字段为true的卡券必须填写，非自定义code和导入code模式的卡券不必填写
     */
    @JSONField(name = "code")
    private String code;
    /**
     * 指定领取者的openid，只有该用户能领取。bind_openid字段为true的卡券必须填写，非指定openid不必填写。
     */
    @JSONField(name = "openid")
    private String openid;
    /**
     * 指定下发二维码，生成的二维码随机分配一个code，领取后不可再次扫描。
     * 填写true或false。默认false，注意填写该字段时，卡券须通过审核且库存不为0
     */
    @JSONField(name = "is_unique_code")
    private boolean isUniqueCode;
    /**
     * outer_id字段升级版本，字符串类型，用户首次领卡时，会通过 领取事件推送 给商户；
     * 对于会员卡的二维码，用户每次扫码打开会员卡后点击任何url，会将该值拼入url中，方便开发者定位扫码来源
     */
    @JSONField(name = "outer_str")
    private String outerStr;

    public CardQrDto() {
    }

    public CardQrDto(String cardId, String code, String openid, boolean isUniqueCode, String outerStr) {
        this.cardId = cardId;
        this.code = code;
        this.openid = openid;
        this.isUniqueCode = isUniqueCode;
        this.outerStr = outerStr;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public boolean isUniqueCode() {
        return isUniqueCode;
    }

    public void setUniqueCode(boolean uniqueCode) {
        isUniqueCode = uniqueCode;
    }

    public String getOuterStr() {
        return outerStr;
    }

    public void setOuterStr(String outerStr) {
        this.outerStr = outerStr;
    }

    @Override
    public String toString() {
        return "CardQrDto{" +
                "cardId='" + cardId + '\'' +
                ", code='" + code + '\'' +
                ", openid='" + openid + '\'' +
                ", isUniqueCode=" + isUniqueCode +
                ", outerStr='" + outerStr + '\'' +
                '}';
    }
}
