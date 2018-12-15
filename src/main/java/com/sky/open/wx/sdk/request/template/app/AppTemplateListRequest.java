package com.sky.open.wx.sdk.request.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.app.AppTemplateListResponse;

/**
 * 获取小程序模板库标题列表
 *
 * @author shipj
 * @create 2017-12-15-10:22
 */

public class AppTemplateListRequest extends WechatRequest<AppTemplateListResponse> {

    /**
     * offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。
     */
    @JSONField(name = "offset")
    private Integer offset;

    /**
     * offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。
     */
    @JSONField(name = "count")
    private Integer count;

    public AppTemplateListRequest() {
        this.requestUrl = RequestUrlConst.APP_TMP_LIST;
        this.getMethod = false;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public Class<AppTemplateListResponse> getResponseClass() {
        return AppTemplateListResponse.class;
    }

}
