package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.Arrays;
import java.util.List;

/**
 * 卡券基本信息
 *
 * @author shipj
 * @create 2017-11-16-11:11
 */

public class BaseInfoDto extends WechatObject {
    private static final long serialVersionUID = 2064479535663771085L;

    @JSONField(name = "logo_url")
    private String logoUrl;

    @JSONField(name = "code_type")
    private String codeType;

    @JSONField(name = "brand_name")
    private String brandName;

    @JSONField(name = "title")
    private String title;

    @JSONField(name = "color")
    private String color;

    @JSONField(name = "notice")
    private String notice;

    @JSONField(name = "description")
    private String description;

    @JSONField(name = "sku")
    private SkuDto skuDto;

    @JSONField(name = "date_info")
    private DateInfoDto dateInfoDto;

    @JSONField(name = "use_custom_code")
    private Boolean useCustomCode;

    @JSONField(name = "get_custom_code_mode")
    private String getCustomCodeMode;

    @JSONField(name = "bind_openid")
    private Boolean bindOpenid;

    @JSONField(name = "service_phone")
    private String servicePhone;

    @JSONField(name = "location_id_list")
    private int[] locationIdList;

    /**
     * 朋友的券通过城市名称来确定门店信息，仅用于朋友的券
     */
    @JSONField(name = "area_code_list")
    private List<String> areaCodeList;

    @JSONField(name = "use_all_locations")
    private Boolean useAllLocations;

    @JSONField(name = "center_title")
    private String centerTitle;

    @JSONField(name = "center_sub_title")
    private String centerSubTitle;

    @JSONField(name = "center_url")
    private String centerUrl;

    @JSONField(name = "center_app_brand_user_name")
    private String centerAppBrandUserName;

    @JSONField(name = "center_app_brand_pass")
    private String centerAppBrandPass;

    @JSONField(name = "custom_url_name")
    private String customUrlName;

    @JSONField(name = "custom_url_sub_title")
    private String customUrlSubTitle;

    @JSONField(name = "custom_url")
    private String customUrl;

    @JSONField(name = "custom_app_brand_user_name")
    private String customAppBrandUserName;

    @JSONField(name = "custom_app_brand_pass")
    private String customAppBrandPass;

    @JSONField(name = "promotion_url_name")
    private String promotionUrlName;

    @JSONField(name = "promotion_url_sub_title")
    private String promotionUrlSubName;

    @JSONField(name = "promotion_url")
    private String promotionUrl;

    @JSONField(name = "promotion_app_brand_user_name")
    private String promotionAppBrandUserName;

    @JSONField(name = "promotion_app_brand_pass")
    private String promotionAppBrandPass;

    @JSONField(name = "get_limit")
    private Integer getLimit;

    @JSONField(name = "use_limit")
    private Integer useLimit;

    @JSONField(name = "can_share")
    private Boolean canShare;

    @JSONField(name = "can_give_friend")
    private Boolean canGiveFriend;

    @JSONField(name = "pay_info")
    private PayInfoDto payInfoDto;

    @JSONField(name = "source")
    private String source;

    public BaseInfoDto() {
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SkuDto getSkuDto() {
        return skuDto;
    }

    public void setSkuDto(SkuDto skuDto) {
        this.skuDto = skuDto;
    }

    public DateInfoDto getDateInfoDto() {
        return dateInfoDto;
    }

    public void setDateInfoDto(DateInfoDto dateInfoDto) {
        this.dateInfoDto = dateInfoDto;
    }

    public Boolean getUseCustomCode() {
        return useCustomCode;
    }

    public void setUseCustomCode(Boolean useCustomCode) {
        this.useCustomCode = useCustomCode;
    }

    public String getGetCustomCodeMode() {
        return getCustomCodeMode;
    }

    public void setGetCustomCodeMode(String getCustomCodeMode) {
        this.getCustomCodeMode = getCustomCodeMode;
    }

    public Boolean getBindOpenid() {
        return bindOpenid;
    }

    public void setBindOpenid(Boolean bindOpenid) {
        this.bindOpenid = bindOpenid;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public int[] getLocationIdList() {
        return locationIdList;
    }

    public void setLocationIdList(int[] locationIdList) {
        this.locationIdList = locationIdList;
    }

    public Boolean getUseAllLocations() {
        return useAllLocations;
    }

    public void setUseAllLocations(Boolean useAllLocations) {
        this.useAllLocations = useAllLocations;
    }

    public String getCenterTitle() {
        return centerTitle;
    }

    public void setCenterTitle(String centerTitle) {
        this.centerTitle = centerTitle;
    }

    public String getCenterSubTitle() {
        return centerSubTitle;
    }

    public void setCenterSubTitle(String centerSubTitle) {
        this.centerSubTitle = centerSubTitle;
    }

    public String getCenterUrl() {
        return centerUrl;
    }

    public void setCenterUrl(String centerUrl) {
        this.centerUrl = centerUrl;
    }

    public String getCenterAppBrandUserName() {
        return centerAppBrandUserName;
    }

    public void setCenterAppBrandUserName(String centerAppBrandUserName) {
        this.centerAppBrandUserName = centerAppBrandUserName;
    }

    public String getCenterAppBrandPass() {
        return centerAppBrandPass;
    }

    public void setCenterAppBrandPass(String centerAppBrandPass) {
        this.centerAppBrandPass = centerAppBrandPass;
    }

    public String getCustomUrlName() {
        return customUrlName;
    }

    public void setCustomUrlName(String customUrlName) {
        this.customUrlName = customUrlName;
    }

    public String getCustomUrlSubTitle() {
        return customUrlSubTitle;
    }

    public void setCustomUrlSubTitle(String customUrlSubTitle) {
        this.customUrlSubTitle = customUrlSubTitle;
    }

    public String getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    public String getCustomAppBrandUserName() {
        return customAppBrandUserName;
    }

    public void setCustomAppBrandUserName(String customAppBrandUserName) {
        this.customAppBrandUserName = customAppBrandUserName;
    }

    public String getCustomAppBrandPass() {
        return customAppBrandPass;
    }

    public void setCustomAppBrandPass(String customAppBrandPass) {
        this.customAppBrandPass = customAppBrandPass;
    }

    public String getPromotionUrlName() {
        return promotionUrlName;
    }

    public void setPromotionUrlName(String promotionUrlName) {
        this.promotionUrlName = promotionUrlName;
    }

    public String getPromotionUrlSubName() {
        return promotionUrlSubName;
    }

    public void setPromotionUrlSubName(String promotionUrlSubName) {
        this.promotionUrlSubName = promotionUrlSubName;
    }

    public String getPromotionUrl() {
        return promotionUrl;
    }

    public void setPromotionUrl(String promotionUrl) {
        this.promotionUrl = promotionUrl;
    }

    public String getPromotionAppBrandUserName() {
        return promotionAppBrandUserName;
    }

    public void setPromotionAppBrandUserName(String promotionAppBrandUserName) {
        this.promotionAppBrandUserName = promotionAppBrandUserName;
    }

    public String getPromotionAppBrandPass() {
        return promotionAppBrandPass;
    }

    public void setPromotionAppBrandPass(String promotionAppBrandPass) {
        this.promotionAppBrandPass = promotionAppBrandPass;
    }

    public Integer getGetLimit() {
        return getLimit;
    }

    public void setGetLimit(Integer getLimit) {
        this.getLimit = getLimit;
    }

    public Integer getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(Integer useLimit) {
        this.useLimit = useLimit;
    }

    public Boolean getCanShare() {
        return canShare;
    }

    public void setCanShare(Boolean canShare) {
        this.canShare = canShare;
    }

    public Boolean getCanGiveFriend() {
        return canGiveFriend;
    }

    public void setCanGiveFriend(Boolean canGiveFriend) {
        this.canGiveFriend = canGiveFriend;
    }

    public PayInfoDto getPayInfoDto() {
        return payInfoDto;
    }

    public void setPayInfoDto(PayInfoDto payInfoDto) {
        this.payInfoDto = payInfoDto;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<String> getAreaCodeList() {
        return areaCodeList;
    }

    public void setAreaCodeList(List<String> areaCodeList) {
        this.areaCodeList = areaCodeList;
    }

    @Override
    public String toString() {
        return "BaseInfoDto{" +
                "logoUrl='" + logoUrl + '\'' +
                ", codeType='" + codeType + '\'' +
                ", brandName='" + brandName + '\'' +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", notice='" + notice + '\'' +
                ", description='" + description + '\'' +
                ", skuDto=" + skuDto +
                ", dateInfoDto=" + dateInfoDto +
                ", useCustomCode=" + useCustomCode +
                ", getCustomCodeMode='" + getCustomCodeMode + '\'' +
                ", bindOpenid=" + bindOpenid +
                ", servicePhone='" + servicePhone + '\'' +
                ", locationIdList=" + Arrays.toString(locationIdList) +
                ", areaCodeList=" + areaCodeList +
                ", useAllLocations=" + useAllLocations +
                ", centerTitle='" + centerTitle + '\'' +
                ", centerSubTitle='" + centerSubTitle + '\'' +
                ", centerUrl='" + centerUrl + '\'' +
                ", centerAppBrandUserName='" + centerAppBrandUserName + '\'' +
                ", centerAppBrandPass='" + centerAppBrandPass + '\'' +
                ", customUrlName='" + customUrlName + '\'' +
                ", customUrlSubTitle='" + customUrlSubTitle + '\'' +
                ", customUrl='" + customUrl + '\'' +
                ", customAppBrandUserName='" + customAppBrandUserName + '\'' +
                ", customAppBrandPass='" + customAppBrandPass + '\'' +
                ", promotionUrlName='" + promotionUrlName + '\'' +
                ", promotionUrlSubName='" + promotionUrlSubName + '\'' +
                ", promotionUrl='" + promotionUrl + '\'' +
                ", promotionAppBrandUserName='" + promotionAppBrandUserName + '\'' +
                ", promotionAppBrandPass='" + promotionAppBrandPass + '\'' +
                ", getLimit=" + getLimit +
                ", useLimit=" + useLimit +
                ", canShare=" + canShare +
                ", canGiveFriend=" + canGiveFriend +
                ", payInfoDto=" + payInfoDto +
                ", source='" + source + '\'' +
                '}';
    }
}
