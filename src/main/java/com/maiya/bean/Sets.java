package com.maiya.bean;

import java.io.Serializable;
import java.util.Date;

public class Sets implements Serializable {
    private Long setsId;

    private String setsName;

    private Date setsCreateTime;

    private Long setsProductId;

    private static final long serialVersionUID = 1L;

    public Long getSetsId() {
        return setsId;
    }

    public void setSetsId(Long setsId) {
        this.setsId = setsId;
    }

    public String getSetsName() {
        return setsName;
    }

    public void setSetsName(String setsName) {
        this.setsName = setsName;
    }

    public Date getSetsCreateTime() {
        return setsCreateTime;
    }

    public void setSetsCreateTime(Date setsCreateTime) {
        this.setsCreateTime = setsCreateTime;
    }

    public Long getSetsProductId() {
        return setsProductId;
    }

    public void setSetsProductId(Long setsProductId) {
        this.setsProductId = setsProductId;
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
        Sets other = (Sets) that;
        return (this.getSetsId() == null ? other.getSetsId() == null : this.getSetsId().equals(other.getSetsId()))
            && (this.getSetsName() == null ? other.getSetsName() == null : this.getSetsName().equals(other.getSetsName()))
            && (this.getSetsCreateTime() == null ? other.getSetsCreateTime() == null : this.getSetsCreateTime().equals(other.getSetsCreateTime()))
            && (this.getSetsProductId() == null ? other.getSetsProductId() == null : this.getSetsProductId().equals(other.getSetsProductId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSetsId() == null) ? 0 : getSetsId().hashCode());
        result = prime * result + ((getSetsName() == null) ? 0 : getSetsName().hashCode());
        result = prime * result + ((getSetsCreateTime() == null) ? 0 : getSetsCreateTime().hashCode());
        result = prime * result + ((getSetsProductId() == null) ? 0 : getSetsProductId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", setsId=").append(setsId);
        sb.append(", setsName=").append(setsName);
        sb.append(", setsCreateTime=").append(setsCreateTime);
        sb.append(", setsProductId=").append(setsProductId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}