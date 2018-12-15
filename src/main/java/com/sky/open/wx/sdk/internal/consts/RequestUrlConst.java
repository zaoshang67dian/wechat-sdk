package com.sky.open.wx.sdk.internal.consts;

/**
 * 请求url常量
 *
 * @author shipj
 * @create 2017-12-12-13:28
 */

public final class RequestUrlConst {
    private RequestUrlConst(){}

    //region **** 公共
    //从腾讯地图拉取省市区信息
    public static final String GET_CITY_LOCATION = "https://api.weixin.qq.com/wxa/get_district";
    //endregion

    //region **** 门店小程序相关
    //拉取门店类目列表
    public static final String MERCHANT_CATE_LIST = "https://api.weixin.qq.com/wxa/get_merchant_category";
    //创建门店小程序
    public static final String APPLY_MERCHANT = "https://api.weixin.qq.com/wxa/apply_merchant";
    //查看门店小程序审核状态
    public static final String MERCHENT_AUDIT_STATUS = "https://api.weixin.qq.com/wxa/get_merchant_audit_info";


    //endregion

    //region **** 第三方平台相关
    //该API用于在授权方令牌（authorizer_access_token）失效时，可用刷新令牌（authorizer_refresh_token）获取新的令牌
    public static final String COMPONENT_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/component/api_authorizer_token";
    //该API用于获取授权方的基本信息，包括头像、昵称、帐号类型、认证类型、微信号、原始ID和二维码图片URL
    public static final String API_GET_AUTHORIZER_INFO = "https://api.weixin.qq.com/cgi-bin/component/api_get_authorizer_info";
    //该API用于获取授权方的公众号或小程序的选项设置信息，如：地理位置上报，语音识别开关，多客服开关
    public static final String API_GET_AUTHORIZER_OPTION = "https://api.weixin.qq.com/cgi-bin/component/api_get_authorizer_option";
    //该API用于设置授权方的公众号或小程序的选项信息，如：地理位置上报，语音识别开关，多客服开关
    public static final String API_SET_AUTHORIZER_OPTION = "https://api.weixin.qq.com/cgi-bin/component/api_set_authorizer_option";
    //获取第三方平台component_access_token
    public static final String API_COMPONENT_TOKEN = "https://api.weixin.qq.com/cgi-bin/component/api_component_token";
    //该API用于获取预授权码。预授权码用于公众号或小程序授权时的第三方平台方安全验证。
    public static final String PRE_AUTH_CODE = "https://api.weixin.qq.com/cgi-bin/component/api_create_preauthcode";
    //使用授权码换取公众号或小程序的接口调用凭据和授权信息
    public static final String API_QUERY_AUTH = "https://api.weixin.qq.com/cgi-bin/component/api_query_auth";
    //第三方代授权小程序获取登录信息
    public static final String APP_LOGIN = "https://api.weixin.qq.com/sns/component/jscode2session";
    //获取第三方创建的全部小程序模板id
    public static final String APP_TEMP_LIST = "https://api.weixin.qq.com/wxa/gettemplatelist";
    //endregion

    //region **** 小程序代创建
    //复用公众号认证资质创建
    public static final String FAST_REGISTE_BY_PUB = "https://api.weixin.qq.com/cgi-bin/account/fastregister";
    //微信认证代创建
    public static final String REGIST_APP_BY_VERIFY = "https://api.weixin.qq.com/cgi-bin/component/registeraccount";
    //获取第三方代注册应用列表
    public static final String REGIST_APP_LIST = "https://api.weixin.qq.com/cgi-bin/component/getregisteraccountlist";
    //endregion

    //region **** 小程序信息设置接口
    //获取小程序基本信息
    public static final String GET_APP_BASE_INFO = "https://api.weixin.qq.com/cgi-bin/account/getaccountbasicinfo";
    //小程序名称设置及改名
    public static final String SET_APP_NICKNAME = "https://api.weixin.qq.com/wxa/setnickname";
    //小程序更名审核状态查询
    public static final String NICK_NAME_STATUS = "https://api.weixin.qq.com/wxa/api_wxa_querynickname";
    //微信认证名称检测
    public static final String NICK_NAME_CHECK = "https://api.weixin.qq.com/cgi-bin/wxverify/checkwxverifynickname";
    //修改小程序头像
    public static final String MODIFY_HEAD_IMG = "https://api.weixin.qq.com/cgi-bin/account/modifyheadimage";
    //修改小程序的功能介绍
    public static final String MODIFY_APP_SIG = "https://api.weixin.qq.com/cgi-bin/account/modifysignature";
    //查询小程序已经设置的类目
    public static final String GET_APP_CATEGORY = "https://api.weixin.qq.com/cgi-bin/wxopen/getcategory";
    //查询小程序可以设置的全部类目
    public static final String GET_ALL_CATEGORY = "https://api.weixin.qq.com/cgi-bin/wxopen/getallcategories";
    //添加类目
    public static final String ADD_NEW_CATEGORY = "https://api.weixin.qq.com/cgi-bin/wxopen/addcategory";
    //删除类目
    public static final String DEL_OLD_CATEGORY = "https://api.weixin.qq.com/cgi-bin/wxopen/deletecategory";
    //修改类目
    public static final String MODIFY_OLD_CATEGORY = "https://api.weixin.qq.com/cgi-bin/wxopen/modifycategory";
    //设置小程序是否可以被搜索
    public static final String SET_APP_SEARCH_STATUS = "https://api.weixin.qq.com/wxa/changewxasearchstatus";
    //获取小程序是否可被搜索设置
    public static final String GET_APP_SEARCH_STATUS = "https://api.weixin.qq.com/wxa/getwxasearchstatus";
    //绑定微信用户为小程序体验者
    public static final String BIND_MINI_APP_TESTER = "https://api.weixin.qq.com/wxa/bind_tester";
    //解绑小程序体验用户
    public static final String UNBIND_MINI_APP_TESTER = "https://api.weixin.qq.com/wxa/unbind_tester";
    //获取已经绑定的列表
    public static final String GET_MINI_APP_TESTERS = "https://api.weixin.qq.com/wxa/memberauth";
    //小程序服务器域名设置
    public static final String APP_DOMAIN_OPERATE = "https://api.weixin.qq.com/wxa/modify_domain";
    //小程序业务域名设置
    public static final String APP_WV_DOMAIN = "https://api.weixin.qq.com/wxa/setwebviewdomain";
    //endregion

    //region **** 小程序发布管理
    //上传小程序代码
    public static final String APP_CODE_COMMIT = "https://api.weixin.qq.com/wxa/commit";
    //获取小程序已经设置的类目
    public static final String APP_SETED_CATE = "https://api.weixin.qq.com/wxa/get_category";
    //获取小程序体验码
    public static final String APP_TESER_CODE = "https://api.weixin.qq.com/wxa/get_qrcode";
    //获取第三方为小程序提交的页面配置
    public static final String APP_COMMIT_PAGES = "https://api.weixin.qq.com/wxa/get_page";
    //将第三方提交的代码包提交审核
    public static final String APP_SUB_AUDIT = "https://api.weixin.qq.com/wxa/submit_audit";
    //小程序取消审核
    public static final String APP_CANSEL_AUDIT = "https://api.weixin.qq.com/wxa/undocodeaudit";
    //查询某个指定版本的审核状态
    public static final String APP_AUDIT_STATUS = "https://api.weixin.qq.com/wxa/get_auditstatus";
    //查询最新一次提交的审核状态
    public static final String APP_LATEST_AUDIT_STATUS = "https://api.weixin.qq.com/wxa/get_latest_auditstatus";
    //发布已通过审核的小程序（仅供第三方代小程序调用）
    public static final String APP_RELEASE = "https://api.weixin.qq.com/wxa/release";
    //修改小程序线上代码的可见状态
    public static final String APP_VISIT_STATUS_CHANGE = "https://api.weixin.qq.com/wxa/change_visitstatus";
    // 小程序版本回退（仅供第三方代小程序调用）
    public static final String APP_RELEASE_ROLLBACK = "https://api.weixin.qq.com/wxa/revertcoderelease";
    //查询当前设置的最低基础库版本及各版本用户占比
    public static final String APP_VERSION_DATA = "https://api.weixin.qq.com/cgi-bin/wxopen/getweappsupportversion";
    //endregion

    //region **** 账号认证相关
    //提交认证资料下单
    public static final String APPLY_WX_VERIFY = "https://api.weixin.qq.com/cgi-bin/wxverify/applywxverify";
    //获取订单信息
    public static final String CHECK_ORDER_INFO = "https://api.weixin.qq.com/cgi-bin/wxverify/getwxverifyorder";
    //获取指定订单的支付二维码
    public static final String PAY_QR_CODE = "https://api.weixin.qq.com/cgi-bin/wxverify/getwxverifypayqrcode";
    //获取订单列表
    public static final String ORDER_LIST = "https://api.weixin.qq.com/cgi-bin/wxverify/getwxverifyorderlist";
    //重新提交认证资料
    public static final String REFILL_WX_VERIFY = "https://api.weixin.qq.com/cgi-bin/wxverify/submitwxverifyrefill";
    //endregion

    //region **** 微信数据统计相关
    //获取图文群发总数据（getarticletotal）
    public static final String GET_ARTICLE_TOTAL = "https://api.weixin.qq.com/datacube/getarticletotal";

    //endregion

    //region **** 微信卡券相关
    //在调用核销code接口之前调用查询code接口
    public static final String GET_CARD_CODE = "https://api.weixin.qq.com/card/code/get";
    //消耗code接口是核销卡券的唯一接口,开发者可以调用当前接口将用户的优惠券进行核销，该过程不可逆
    public static final String CARD_CONSUME = "https://api.weixin.qq.com/card/code/consume";
    //创建卡券接口是微信卡券的基础接口，用于创建一类新的卡券，获取card_id，创建成功并通过审核后，商家可以通过文档提供的其他接口将卡券下发给用户，每次成功领取，库存数量相应扣除
    public static final String CARD_CREATE = "https://api.weixin.qq.com/card/create";
    //微信卡券的Code解码接口
    public static final String DECRYPT_CODE = "https://api.weixin.qq.com/card/code/decrypt";
    //从微信拉取微信卡券详情接口
    public static final String GET_CARD_DETAIL = "https://api.weixin.qq.com/card/get";
    //更新卡券库存接口
    public static final String MODIFY_CARD_STOCK = "https://api.weixin.qq.com/card/modifystock";
    //更新微信卡券详情接口
    public static final String UPDATE_CARD_DETAIL = "https://api.weixin.qq.com/card/update";
    //获取微信卡券投放二维码
    public static final String CREATE_CARD_QRCODE = "https://api.weixin.qq.com/card/qrcode/create";
    //endregion

    //region **** 独立小程序接口
    public static final String APP_LOGIN_S = "https://api.weixin.qq.com/sns/jscode2session";
    //endregion

    //region **** 微信小程序模板消息相关
    //获取小程序模板库标题列表
    public static final String APP_TMP_LIST = "https://api.weixin.qq.com/cgi-bin/wxopen/template/library/list";
    //获取模板库某个模板标题下关键词库
    public static final String APP_TMP_KEY_LIST = "https://api.weixin.qq.com/cgi-bin/wxopen/template/library/get";
    //组合模板并添加至帐号下的个人模板库
    public static final String APP_ADD_TMP = "https://api.weixin.qq.com/cgi-bin/wxopen/template/add";
    //获取帐号下已存在的模板列表
    public static final String APP_TMP_OWNED_LIST = "https://api.weixin.qq.com/cgi-bin/wxopen/template/list";
    //删除帐号下的某个模板
    public static final String APP_TMP_DEL = "https://api.weixin.qq.com/cgi-bin/wxopen/template/del";
    //发送小程序模板消息
    public static final String APP_TMP_SEND = "https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send";
    //endregion

    //region **** 微信公众号菜单管理
    //创建菜单
    public static final String WX_MENU_CREATE = "https://api.weixin.qq.com/cgi-bin/menu/create";
    //创建个性化菜单
    public static final String WX_COND_MENU_CREATE = "https://api.weixin.qq.com/cgi-bin/menu/addconditional";
    //删除指定的个性化菜单
    public static final String WX_COND_MENU_DEL = "https://api.weixin.qq.com/cgi-bin/menu/delconditional";
    //自定义菜单查询接口(get)
    public static final String WX_MENU_DETAIL = "https://api.weixin.qq.com/cgi-bin/menu/get";
    //删除全部菜单接口
    public static final String WX_MENU_DEL = "https://api.weixin.qq.com/cgi-bin/menu/delete";
    //endregion

    //region **** 微信公众号模板消息
    //设置微信公众号行业
    public static final String SET_INDUSTR = "https://api.weixin.qq.com/cgi-bin/template/api_set_industry";
    //获取账号设置的行业信息
    public static final String GET_INDUSTR = "https://api.weixin.qq.com/cgi-bin/template/get_industry";
    //获得账号下已经存在的模板列表
    public static final String TMP_LIST = "https://api.weixin.qq.com/cgi-bin/template/get_all_private_template";
    //公众号发送模板消息
    public static final String TMP_SEND = "https://api.weixin.qq.com/cgi-bin/message/template/send";
    //删除公众号模板
    public static final String DEL_TMP_ID = "https://api.weixin.qq.com/cgi-bin/template/del_private_template";
    //endregion

    //region **** 公众号素材管理
    //获取指定mediaId的素材的详细信息
    public static final String GET_MEDIA_INFO = "https://api.weixin.qq.com/cgi-bin/material/get_material";
    //获取指定类型的素材列表
    public static final String GET_MEDIA_LIST = "https://api.weixin.qq.com/cgi-bin/material/batchget_material";
    //上传指定类型的素材文件
    public static final String UPLOAD_MEDIA_FILE = "https://api.weixin.qq.com/cgi-bin/media/upload";
    //endregion

    //region **** 网页授权相关接口
    //这里通过code换取的是一个特殊的网页授权access_token
    public static final String WEB_VIEW_AUTH_TOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token?&grant_type=authorization_code";

    //endregion

    //region **** 客服消息相关接口
    public static final String WX_CUSTOM_MSG_SEND = "https://api.weixin.qq.com/cgi-bin/message/custom/send";
    //endregion

    //region **** 公众号相关
    //获取公众号关联的小程序列表
    public static final String PUBNO_LINK_APP = "https://api.weixin.qq.com/cgi-bin/wxopen/wxamplinkget";
    //获取公众号的token
    public static final String PUB_NO_TOKEN = "https://api.weixin.qq.com/cgi-bin/token";

    //endregion
}
