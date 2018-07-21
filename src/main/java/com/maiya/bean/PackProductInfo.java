package com.maiya.bean;

import java.io.Serializable;
import java.util.Date;

public class PackProductInfo implements Serializable {
    private Long ppiId;

    private Long ppiPackId;

    private Long ppiSkuId;

    private Long ppiQuantity;

    private Long ppiPrice;

    private Date ppiCreateTime;

    private static final long serialVersionUID = 1L;

    public Long getPpiId() {
        return ppiId;
    }

    public void setPpiId(Long ppiId) {
        this.ppiId = ppiId;
    }

    public Long getPpiPackId() {
        return ppiPackId;
    }

    public void setPpiPackId(Long ppiPackId) {
        this.ppiPackId = ppiPackId;
    }

    public Long getPpiSkuId() {
        return ppiSkuId;
    }

    public void setPpiSkuId(Long ppiSkuId) {
        this.ppiSkuId = ppiSkuId;
    }

    public Long getPpiQuantity() {
        return ppiQuantity;
    }

    public void setPpiQuantity(Long ppiQuantity) {
        this.ppiQuantity = ppiQuantity;
    }

    public Long getPpiPrice() {
        return ppiPrice;
    }

    public void setPpiPrice(Long ppiPrice) {
        this.ppiPrice = ppiPrice;
    }

    public Date getPpiCreateTime() {
        return ppiCreateTime;
    }

    public void setPpiCreateTime(Date ppiCreateTime) {
        this.ppiCreateTime = ppiCreateTime;
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
        PackProductInfo other = (PackProductInfo) that;
        return (this.getPpiId() == null ? other.getPpiId() == null : this.getPpiId().equals(other.getPpiId()))
            && (this.getPpiPackId() == null ? other.getPpiPackId() == null : this.getPpiPackId().equals(other.getPpiPackId()))
            && (this.getPpiSkuId() == null ? other.getPpiSkuId() == null : this.getPpiSkuId().equals(other.getPpiSkuId()))
            && (this.getPpiQuantity() == null ? other.getPpiQuantity() == null : this.getPpiQuantity().equals(other.getPpiQuantity()))
            && (this.getPpiPrice() == null ? other.getPpiPrice() == null : this.getPpiPrice().equals(other.getPpiPrice()))
            && (this.getPpiCreateTime() == null ? other.getPpiCreateTime() == null : this.getPpiCreateTime().equals(other.getPpiCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPpiId() == null) ? 0 : getPpiId().hashCode());
        result = prime * result + ((getPpiPackId() == null) ? 0 : getPpiPackId().hashCode());
        result = prime * result + ((getPpiSkuId() == null) ? 0 : getPpiSkuId().hashCode());
        result = prime * result + ((getPpiQuantity() == null) ? 0 : getPpiQuantity().hashCode());
        result = prime * result + ((getPpiPrice() == null) ? 0 : getPpiPrice().hashCode());
        result = prime * result + ((getPpiCreateTime() == null) ? 0 : getPpiCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ppiId=").append(ppiId);
        sb.append(", ppiPackId=").append(ppiPackId);
        sb.append(", ppiSkuId=").append(ppiSkuId);
        sb.append(", ppiQuantity=").append(ppiQuantity);
        sb.append(", ppiPrice=").append(ppiPrice);
        sb.append(", ppiCreateTime=").append(ppiCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}