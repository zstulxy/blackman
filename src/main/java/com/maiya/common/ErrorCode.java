package com.maiya.common;

public enum ErrorCode {
    // success
    SUCCESS("success", 0),
    // jdbc connect error
    JDBC_ERROR("数据库连接错误", 1),
    // register error username exist
    REGISTER_ERROR_USERNAME_EXIST("注册错误：用户名已存在", 2),
    // register error insert error
    REGISTER_ERROR_INSERT_ERROR("注册失败，插入数据错误", 3),
    // login error usrid error
    LOGIN_ERROR_USRID_ERROR("登陆错误：用户名错误", 4),
    // login error pwd error
    LOGIN_ERROR_PWD_ERROR("登陆错误：密码错误", 5),
    // favorite tbl select error
    FAV_TBL_SELECT_ERROR("收藏列表查询错误", 6),
    // city tbl select error
    CITY_TBL_SELECT_ERROR("区域查询错误", 7),
    // login select error
    LOGIN_SELECT_ERROR("账号或者密码错误!", 8),
    // token error
    TOKEN_ERROR("token验证码错误", 9),
    // get news error
    GET_NEWS_ERROR("获取资讯列表错误", 10),
    // get news content error
    GET_NEWS_CONTENT_ERROR("获取资讯内容错误", 11),
    // get product error
    GET_PRODUCT_ERROR("获取商品信息错误", 12),
    // get latest vendor error
    GET_LATEST_VENDOR_ERROR("获取最新商家错误", 13),
    // get latest vendor error
    GET_REMARK_VENDOR_ERROR("获取标注商家错误", 14),
    // get all vendor error
    GET_ALL_VENDOR_ERROR("获取所有商家信息错误", 15),
    // get  vendor by id error
    GET_VENDOR_BYID_ERROR("获取某一商家信息错误", 16),
    // delete  vendor by id error
    DEL_VENDOR_BYID_ERROR("删除某一商家信息错误", 17),
    // insert  vendor by id error
    INSERT_VENDOR_BYID_ERROR("插入某一商家信息错误", 18),
    // get  products error
    GET_PRODUCTS_LIST_ERROR("获取商品列表信息错误", 19),
    // get  medicines error
    GET_MEDICINE_LIST_ERROR("获取药品列表信息错误", 20),
    // insert  product by id error
    INSERT_PRODUCT_BYID_ERROR("插入某一产品信息错误", 21),
    // update  product by id error
    UPDATE_PRODUCT_ERROR("更新某一产品信息错误", 22),
    // delete  product by id error
    DELETE_PRODUCT_ERROR("删除某一产品信息错误", 23),

    // insert  user by id error
    INSERT_USER_ERROR("插入用户信息错误", 24),
    // update  user by id error
    UPDATE_USER_ERROR("更新用户信息错误", 25),
    // delete  user by id error
    DELETE_USER_ERROR("删除某一用户信息错误", 26),
    // get all user info error
    SELECT_USER_ERROR("获取用户列表错误", 27),

    // get all user info error
    UPLOAD_FILE_ERROR("上传文件错误", 28),

    // oss connect error.
    OSS_CLIENT_ERROR("OSS连接错误", 29),

    // oss connect error.
    NOT_FIND_ERROR("查询没有结果", 30),

    // followings errorcoed is for app
    GET_VERIFY_CODE_ERROR("获取校验码错误", 31),

    // 注册信息，确认密码错误
    REGISTER_INFO_CONFIRM_PASSWD_ERR("注册信息，确认密码错误",32),

    // 注册信息，确认密码错误
    HOME_PAGE_CA_ERROR("没有轮播图数据",33),

    // 反馈信息错误
    FEEDBACK_UPDATE_ERROR("反馈信息错误",34),

    // 获取商家列表错误
    GET_VENDOR_LIST_ERROR("获取商家列表错误",35),

    // 获取资源收藏列表错误
    GET_RESOURCE_FAVORITE_ERROR("获取资源收藏列表错误",36),

    // 获取商家收藏列表错误
    GET_VENDOR_FAVORITE_ERROR("获取商家收藏列表错误",37),

    // 用户名为空
    GET_REGISTER_USERNAME_NULL("用户名为空",38),

    // 手机号为空
    GET_REGISTER_TELPHONENUMBER_NULL("手机号为空",39),

    // 密码为空
    GET_REGISTER_PASSWORD_NULL("密码为空",40),

    // 确认密码为空
    GET_REGISTER_CORNFIRMPASSWORD_NULL("密码为空",41),

    RESERVED_ERROR("保留错误码",255);

    private String name;
    private int index;

    // 构造方法
    private ErrorCode(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (ErrorCode c : ErrorCode.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
