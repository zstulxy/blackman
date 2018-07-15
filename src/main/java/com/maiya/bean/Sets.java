package com.maiya.bean;

import java.io.Serializable;

public class Sets implements Serializable {
    private Long id;

    private Long userId;

    private String name;

    private String toothpaste;

    private Long toothpasteId;

    private String toothbrush;

    private Long toothbrushId;

    private String mouthwash;

    private Long mouthwashId;

    private String dentalfloss;

    private Long dentalflossId;

    private Long sales;

    private AppUser appUser;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToothpaste() {
        return toothpaste;
    }

    public void setToothpaste(String toothpaste) {
        this.toothpaste = toothpaste;
    }

    public Long getToothpasteId() {
        return toothpasteId;
    }

    public void setToothpasteId(Long toothpasteId) {
        this.toothpasteId = toothpasteId;
    }

    public String getToothbrush() {
        return toothbrush;
    }

    public void setToothbrush(String toothbrush) {
        this.toothbrush = toothbrush;
    }

    public Long getToothbrushId() {
        return toothbrushId;
    }

    public void setToothbrushId(Long toothbrushId) {
        this.toothbrushId = toothbrushId;
    }

    public String getMouthwash() {
        return mouthwash;
    }

    public void setMouthwash(String mouthwash) {
        this.mouthwash = mouthwash;
    }

    public Long getMouthwashId() {
        return mouthwashId;
    }

    public void setMouthwashId(Long mouthwashId) {
        this.mouthwashId = mouthwashId;
    }

    public String getDentalfloss() {
        return dentalfloss;
    }

    public void setDentalfloss(String dentalfloss) {
        this.dentalfloss = dentalfloss;
    }

    public Long getDentalflossId() {
        return dentalflossId;
    }

    public void setDentalflossId(Long dentalflossId) {
        this.dentalflossId = dentalflossId;
    }

    public Long getSales() {
        return sales;
    }

    public void setSales(Long sales) {
        this.sales = sales;
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
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getToothpaste() == null ? other.getToothpaste() == null : this.getToothpaste().equals(other.getToothpaste()))
            && (this.getToothpasteId() == null ? other.getToothpasteId() == null : this.getToothpasteId().equals(other.getToothpasteId()))
            && (this.getToothbrush() == null ? other.getToothbrush() == null : this.getToothbrush().equals(other.getToothbrush()))
            && (this.getToothbrushId() == null ? other.getToothbrushId() == null : this.getToothbrushId().equals(other.getToothbrushId()))
            && (this.getMouthwash() == null ? other.getMouthwash() == null : this.getMouthwash().equals(other.getMouthwash()))
            && (this.getMouthwashId() == null ? other.getMouthwashId() == null : this.getMouthwashId().equals(other.getMouthwashId()))
            && (this.getDentalfloss() == null ? other.getDentalfloss() == null : this.getDentalfloss().equals(other.getDentalfloss()))
            && (this.getDentalflossId() == null ? other.getDentalflossId() == null : this.getDentalflossId().equals(other.getDentalflossId()))
            && (this.getSales() == null ? other.getSales() == null : this.getSales().equals(other.getSales()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getToothpaste() == null) ? 0 : getToothpaste().hashCode());
        result = prime * result + ((getToothpasteId() == null) ? 0 : getToothpasteId().hashCode());
        result = prime * result + ((getToothbrush() == null) ? 0 : getToothbrush().hashCode());
        result = prime * result + ((getToothbrushId() == null) ? 0 : getToothbrushId().hashCode());
        result = prime * result + ((getMouthwash() == null) ? 0 : getMouthwash().hashCode());
        result = prime * result + ((getMouthwashId() == null) ? 0 : getMouthwashId().hashCode());
        result = prime * result + ((getDentalfloss() == null) ? 0 : getDentalfloss().hashCode());
        result = prime * result + ((getDentalflossId() == null) ? 0 : getDentalflossId().hashCode());
        result = prime * result + ((getSales() == null) ? 0 : getSales().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", toothpaste=").append(toothpaste);
        sb.append(", toothpasteId=").append(toothpasteId);
        sb.append(", toothbrush=").append(toothbrush);
        sb.append(", toothbrushId=").append(toothbrushId);
        sb.append(", mouthwash=").append(mouthwash);
        sb.append(", mouthwashId=").append(mouthwashId);
        sb.append(", dentalfloss=").append(dentalfloss);
        sb.append(", dentalflossId=").append(dentalflossId);
        sb.append(", sales=").append(sales);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}