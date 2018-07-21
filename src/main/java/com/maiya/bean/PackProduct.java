package com.maiya.bean;

import java.io.Serializable;
import java.util.Date;

public class PackProduct implements Serializable {
    private Long papId;

    private String ppName;

    private Boolean ppStatus;

    private Long type;

    private Boolean isMultiBrand;

    private String packKey;

    private Long buyerId;

    private Date papCreateTime;

    private static final long serialVersionUID = 1L;

    public Long getPapId() {
        return papId;
    }

    public void setPapId(Long papId) {
        this.papId = papId;
    }

    public String getPpName() {
        return ppName;
    }

    public void setPpName(String ppName) {
        this.ppName = ppName;
    }

    public Boolean getPpStatus() {
        return ppStatus;
    }

    public void setPpStatus(Boolean ppStatus) {
        this.ppStatus = ppStatus;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Boolean getIsMultiBrand() {
        return isMultiBrand;
    }

    public void setIsMultiBrand(Boolean isMultiBrand) {
        this.isMultiBrand = isMultiBrand;
    }

    public String getPackKey() {
        return packKey;
    }

    public void setPackKey(String packKey) {
        this.packKey = packKey;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Date getPapCreateTime() {
        return papCreateTime;
    }

    public void setPapCreateTime(Date papCreateTime) {
        this.papCreateTime = papCreateTime;
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
        PackProduct other = (PackProduct) that;
        return (this.getPapId() == null ? other.getPapId() == null : this.getPapId().equals(other.getPapId()))
            && (this.getPpName() == null ? other.getPpName() == null : this.getPpName().equals(other.getPpName()))
            && (this.getPpStatus() == null ? other.getPpStatus() == null : this.getPpStatus().equals(other.getPpStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsMultiBrand() == null ? other.getIsMultiBrand() == null : this.getIsMultiBrand().equals(other.getIsMultiBrand()))
            && (this.getPackKey() == null ? other.getPackKey() == null : this.getPackKey().equals(other.getPackKey()))
            && (this.getBuyerId() == null ? other.getBuyerId() == null : this.getBuyerId().equals(other.getBuyerId()))
            && (this.getPapCreateTime() == null ? other.getPapCreateTime() == null : this.getPapCreateTime().equals(other.getPapCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPapId() == null) ? 0 : getPapId().hashCode());
        result = prime * result + ((getPpName() == null) ? 0 : getPpName().hashCode());
        result = prime * result + ((getPpStatus() == null) ? 0 : getPpStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsMultiBrand() == null) ? 0 : getIsMultiBrand().hashCode());
        result = prime * result + ((getPackKey() == null) ? 0 : getPackKey().hashCode());
        result = prime * result + ((getBuyerId() == null) ? 0 : getBuyerId().hashCode());
        result = prime * result + ((getPapCreateTime() == null) ? 0 : getPapCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", papId=").append(papId);
        sb.append(", ppName=").append(ppName);
        sb.append(", ppStatus=").append(ppStatus);
        sb.append(", type=").append(type);
        sb.append(", isMultiBrand=").append(isMultiBrand);
        sb.append(", packKey=").append(packKey);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", papCreateTime=").append(papCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}