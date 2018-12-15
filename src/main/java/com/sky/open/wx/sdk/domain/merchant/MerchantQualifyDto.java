package com.sky.open.wx.sdk.domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * 门吊小程序需要的资质证书
 *
 * @author shipj
 * @create 2017-12-15-18:20
 */

public class MerchantQualifyDto extends WechatObject {
    private static final long serialVersionUID = 6222722422310064218L;
    /**
     * 证件名称列表
     */
    @JSONField(name = "exter_list")
    private List<QualifyExterDto> exterList;

    public MerchantQualifyDto() {
    }

    public List<QualifyExterDto> getExterList() {
        return exterList;
    }

    public void setExterList(List<QualifyExterDto> exterList) {
        this.exterList = exterList;
    }

    @Override
    public String toString() {
        return "MerchantQualifyDto{" +
                "exterList=" + exterList +
                '}';
    }
}
