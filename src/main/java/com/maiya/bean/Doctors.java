package com.maiya.bean;

import java.io.Serializable;

public class Doctors implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctors_tbl.id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctors_tbl.content
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doctors_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctors_tbl.id
     *
     * @return the value of doctors_tbl.id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctors_tbl.id
     *
     * @param id the value for doctors_tbl.id
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctors_tbl.content
     *
     * @return the value of doctors_tbl.content
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctors_tbl.content
     *
     * @param content the value for doctors_tbl.content
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctors_tbl
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
        Doctors other = (Doctors) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctors_tbl
     *
     * @mbg.generated Sun Jul 08 14:51:08 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctors_tbl
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
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}