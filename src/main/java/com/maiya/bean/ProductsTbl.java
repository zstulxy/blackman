package com.maiya.bean;

public class ProductsTbl {
    private Long id;

    private String brand;

    private Byte brandType;

    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Byte getBrandType() {
        return brandType;
    }

    public void setBrandType(Byte brandType) {
        this.brandType = brandType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}