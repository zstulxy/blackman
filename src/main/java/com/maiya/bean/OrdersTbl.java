package com.maiya.bean;

public class OrdersTbl {
    private Long id;

    private Long userId;

    private Long productId;

    private Byte isBuy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Byte getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Byte isBuy) {
        this.isBuy = isBuy;
    }
}