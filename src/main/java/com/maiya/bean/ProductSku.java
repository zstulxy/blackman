package com.maiya.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductSku implements Serializable {
    private Long psId;

    private Long psProductId;

    private Long psQuantity;

    private Long psPrice;

    private Boolean psStatus;

    private Long productCode;

    private Date psCreateTime;

    private static final long serialVersionUID = 1L;

    public Long getPsId() {
        return psId;
    }

    public void setPsId(Long psId) {
        this.psId = psId;
    }

    public Long getPsProductId() {
        return psProductId;
    }

    public void setPsProductId(Long psProductId) {
        this.psProductId = psProductId;
    }

    public Long getPsQuantity() {
        return psQuantity;
    }

    public void setPsQuantity(Long psQuantity) {
        this.psQuantity = psQuantity;
    }

    public Long getPsPrice() {
        return psPrice;
    }

    public void setPsPrice(Long psPrice) {
        this.psPrice = psPrice;
    }

    public Boolean getPsStatus() {
        return psStatus;
    }

    public void setPsStatus(Boolean psStatus) {
        this.psStatus = psStatus;
    }

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }

    public Date getPsCreateTime() {
        return psCreateTime;
    }

    public void setPsCreateTime(Date psCreateTime) {
        this.psCreateTime = psCreateTime;
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
        ProductSku other = (ProductSku) that;
        return (this.getPsId() == null ? other.getPsId() == null : this.getPsId().equals(other.getPsId()))
            && (this.getPsProductId() == null ? other.getPsProductId() == null : this.getPsProductId().equals(other.getPsProductId()))
            && (this.getPsQuantity() == null ? other.getPsQuantity() == null : this.getPsQuantity().equals(other.getPsQuantity()))
            && (this.getPsPrice() == null ? other.getPsPrice() == null : this.getPsPrice().equals(other.getPsPrice()))
            && (this.getPsStatus() == null ? other.getPsStatus() == null : this.getPsStatus().equals(other.getPsStatus()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getPsCreateTime() == null ? other.getPsCreateTime() == null : this.getPsCreateTime().equals(other.getPsCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPsId() == null) ? 0 : getPsId().hashCode());
        result = prime * result + ((getPsProductId() == null) ? 0 : getPsProductId().hashCode());
        result = prime * result + ((getPsQuantity() == null) ? 0 : getPsQuantity().hashCode());
        result = prime * result + ((getPsPrice() == null) ? 0 : getPsPrice().hashCode());
        result = prime * result + ((getPsStatus() == null) ? 0 : getPsStatus().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getPsCreateTime() == null) ? 0 : getPsCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", psId=").append(psId);
        sb.append(", psProductId=").append(psProductId);
        sb.append(", psQuantity=").append(psQuantity);
        sb.append(", psPrice=").append(psPrice);
        sb.append(", psStatus=").append(psStatus);
        sb.append(", productCode=").append(productCode);
        sb.append(", psCreateTime=").append(psCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}