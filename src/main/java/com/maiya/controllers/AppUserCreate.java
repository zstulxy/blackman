package com.maiya.controllers;

public class AppUserCreate extends UserCreate {

    private String address;

    private Short points;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Short getPoints() {
        return points;
    }

    public void setPoints(Short points) {
        this.points = points;
    }
}
