package com.sky.open.wx.sdk.request.template.app;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.app.AppTmpOwnedListResponse;

/**
 * 获取帐号下已存在的模板列表
 *
 * @author shipj
 * @create 2017-12-15-15:25
 */

public class AppTmpOwnedListRequest extends WechatRequest<AppTmpOwnedListResponse> {

    /**
     * offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。最后一页的list长度可能小于请求的count
     */
    @JSONField(name = "offset")
    private Integer offset;
    /**
     * offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。最后一页的list长度可能小于请求的count
     */
    @JSONField(name = "count")
    private Integer count;

    public AppTmpOwnedListRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_TMP_OWNED_LIST;
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
    public Class<AppTmpOwnedListResponse> getResponseClass() {
        return AppTmpOwnedListResponse.class;
    }
}
