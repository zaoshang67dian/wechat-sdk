package com.sky.open.wx.sdk.request.apprelease;


import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.internal.consts.RequestUrlConst;
import com.sky.open.wx.sdk.request.WechatRequest;
import com.sky.open.wx.sdk.response.apprelease.CommitAppCodeResponse;

/**
 * 为授权的小程序帐号上传小程序代码
 * @date 2018/5/7 14:37
 */
public class CommitAppCodeRequest extends WechatRequest<CommitAppCodeResponse> {

    /**
     * 代码库中的代码模版ID
     */
    @JSONField(name = "template_id")
    private Integer templateId;

    /**
     * 第三方自定义的配置:
     * (1): 为了便于第三方平台使用同一个小程序模版为不同的小程序提供服务，第三方可以将自定义信息放置在ext_json中，
     * 在模版小程序中，可以使用接口获取自定义信息，从而区分不同的小程序。详见：小程序模版开发;
     * (2): ext_json中的参数可选，参数详见https://mp.weixin.qq.com/debug/wxadoc/dev/framework/config.html;
     * (3): 如果代码中已经有配置，则配置的合并规则为：除了pages和tabBar.list直接覆盖原配置，其他都为插入或同级覆盖;
     */
    @JSONField(name = "ext_json")
    private String extJson;

    /**
     * 代码版本号，开发者可自定义
     */
    @JSONField(name = "user_version")
    private String userVersion;

    /**
     * 代码描述，开发者可自定义
     */
    @JSONField(name = "user_desc")
    private String userDesc;

    public CommitAppCodeRequest() {
        this.getMethod = false;
        this.requestUrl = RequestUrlConst.APP_CODE_COMMIT;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getExtJson() {
        return extJson;
    }

    public void setExtJson(String extJson) {
        this.extJson = extJson;
    }

    public String getUserVersion() {
        return userVersion;
    }

    public void setUserVersion(String userVersion) {
        this.userVersion = userVersion;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    @Override
    public String toString() {
        return "CommitAppCodeRequest{" +
                "templateId=" + templateId +
                ", extJson='" + extJson + '\'' +
                ", userVersion='" + userVersion + '\'' +
                ", userDesc='" + userDesc + '\'' +
                '}';
    }

    @Override
    public Class<CommitAppCodeResponse> getResponseClass() {
        return CommitAppCodeResponse.class;
    }
}
