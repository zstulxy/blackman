package com.maiya.common;

public enum VerifyCodeType {
    REGISTER_VERIFY("register verify", 0),
    FORGET_PASSWORD_VERIFY("forget password verify", 1),
    RESET_PASSWORD_VERIFY("reset password verify", 2);

    private String name;
    private int index;

    // 构造方法
    private VerifyCodeType(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (VerifyCodeType c : VerifyCodeType.values()) {
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
