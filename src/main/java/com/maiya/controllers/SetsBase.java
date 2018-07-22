package com.maiya.controllers;

import java.util.Date;

public class SetsBase {
    private String setsName;

    private Long setsProductId;

    public String getSetsName() {
        return setsName;
    }

    public void setSetsName(String setsName) {
        this.setsName = setsName;
    }

    public Long getSetsProductId() {
        return setsProductId;
    }

    public void setSetsProductId(Long setsProductId) {
        this.setsProductId = setsProductId;
    }
}
