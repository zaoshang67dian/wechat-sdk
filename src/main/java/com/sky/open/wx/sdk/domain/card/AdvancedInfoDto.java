package com.sky.open.wx.sdk.domain.card;

import com.alibaba.fastjson.annotation.JSONField;
import com.sky.open.wx.sdk.domain.WechatObject;

import java.util.Arrays;
import java.util.List;

/**
 * 卡券高级信息
 *
 * @author shipj
 * @create 2017-11-16-11:11
 */

public class AdvancedInfoDto extends WechatObject {
    private static final long serialVersionUID = -6069282250792208436L;

    /**
     * 使用门槛（条件）字段
     */
    @JSONField(name = "use_condition")
    private UseConditionDto useConditionDto;

    @JSONField(name = "abstract")
    private AbstractDto abstractDto;

    @JSONField(name = "text_image_list")
    private List<TextImageDto> textImageDtoList;

    @JSONField(name = "business_service")
    private String[] businessService;

    @JSONField(name = "time_limit")
    private List<TimeLimitDto> timeLimitDtos;

    @JSONField(name = "consume_share_self_num")
    private Integer consumeShareCardNum;

    @JSONField(name = "consume_share_card_list")
    private List<ConsumeShareCardDto> consumeShareCardList;

    @JSONField(name = "share_friends")
    private Boolean shareFriend;

    public AdvancedInfoDto() {
    }

    public UseConditionDto getUseConditionDto() {
        return useConditionDto;
    }

    public void setUseConditionDto(UseConditionDto useConditionDto) {
        this.useConditionDto = useConditionDto;
    }

    public AbstractDto getAbstractDto() {
        return abstractDto;
    }

    public void setAbstractDto(AbstractDto abstractDto) {
        this.abstractDto = abstractDto;
    }

    public List<TextImageDto> getTextImageDtoList() {
        return textImageDtoList;
    }

    public void setTextImageDtoList(List<TextImageDto> textImageDtoList) {
        this.textImageDtoList = textImageDtoList;
    }

    public String[] getBusinessService() {
        return businessService;
    }

    public void setBusinessService(String[] businessService) {
        this.businessService = businessService;
    }

    public List<TimeLimitDto> getTimeLimitDtos() {
        return timeLimitDtos;
    }

    public void setTimeLimitDtos(List<TimeLimitDto> timeLimitDtos) {
        this.timeLimitDtos = timeLimitDtos;
    }

    public Integer getConsumeShareCardNum() {
        return consumeShareCardNum;
    }

    public void setConsumeShareCardNum(Integer consumeShareCardNum) {
        this.consumeShareCardNum = consumeShareCardNum;
    }

    public List<ConsumeShareCardDto> getConsumeShareCardList() {
        return consumeShareCardList;
    }

    public void setConsumeShareCardList(List<ConsumeShareCardDto> consumeShareCardList) {
        this.consumeShareCardList = consumeShareCardList;
    }

    public Boolean getShareFriend() {
        return shareFriend;
    }

    public Boolean isShareFriend() {
        return shareFriend;
    }

    public void setShareFriend(Boolean shareFriend) {
        this.shareFriend = shareFriend;
    }

    @Override
    public String toString() {
        return "AdvancedInfoDto{" +
                "useConditionDto=" + useConditionDto +
                ", abstractDto=" + abstractDto +
                ", textImageDtoList=" + textImageDtoList +
                ", businessService=" + Arrays.toString(businessService) +
                ", timeLimitDtos=" + timeLimitDtos +
                ", consumeShareCardNum=" + consumeShareCardNum +
                ", consumeShareCardList=" + consumeShareCardList +
                ", shareFriend=" + shareFriend +
                '}';
    }
}
