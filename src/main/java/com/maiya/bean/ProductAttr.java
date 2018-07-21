package com.maiya.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductAttr implements Serializable {
    private Long paId;

    private Long paProductId;

    private Long paClassifyId;

    private Long isSku;

    private Date paCreateTime;

    private static final long serialVersionUID = 1L;

    public Long getPaId() {
        return paId;
    }

    public void setPaId(Long paId) {
        this.paId = paId;
    }

    public Long getPaProductId() {
        return paProductId;
    }

    public void setPaProductId(Long paProductId) {
        this.paProductId = paProductId;
    }

    public Long getPaClassifyId() {
        return paClassifyId;
    }

    public void setPaClassifyId(Long paClassifyId) {
        this.paClassifyId = paClassifyId;
    }

    public Long getIsSku() {
        return isSku;
    }

    public void setIsSku(Long isSku) {
        this.isSku = isSku;
    }

    public Date getPaCreateTime() {
        return paCreateTime;
    }

    public void setPaCreateTime(Date paCreateTime) {
        this.paCreateTime = paCreateTime;
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
        ProductAttr other = (ProductAttr) that;
        return (this.getPaId() == null ? other.getPaId() == null : this.getPaId().equals(other.getPaId()))
            && (this.getPaProductId() == null ? other.getPaProductId() == null : this.getPaProductId().equals(other.getPaProductId()))
            && (this.getPaClassifyId() == null ? other.getPaClassifyId() == null : this.getPaClassifyId().equals(other.getPaClassifyId()))
            && (this.getIsSku() == null ? other.getIsSku() == null : this.getIsSku().equals(other.getIsSku()))
            && (this.getPaCreateTime() == null ? other.getPaCreateTime() == null : this.getPaCreateTime().equals(other.getPaCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaId() == null) ? 0 : getPaId().hashCode());
        result = prime * result + ((getPaProductId() == null) ? 0 : getPaProductId().hashCode());
        result = prime * result + ((getPaClassifyId() == null) ? 0 : getPaClassifyId().hashCode());
        result = prime * result + ((getIsSku() == null) ? 0 : getIsSku().hashCode());
        result = prime * result + ((getPaCreateTime() == null) ? 0 : getPaCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paId=").append(paId);
        sb.append(", paProductId=").append(paProductId);
        sb.append(", paClassifyId=").append(paClassifyId);
        sb.append(", isSku=").append(isSku);
        sb.append(", paCreateTime=").append(paCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}