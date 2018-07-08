package com.maiya.bean;

import java.io.Serializable;

public class Sets implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sets_tbl.id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sets_tbl.user_id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sets_tbl.toothpaste
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private String toothpaste;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sets_tbl.toothbrush
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private String toothbrush;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sets_tbl.mouthwash
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private String mouthwash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sets_tbl.dentalfloss
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private String dentalfloss;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sets_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sets_tbl.id
     *
     * @return the value of sets_tbl.id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sets_tbl.id
     *
     * @param id the value for sets_tbl.id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sets_tbl.user_id
     *
     * @return the value of sets_tbl.user_id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sets_tbl.user_id
     *
     * @param userId the value for sets_tbl.user_id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sets_tbl.toothpaste
     *
     * @return the value of sets_tbl.toothpaste
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public String getToothpaste() {
        return toothpaste;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sets_tbl.toothpaste
     *
     * @param toothpaste the value for sets_tbl.toothpaste
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public void setToothpaste(String toothpaste) {
        this.toothpaste = toothpaste;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sets_tbl.toothbrush
     *
     * @return the value of sets_tbl.toothbrush
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public String getToothbrush() {
        return toothbrush;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sets_tbl.toothbrush
     *
     * @param toothbrush the value for sets_tbl.toothbrush
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public void setToothbrush(String toothbrush) {
        this.toothbrush = toothbrush;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sets_tbl.mouthwash
     *
     * @return the value of sets_tbl.mouthwash
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public String getMouthwash() {
        return mouthwash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sets_tbl.mouthwash
     *
     * @param mouthwash the value for sets_tbl.mouthwash
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public void setMouthwash(String mouthwash) {
        this.mouthwash = mouthwash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sets_tbl.dentalfloss
     *
     * @return the value of sets_tbl.dentalfloss
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public String getDentalfloss() {
        return dentalfloss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sets_tbl.dentalfloss
     *
     * @param dentalfloss the value for sets_tbl.dentalfloss
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public void setDentalfloss(String dentalfloss) {
        this.dentalfloss = dentalfloss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sets_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sets_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sets_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
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