package com.sky.open.wx.sdk.request.appconf;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.appconf.ModifyHeadImgResponse;

/**
 * 修改头像(图片格式只支持：BMP、JPEG、JPG、GIF、PNG，大小不超过2M)
 * @date 2018/4/16 18:30
 */
public class ModifyHeadImgRequest extends WechatRequest<ModifyHeadImgResponse> {

    /**
     * 头像素材media_id
     */
    @JSONField(name = "head_img_media_id")
    private String headImgMediaId;

    /**
     * 裁剪框左上角x坐标（取值范围：[0, 1]）
     */
    @JSONField(name = "x1")
    private Float x1;

    /**
     * 裁剪框左上角y坐标（取值范围：[0, 1]）
     */
    @JSONField(name = "y1")
    private Float y1;

    /**
     * 裁剪框右下角x坐标（取值范围：[0, 1]）
     */
    @JSONField(name = "x2")
    private Float x2;

    /**
     * 裁剪框右下角y坐标（取值范围：[0, 1]）
     */
    @JSONField(name = "y2")
    private Float y2;

    public ModifyHeadImgRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.MODIFY_HEAD_IMG;
    }

    public String getHeadImgMediaId() {
        return headImgMediaId;
    }

    public void setHeadImgMediaId(String headImgMediaId) {
        this.headImgMediaId = headImgMediaId;
    }

    public Float getX1() {
        return x1;
    }

    public void setX1(Float x1) {
        this.x1 = x1;
    }

    public Float getY1() {
        return y1;
    }

    public void setY1(Float y1) {
        this.y1 = y1;
    }

    public Float getX2() {
        return x2;
    }

    public void setX2(Float x2) {
        this.x2 = x2;
    }

    public Float getY2() {
        return y2;
    }

    public void setY2(Float y2) {
        this.y2 = y2;
    }

    @Override
    public Class<ModifyHeadImgResponse> getResponseClass() {
        return ModifyHeadImgResponse.class;
    }

    @Override
    public String toString() {
        return "ModifyHeadImgRequest{" +
                "headImgMediaId='" + headImgMediaId + '\'' +
                ", x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
