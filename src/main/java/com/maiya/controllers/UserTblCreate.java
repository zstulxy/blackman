package com.maiya.controllers;


import com.maiya.bean.User;

public class UserTblCreate {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_tbl.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_tbl.phone_number
     *
     * @mbggenerated
     */
    private String phoneNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_tbl.password
     *
     * @mbggenerated
     */
    private String password;

    private Byte privilegetype;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_tbl.name
     *
     * @return the value of user_tbl.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_tbl.name
     *
     * @param name the value for user_tbl.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_tbl.phone_number
     *
     * @return the value of user_tbl.phone_number
     *
     * @mbggenerated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_tbl.phone_number
     *
     * @param phoneNumber the value for user_tbl.phone_number
     *
     * @mbggenerated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_tbl.password
     *
     * @return the value of user_tbl.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_tbl.password
     *
     * @param password the value for user_tbl.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_tbl.privilegetype
     *
     * @return the value of user_tbl.privilegetype
     *
     * @mbggenerated
     */
    public Byte getPrivilegetype() {
        return privilegetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_tbl.privilegetype
     *
     * @param privilegetype the value for user_tbl.privilegetype
     *
     * @mbggenerated
     */
    public void setPrivilegetype(Byte privilegetype) {
        this.privilegetype = privilegetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbggenerated
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
        User other = (User) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPrivilegetype() == null ? other.getPrivilegetype() == null : this.getPrivilegetype().equals(other.getPrivilegetype()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tbl
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPrivilegetype() == null) ? 0 : getPrivilegetype().hashCode());
        return result;
    }
}
