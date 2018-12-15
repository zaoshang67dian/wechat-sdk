package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.Arrays;

/**
 * 摘要说明
 *
 * @author shipj
 * @create 2017-11-16-14:47
 */

public class AbstractDto extends WechatObject {

    private static final long serialVersionUID = 3553756718973551999L;

    @JSONField(name = "abstract")
    private String abstractTile;

    @JSONField(name = "icon_url_list")
    private String[] iconUrlList;

    public AbstractDto() {
    }

    public String getAbstractTile() {
        return abstractTile;
    }

    public void setAbstractTile(String abstractTile) {
        this.abstractTile = abstractTile;
    }

    public String[] getIconUrlList() {
        return iconUrlList;
    }

    public void setIconUrlList(String[] iconUrlList) {
        this.iconUrlList = iconUrlList;
    }

    @Override
    public String toString() {
        return "AbstractDto{" +
                "abstractTile='" + abstractTile + '\'' +
                ", iconUrlList=" + Arrays.toString(iconUrlList) +
                '}';
    }
}
