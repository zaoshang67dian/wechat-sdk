package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 卡券库存
 *
 * @author shipj
 * @create 2017-11-16-11:40
 */

public class SkuDto extends WechatObject {
    private static final long serialVersionUID = -1330096110412589591L;

    @JSONField(name = "quantity")
    private int quantity;

    @JSONField(name = "total_quantity")
    private int totalQuantity;

    public SkuDto() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return "SkuDto{" +
                "quantity=" + quantity +
                ", totalQuantity=" + totalQuantity +
                '}';
    }
}
