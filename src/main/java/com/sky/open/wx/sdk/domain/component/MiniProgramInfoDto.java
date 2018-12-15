package com.sky.open.wx.sdk.domain.component;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.List;

/**
 * 可根据这个字段判断是否为小程序类型授权
 *
 * @author shipj
 * @create 2017-12-12-14:18
 */

public class MiniProgramInfoDto extends WechatObject {

    private static final long serialVersionUID = 8952173174335538045L;
    /**
     * 小程序已设置的各个服务器域名
     */
    @JSONField(name = "network")
    private NetworkDto networkDto;
    /**
     * 小程序适用的门店
     */
    @JSONField(name = "categories")
    private List<CategoryDto> categories;
    /**
     * 小程序的访问限制
     */
    @JSONField(name = "visit_status")
    private Integer visitStatus;

    public MiniProgramInfoDto() {
    }

    public NetworkDto getNetworkDto() {
        return networkDto;
    }

    public void setNetworkDto(NetworkDto networkDto) {
        this.networkDto = networkDto;
    }

    public List<CategoryDto> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDto> categories) {
        this.categories = categories;
    }

    public Integer getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(Integer visitStatus) {
        this.visitStatus = visitStatus;
    }

    @Override
    public String toString() {
        return "MiniProgramInfoDto{" +
                "networkDto=" + networkDto +
                ", categories=" + categories +
                ", visitStatus=" + visitStatus +
                '}';
    }
}
