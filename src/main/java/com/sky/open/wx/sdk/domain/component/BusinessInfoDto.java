package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 用以了解以下功能的开通状况（0代表未开通，1代表已开通）：
 *
 * @author shipj
 * @create 2017-12-12-14:07
 */

public class BusinessInfoDto extends WechatObject {

    private static final long serialVersionUID = -2552163576546369261L;
    /**
     * 是否开通微信门店功能
     */
    @JSONField(name = "open_store")
    private Integer openStore;
    /**
     * 是否开通微信扫商品功能
     */
    @JSONField(name = "open_scan")
    private Integer openScan;
    /**
     * 是否开通微信支付功能
     */
    @JSONField(name = "open_pay")
    private Integer openPay;
    /**
     * 是否开通微信卡券功能
     */
    @JSONField(name = "open_card")
    private Integer openCard;
    /**
     * 是否开通微信摇一摇功能
     */
    @JSONField(name = "open_shake")
    private Integer openShake;

    public BusinessInfoDto() {
    }

    public Integer getOpenStore() {
        return openStore;
    }

    public void setOpenStore(Integer openStore) {
        this.openStore = openStore;
    }

    public Integer getOpenScan() {
        return openScan;
    }

    public void setOpenScan(Integer openScan) {
        this.openScan = openScan;
    }

    public Integer getOpenPay() {
        return openPay;
    }

    public void setOpenPay(Integer openPay) {
        this.openPay = openPay;
    }

    public Integer getOpenCard() {
        return openCard;
    }

    public void setOpenCard(Integer openCard) {
        this.openCard = openCard;
    }

    public Integer getOpenShake() {
        return openShake;
    }

    public void setOpenShake(Integer openShake) {
        this.openShake = openShake;
    }

    @Override
    public String toString() {
        return "BusinessInfoDto{" +
                "openStore=" + openStore +
                ", openScan=" + openScan +
                ", openPay=" + openPay +
                ", openCard=" + openCard +
                ", openShake=" + openShake +
                '}';
    }
}
