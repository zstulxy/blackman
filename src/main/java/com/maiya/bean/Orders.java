package com.maiya.bean;

import java.io.Serializable;

public class Orders implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_tbl.id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_tbl.user_id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_tbl.product_id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_tbl.is_buy
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    private Byte isBuy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders_tbl
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_tbl.id
     *
     * @return the value of orders_tbl.id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_tbl.id
     *
     * @param id the value for orders_tbl.id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_tbl.user_id
     *
     * @return the value of orders_tbl.user_id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_tbl.user_id
     *
     * @param userId the value for orders_tbl.user_id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_tbl.product_id
     *
     * @return the value of orders_tbl.product_id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_tbl.product_id
     *
     * @param productId the value for orders_tbl.product_id
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_tbl.is_buy
     *
     * @return the value of orders_tbl.is_buy
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    public Byte getIsBuy() {
        return isBuy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_tbl.is_buy
     *
     * @param isBuy the value for orders_tbl.is_buy
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    public void setIsBuy(Byte isBuy) {
        this.isBuy = isBuy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_tbl
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
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
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getIsBuy() == null ? other.getIsBuy() == null : this.getIsBuy().equals(other.getIsBuy()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_tbl
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getIsBuy() == null) ? 0 : getIsBuy().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_tbl
     *
     * @mbggenerated Sun Jul 08 13:04:45 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", isBuy=").append(isBuy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}