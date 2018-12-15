package com.sky.open.wx.sdk.domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * @author shipj
 * @create 2017-12-15-18:21
 */

public class QualifyExterDto extends WechatObject {

    private static final long serialVersionUID = -7760928755292286607L;
    /**
     * 创建门店小程序需要的证书名称列表
     */
    @JSONField(name = "inner_list")
    private List<ExterInnerDto> innerList;

    public QualifyExterDto() {
    }

    public List<ExterInnerDto> getInnerList() {
        return innerList;
    }

    public void setInnerList(List<ExterInnerDto> innerList) {
        this.innerList = innerList;
    }

    @Override
    public String toString() {
        return "QualifyExterDto{" +
                "innerList=" + innerList +
                '}';
    }
}
