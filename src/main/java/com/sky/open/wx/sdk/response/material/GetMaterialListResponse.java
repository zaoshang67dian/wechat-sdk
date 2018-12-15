package com.sky.open.wx.sdk.response.material;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.material.Media;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 获取素材列表
 *
 * @author shipj
 * @create 2017-12-28-20:26
 */

public class GetMaterialListResponse extends WechatResponse {

    private static final long serialVersionUID = 1326797809464688960L;
    /**
     * 该类型的素材的总数
     */
    @JSONField(name = "total_count")
    private Integer totalCount;
    /**
     * 本次调用获取的素材的数量
     */
    @JSONField(name = "item_count")
    private Integer itemCount;
    /**
     * 查询到的素材列表
     */
    @JSONField(name = "item")
    private List<Media> item;

    public GetMaterialListResponse() {
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public List<Media> getItem() {
        return item;
    }

    public void setItem(List<Media> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "GetMaterialListResponse{" +
                "totalCount=" + totalCount +
                ", itemCount=" + itemCount +
                ", item=" + item +
                '}';
    }
}
