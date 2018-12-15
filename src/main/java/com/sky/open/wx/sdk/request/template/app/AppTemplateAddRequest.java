package com.sky.open.wx.sdk.request.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.app.AppTemplateAddResponse;

import java.util.List;

/**
 * 组合模板并添加至帐号下的个人模板库
 *
 * @author shipj
 * @create 2017-12-15-12:57
 */

public class AppTemplateAddRequest extends WechatRequest<AppTemplateAddResponse> {

    /**
     *模板标题id，可通过接口获取，也可登录小程序后台查看获取
     */
    @JSONField(name = "id")
    private String id;

    /**
     *开发者自行组合好的模板关键词列表，关键词顺序可以自由搭配（例如[3,5,4]或[4,5,3]），最多支持10个关键词组合
     */
    @JSONField(name = "keyword_id_list")
    private List<Integer> keywordIdList;


    public AppTemplateAddRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_ADD_TMP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getKeywordIdList() {
        return keywordIdList;
    }

    public void setKeywordIdList(List<Integer> keywordIdList) {
        this.keywordIdList = keywordIdList;
    }

    @Override
    public Class<AppTemplateAddResponse> getResponseClass() {
        return AppTemplateAddResponse.class;
    }
}
