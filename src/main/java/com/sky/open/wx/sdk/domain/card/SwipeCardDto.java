package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;


import java.util.Arrays;

/**
 * @author shipj
 * @create 2017-11-16-14:38
 */

public class SwipeCardDto extends WechatObject {
    private static final long serialVersionUID = -3137717045362491053L;

    @JSONField(name = "create_mid")
    private String createMid;

    @JSONField(name = "use_mid_list")
    private String[] useMidList;

    public SwipeCardDto() {
    }

    public String getCreateMid() {
        return createMid;
    }

    public void setCreateMid(String createMid) {
        this.createMid = createMid;
    }

    public String[] getUseMidList() {
        return useMidList;
    }

    public void setUseMidList(String[] useMidList) {
        this.useMidList = useMidList;
    }

    @Override
    public String toString() {
        return "SwipeCardDto{" +
                "createMid='" + createMid + '\'' +
                ", useMidList=" + Arrays.toString(useMidList) +
                '}';
    }
}
