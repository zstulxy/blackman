package com.maiya.bean;

import java.io.Serializable;

public class Sets implements Serializable {
    private Long id;

    private Long userId;

    private String toothpaste;

    private String toothbrush;

    private String mouthwash;

    private String dentalfloss;

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

    public String getToothpaste() {
        return toothpaste;
    }

    public void setToothpaste(String toothpaste) {
        this.toothpaste = toothpaste;
    }

    public String getToothbrush() {
        return toothbrush;
    }

    public void setToothbrush(String toothbrush) {
        this.toothbrush = toothbrush;
    }

    public String getMouthwash() {
        return mouthwash;
    }

    public void setMouthwash(String mouthwash) {
        this.mouthwash = mouthwash;
    }

    public String getDentalfloss() {
        return dentalfloss;
    }

    public void setDentalfloss(String dentalfloss) {
        this.dentalfloss = dentalfloss;
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
            && (this.getToothpaste() == null ? other.getToothpaste() == null : this.getToothpaste().equals(other.getToothpaste()))
            && (this.getToothbrush() == null ? other.getToothbrush() == null : this.getToothbrush().equals(other.getToothbrush()))
            && (this.getMouthwash() == null ? other.getMouthwash() == null : this.getMouthwash().equals(other.getMouthwash()))
            && (this.getDentalfloss() == null ? other.getDentalfloss() == null : this.getDentalfloss().equals(other.getDentalfloss()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getToothpaste() == null) ? 0 : getToothpaste().hashCode());
        result = prime * result + ((getToothbrush() == null) ? 0 : getToothbrush().hashCode());
        result = prime * result + ((getMouthwash() == null) ? 0 : getMouthwash().hashCode());
        result = prime * result + ((getDentalfloss() == null) ? 0 : getDentalfloss().hashCode());
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
        sb.append(", toothpaste=").append(toothpaste);
        sb.append(", toothbrush=").append(toothbrush);
        sb.append(", mouthwash=").append(mouthwash);
        sb.append(", dentalfloss=").append(dentalfloss);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}