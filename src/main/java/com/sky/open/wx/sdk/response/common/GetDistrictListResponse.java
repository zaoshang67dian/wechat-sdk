package com.sky.open.wx.sdk.response.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.common.CityInfo;
import com.sky.open.wx.sdk.response.WechatResponse;

import java.util.List;

/**
 * 从腾讯地图拉取省市区信息
 *
 * @author shipj
 * @create 2017-12-15-23:41
 */

public class GetDistrictListResponse extends WechatResponse {

    private static final long serialVersionUID = -9165907530825329800L;
    /**
     * 接口响应的状态
     */
    @JSONField(name = "status")
    private Integer status;
    /**
     * 接口响应的信息
     */
    @JSONField(name = "message")
    private String message;
    /**
     * 数据的版本
     */
    @JSONField(name = "data_version")
    private String dataVersion;
    /**
     * 具体信息
     */
    @JSONField(name = "result")
    private List<List<CityInfo>> result;

    public GetDistrictListResponse() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public List<List<CityInfo>> getResult() {
        return result;
    }

    public void setResult(List<List<CityInfo>> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GetDistrictListResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", dataVersion='" + dataVersion + '\'' +
                ", result=" + result +
                '}';
    }
}
