package com.maiya.bean;

import java.io.Serializable;

public class BrandSeriesWithBLOBs extends BrandSeries implements Serializable {
    private String descr;

    private String story;

    private static final long serialVersionUID = 1L;

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
        BrandSeriesWithBLOBs other = (BrandSeriesWithBLOBs) that;
        return (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getbClassifyId() == null ? other.getbClassifyId() == null : this.getbClassifyId().equals(other.getbClassifyId()))
            && (this.getBrandNameCn() == null ? other.getBrandNameCn() == null : this.getBrandNameCn().equals(other.getBrandNameCn()))
            && (this.getBrandNameEn() == null ? other.getBrandNameEn() == null : this.getBrandNameEn().equals(other.getBrandNameEn()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getbStatus() == null ? other.getbStatus() == null : this.getbStatus().equals(other.getbStatus()))
            && (this.getbCreateTime() == null ? other.getbCreateTime() == null : this.getbCreateTime().equals(other.getbCreateTime()))
            && (this.getDescr() == null ? other.getDescr() == null : this.getDescr().equals(other.getDescr()))
            && (this.getStory() == null ? other.getStory() == null : this.getStory().equals(other.getStory()));
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
        result = prime * result + ((getDescr() == null) ? 0 : getDescr().hashCode());
        result = prime * result + ((getStory() == null) ? 0 : getStory().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", descr=").append(descr);
        sb.append(", story=").append(story);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}