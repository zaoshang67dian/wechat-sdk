package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 使用限制
 *
 * @author shipj
 * @create 2017-11-16-14:42
 */

public class UseConditionDto extends WechatObject {
    private static final long serialVersionUID = -8854664395212462291L;

    /**
     * 指定可用的商品类目，仅用于代金券类型，
     * 填入后将在券面拼写适用于xxx，
     * 标题自动拼为xxx减50元（若仅填入5个字），50元代金券（填入5个字以上）
     */
    @JSONField(name="accept_category")
    private String acceptCategory;

    /**
     * 指定不可用的商品类目，仅用于代金券类型，填入后将在券面拼写不适用于xxx
     */
    @JSONField(name = "reject_category")
    private String rejectCategory;

    /**
     * 满减门槛字段，可用于兑换券和代金券，填入后将在全面拼写消费满xx元可用，标题自动拼为满xx减xx/满xx送xx(gift_name)
     */
    @JSONField(name = "least_cost")
    private int leastCost;

    /**
     * 购买xx可用类型门槛，仅用于兑换，填入后自动拼写购买xxx可用，标题自动拼为买xx送xx(gift_name)
     */
    @JSONField(name = "object_use_for")
    private String objectUseFor;

    /**
     * 不可以与其他类型共享门槛，填写false时系统将在使用须知里拼写不可与其他优惠共享，默认为true
     */
    @JSONField(name = "can_use_with_other_discount")
    private boolean canUseWithOtherDiscount;

    public UseConditionDto() {
    }

    public String getAcceptCategory() {
        return acceptCategory;
    }

    public void setAcceptCategory(String acceptCategory) {
        this.acceptCategory = acceptCategory;
    }

    public String getRejectCategory() {
        return rejectCategory;
    }

    public void setRejectCategory(String rejectCategory) {
        this.rejectCategory = rejectCategory;
    }

    public int getLeastCost() {
        return leastCost;
    }

    public void setLeastCost(int leastCost) {
        this.leastCost = leastCost;
    }

    public String getObjectUseFor() {
        return objectUseFor;
    }

    public void setObjectUseFor(String objectUseFor) {
        this.objectUseFor = objectUseFor;
    }

    public boolean isCanUseWithOtherDiscount() {
        return canUseWithOtherDiscount;
    }

    public void setCanUseWithOtherDiscount(boolean canUseWithOtherDiscount) {
        this.canUseWithOtherDiscount = canUseWithOtherDiscount;
    }

    @Override
    public String toString() {
        return "UseConditionDto{" +
                "acceptCategory='" + acceptCategory + '\'' +
                ", rejectCategory='" + rejectCategory + '\'' +
                ", leastCost=" + leastCost +
                ", objectUseFor='" + objectUseFor + '\'' +
                ", canUseWithOtherDiscount=" + canUseWithOtherDiscount +
                '}';
    }
}
