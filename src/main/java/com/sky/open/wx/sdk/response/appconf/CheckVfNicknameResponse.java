package com.sky.open.wx.sdk.response.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.response.WechatResponse;


/**
 * 微信认证名称检测
 * @date 2018/4/16 14:40
 */
public class CheckVfNicknameResponse extends WechatResponse {

    private static final long serialVersionUID = 8527024497435088367L;
    /**
     * 是否命中关键字策略。若命中，可以选填关键字材料
     */
    @JSONField(name = "hit_condition")
    private Boolean hitCondition;

    /**
     * 命中关键字的说明描述（给用户看的）
     */
    @JSONField(name = "wording")
    private String wording;

    public CheckVfNicknameResponse() {
    }

    public Boolean getHitCondition() {
        return hitCondition;
    }

    public void setHitCondition(Boolean hitCondition) {
        this.hitCondition = hitCondition;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

    @Override
    public String toString() {
        return "CheckVfNicknameResponse{" +
                "hitCondition=" + hitCondition +
                ", wording='" + wording + '\'' +
                '}';
    }
}
