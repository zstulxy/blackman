package com.maiya.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BrandSeries implements Serializable {
    private Long brandId;

    private Long bClassifyId;

    private String brandNameCn;

    private String brandNameEn;

    private String logo;

    private Boolean bStatus;

    private Date bCreateTime;

    private List<Classify> classify;

    private static final long serialVersionUID = 1L;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

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

    public Date getbCreateTime() {
        return bCreateTime;
    }

    public void setbCreateTime(Date bCreateTime) {
        this.bCreateTime = bCreateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BrandSeries other = (BrandSeries) that;
        return (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getbClassifyId() == null ? other.getbClassifyId() == null : this.getbClassifyId().equals(other.getbClassifyId()))
            && (this.getBrandNameCn() == null ? other.getBrandNameCn() == null : this.getBrandNameCn().equals(other.getBrandNameCn()))
            && (this.getBrandNameEn() == null ? other.getBrandNameEn() == null : this.getBrandNameEn().equals(other.getBrandNameEn()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getbStatus() == null ? other.getbStatus() == null : this.getbStatus().equals(other.getbStatus()))
            && (this.getbCreateTime() == null ? other.getbCreateTime() == null : this.getbCreateTime().equals(other.getbCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getbClassifyId() == null) ? 0 : getbClassifyId().hashCode());
        result = prime * result + ((getBrandNameCn() == null) ? 0 : getBrandNameCn().hashCode());
        result = prime * result + ((getBrandNameEn() == null) ? 0 : getBrandNameEn().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getbStatus() == null) ? 0 : getbStatus().hashCode());
        result = prime * result + ((getbCreateTime() == null) ? 0 : getbCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brandId=").append(brandId);
        sb.append(", bClassifyId=").append(bClassifyId);
        sb.append(", brandNameCn=").append(brandNameCn);
        sb.append(", brandNameEn=").append(brandNameEn);
        sb.append(", logo=").append(logo);
        sb.append(", bStatus=").append(bStatus);
        sb.append(", bCreateTime=").append(bCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public List<Classify> getClassify() {
        return classify;
    }

    public void setClassify(List<Classify> classify) {
        this.classify = classify;
    }
}