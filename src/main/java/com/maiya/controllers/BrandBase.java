package com.maiya.controllers;

public class BrandBase {

    private Long bClassifyId;

    private String brandNameCn;

    private String brandNameEn;

    private String logo;

    private Boolean bStatus;

    private String descr;

    private String story;

    public Long getbClassifyId() {
        return bClassifyId;
    }

    public void setbClassifyId(Long bClassifyId) {
        this.bClassifyId = bClassifyId;
    }

    public String getBrandNameCn() {
        return brandNameCn;
    }

    public void setBrandNameCn(String brandNameCn) {
        this.brandNameCn = brandNameCn;
    }

    public String getBrandNameEn() {
        return brandNameEn;
    }

    public void setBrandNameEn(String brandNameEn) {
        this.brandNameEn = brandNameEn;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getbStatus() {
        return bStatus;
    }

    public void setbStatus(Boolean bStatus) {
        this.bStatus = bStatus;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
