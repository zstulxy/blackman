package com.maiya.controllers;

/**
 * Created by Administrator on 2017/8/5.
 */
public class UserTblUpdate {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_tbl.id
     *
     * @mbggenerated
     */
    private Long id;

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

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_tbl.avatar
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_tbl.privilege
     *
     * @mbggenerated
     */
    private String privilege;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_tbl.privilegetype
     *
     * @mbggenerated
     */
    private Integer privilegetype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_tbl.id
     *
     * @return the value of user_tbl.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_tbl.id
     *
     * @param id the value for user_tbl.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * This method returns the value of the database column user_tbl.avatar
     *
     * @return the value of user_tbl.avatar
     *
     * @mbggenerated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_tbl.avatar
     *
     * @param avatar the value for user_tbl.avatar
     *
     * @mbggenerated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_tbl.privilege
     *
     * @return the value of user_tbl.privilege
     *
     * @mbggenerated
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_tbl.privilege
     *
     * @param privilege the value for user_tbl.privilege
     *
     * @mbggenerated
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege == null ? null : privilege.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_tbl.privilegetype
     *
     * @return the value of user_tbl.privilegetype
     *
     * @mbggenerated
     */
    public Integer getPrivilegetype() {
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
    public void setPrivilegetype(Integer privilegetype) {
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
        UserTblUpdate other = (UserTblUpdate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
                && (this.getPrivilege() == null ? other.getPrivilege() == null : this.getPrivilege().equals(other.getPrivilege()))
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
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getPrivilege() == null) ? 0 : getPrivilege().hashCode());
        result = prime * result + ((getPrivilegetype() == null) ? 0 : getPrivilegetype().hashCode());
        return result;
    }

}
