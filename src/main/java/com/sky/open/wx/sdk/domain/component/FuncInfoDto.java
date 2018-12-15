package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

/**
 * 小程序授权给开发者的权限集列表
 * @author shipj
 * @create 2017-12-11-21:33
 */

public class FuncInfoDto extends WechatObject {

    private static final long serialVersionUID = 3556167992506956709L;
    @JSONField(name = "funcscope_category")
    private FuncscopeCategoryDto funcscopeCategoryDto;

    public FuncInfoDto() {
    }

    public FuncscopeCategoryDto getFuncscopeCategoryDto() {
        return funcscopeCategoryDto;
    }

    public void setFuncscopeCategoryDto(FuncscopeCategoryDto funcscopeCategoryDto) {
        this.funcscopeCategoryDto = funcscopeCategoryDto;
    }

    @Override
    public String toString() {
        return "FuncInfoDto{" +
                "funcscopeCategoryDto=" + funcscopeCategoryDto +
                '}';
    }
}
