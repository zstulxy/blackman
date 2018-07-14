package com.maiya.common;

public enum AccountStatus {
    INUSE_STATUS("活跃", 0),
    VERIFY_STATUS("待审核", 1),
    CANCEL_STATUS("注销", 2);

    private String status_;
    private int index_;

    private AccountStatus(String status, int index) {
        this.status_ = status;
        this.index_ = index;
    }

    public static String getName(int index) {
        for (AccountStatus c : AccountStatus.values()) {
            if (c.getIndex() == index) {
                return c.status_;
            }
        }
        return null;
    }

    public String getStatus() {
        return status_;
    }
    public void setStatus(String status) {
        this.status_ = status_;
    }
    public int getIndex() {
        return index_;
    }
    public void setIndex(int index) {
        this.index_ = index;
    }
}
