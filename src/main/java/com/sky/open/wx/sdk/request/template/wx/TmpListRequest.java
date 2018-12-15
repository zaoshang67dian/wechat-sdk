package com.sky.open.wx.sdk.request.template.wx;

import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.template.wx.TmpListResponse;

/**
 * 获取当前账号下的全部模板消息详情列表
 * @author shipj
 * @create 2017-12-27-17:34
 */

public class TmpListRequest extends WechatRequest<TmpListResponse> {

    public TmpListRequest() {
        this.requestUrl = RequestUrlConst.TMP_LIST;
        this.getMethod = true;
    }

    @Override
    public Class<TmpListResponse> getResponseClass() {
        return TmpListResponse.class;
    }
}
