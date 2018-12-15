package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.appconf.Certicate;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.ModifyCategoryResponse;

import java.util.List;

/**
 * 更新小程序类目信息请求
 * @date 2018/5/4 11:29
 */
public class ModifyCategoryRequest extends WechatRequest<ModifyCategoryResponse> {

    /**
     * 需要更新的类目一级ID
     */
    @JSONField(name = "first")
    private Integer first;

    /**
     * 需要更新的类目二级ID
     */
    @JSONField(name = "second")
    private Integer second;

    /**
     * 认证资质文件列表
     */
    @JSONField(name = "certicates")
    private List<Certicate> certicates;

    public ModifyCategoryRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.MODIFY_OLD_CATEGORY;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public List<Certicate> getCerticates() {
        return certicates;
    }

    public void setCerticates(List<Certicate> certicates) {
        this.certicates = certicates;
    }

    @Override
    public Class<ModifyCategoryResponse> getResponseClass() {
        return ModifyCategoryResponse.class;
    }
}
