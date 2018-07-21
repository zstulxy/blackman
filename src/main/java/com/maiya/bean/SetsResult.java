package com.maiya.bean;

import java.io.Serializable;

public class SetsResult implements Serializable {
    private String setsName;
    private String productName;
    private Long totalQuantity;


    public String getSetsName() {
        return setsName;
    }

    public void setSetsName(String setsName) {
        this.setsName = setsName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
