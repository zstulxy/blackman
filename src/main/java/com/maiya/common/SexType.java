package com.maiya.common;

public enum SexType {
    MALE_STATUS("男", 0),
    FEMALE_STATUS("女", 1);

    private String sex_;
    private int index_;

    private SexType(String sex, int index) {
        this.sex_ = sex;
        this.index_ = index;
    }

    public static String getSexType(int index) {
        for (SexType c : SexType.values()) {
            if (c.getIndex() == index) {
                return c.getSex();
            }
        }
        return null;
    }

    public String getSex() {
        return sex_;
    }

    public void setSex(String sex) {
        this.sex_ = sex;
    }

    public int getIndex() {
        return index_;
    }

    public void setIndex(int index) {
        this.index_ = index;
    }

}
