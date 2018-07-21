package com.maiya.bean;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private Long pId;

    private String pName;

    private Long pBrandId;

    private Long sellerId;

    private Date pCreateTime;
	
	private ProductSku productSku;
	
	private PackProductInfo packProductInfo;

    private static final long serialVersionUID = 1L;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Long getpBrandId() {
        return pBrandId;
    }

    public void setpBrandId(Long pBrandId) {
        this.pBrandId = pBrandId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Date getpCreateTime() {
        return pCreateTime;
    }

    public void setpCreateTime(Date pCreateTime) {
        this.pCreateTime = pCreateTime;
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
        Product other = (Product) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getpName() == null ? other.getpName() == null : this.getpName().equals(other.getpName()))
            && (this.getpBrandId() == null ? other.getpBrandId() == null : this.getpBrandId().equals(other.getpBrandId()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getpCreateTime() == null ? other.getpCreateTime() == null : this.getpCreateTime().equals(other.getpCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getpName() == null) ? 0 : getpName().hashCode());
        result = prime * result + ((getpBrandId() == null) ? 0 : getpBrandId().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getpCreateTime() == null) ? 0 : getpCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pName=").append(pName);
        sb.append(", pBrandId=").append(pBrandId);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", pCreateTime=").append(pCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public ProductSku getProductSku() {
        return productSku;
    }

    public void setProductSku(ProductSku productSku) {
        this.productSku = productSku;
    }

    public PackProductInfo getPackProductInfo() {
        return packProductInfo;
    }

    public void setPackProductInfo(PackProductInfo packProductInfo) {
        this.packProductInfo = packProductInfo;
    }
}