package com.sky.open.wx.sdk.request.material;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.material.GetMaterialListResponse;

/**
 * 在新增了永久素材后，开发者可以分类型获取永久素材的列表
 *
 * @author shipj
 * @create 2017-12-28-20:41
 */

public class GetMaterialListRequest extends WechatRequest<GetMaterialListResponse> {

    /**
     * 素材的类型，
     * 图片（image）、
     * 视频（video）、
     * 语音 （voice）、
     * 图文（news）
     */
    @JSONField(name = "type")
    private String type;
    /**
     * 从全部素材的该偏移位置开始返回，0表示从第一个素材 返回
     */
    @JSONField(name = "offset")
    private Integer offset;
    /**
     * 返回素材的数量，取值在1到20之间
     */
    @JSONField(name = "count")
    private Integer count;

    public GetMaterialListRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.GET_MEDIA_LIST;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    public Class<GetMaterialListResponse> getResponseClass() {
        return GetMaterialListResponse.class;
    }
}
