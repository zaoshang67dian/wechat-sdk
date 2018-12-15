package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


/**
 * 卡券信息
 *
 * @author shipj
 * @create 2017-11-16-11:03
 */

public class CardDto extends WechatObject {
    private static final long serialVersionUID = -637772375058154060L;

    //卡券的类型（团购券：GROUPON；代金券：CASH；折扣券：DISCOUNT；兑换券：GIFT；优惠券：GENERAL_COUPON；）
    @JSONField(name = "card_type")
    private String cardType;
    /**
     * 基本卡券数据，对于任何卡券类型base_info字段相同
     */
    @JSONField(name = "base_info")
    private BaseInfoDto baseInfoDto;
    /**
     * 创建优惠券特有的高级字段
     */
    @JSONField(name = "advanced_info")
    private AdvancedInfoDto advancedInfoDto;
    /**
     * 团购券特有字段
     */
    @JSONField(name = "deal_detail")
    private String dealDetail;
    /**
     * 代金券特有字段
     */
    @JSONField(name = "least_cost")
    private int leastCost;
    @JSONField(name = "reduce_cost")
    private int reduceCost;
    /**
     * 折扣券特有字段
     */
    @JSONField(name = "discount")
    private int discount;
    /**
     * 兑换券特有字段:兑换券类型时显示的礼品详情
     */
    @JSONField(name = "gift")
    private String gift;

    /**
     * 兑换券特有字段：兑换券兑换商品名字，限6个汉字
     */
    @JSONField(name = "gift_name")
    private String giftName;

    /**
     * 兑换券特有字段：兑换券兑换商品数目，限三位数字
     */
    @JSONField(name = "gift_num")
    private Integer giftNum;

    /**
     * 兑换券特有字段：兑换券兑换商品的数量单位，限两个汉字
     */
    @JSONField(name = "gift_unit")
    private String giftUnit;

    /**
     * 优惠券特有字段
     */
    @JSONField(name = "default_detail")
    private String defaultDetail;


    public CardDto() {
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public BaseInfoDto getBaseInfoDto() {
        return baseInfoDto;
    }

    public void setBaseInfoDto(BaseInfoDto baseInfoDto) {
        this.baseInfoDto = baseInfoDto;
    }

    public AdvancedInfoDto getAdvancedInfoDto() {
        return advancedInfoDto;
    }

    public void setAdvancedInfoDto(AdvancedInfoDto advancedInfoDto) {
        this.advancedInfoDto = advancedInfoDto;
    }

    public String getDealDetail() {
        return dealDetail;
    }

    public void setDealDetail(String dealDetail) {
        this.dealDetail = dealDetail;
    }

    public int getLeastCost() {
        return leastCost;
    }

    public void setLeastCost(int leastCost) {
        this.leastCost = leastCost;
    }

    public int getReduceCost() {
        return reduceCost;
    }

    public void setReduceCost(int reduceCost) {
        this.reduceCost = reduceCost;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getDefaultDetail() {
        return defaultDetail;
    }

    public void setDefaultDetail(String defaultDetail) {
        this.defaultDetail = defaultDetail;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public Integer getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }

    public String getGiftUnit() {
        return giftUnit;
    }

    public void setGiftUnit(String giftUnit) {
        this.giftUnit = giftUnit;
    }

    @Override
    public String toString() {
        return "CardDto{" +
                "cardType='" + cardType + '\'' +
                ", baseInfoDto=" + baseInfoDto +
                ", advancedInfoDto=" + advancedInfoDto +
                ", dealDetail='" + dealDetail + '\'' +
                ", leastCost=" + leastCost +
                ", reduceCost=" + reduceCost +
                ", discount=" + discount +
                ", gift='" + gift + '\'' +
                ", giftName='" + giftName + '\'' +
                ", giftNum=" + giftNum +
                ", giftUnit='" + giftUnit + '\'' +
                ", defaultDetail='" + defaultDetail + '\'' +
                '}';
    }
}
