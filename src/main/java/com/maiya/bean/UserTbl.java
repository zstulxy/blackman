package com.maiya.bean;

public class UserTbl {
    private Long id;

    private String name;

    private String phoneNumber;

    private String verification;

    private String password;

    private String avatar;

    private String email;

    private String company;

    private String privilege;

    private Integer privilegetype;

    private String backgroundIcon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public Integer getPrivilegetype() {
        return privilegetype;
    }

    public void setPrivilegetype(Integer privilegetype) {
        this.privilegetype = privilegetype;
    }

    public String getBackgroundIcon() {
        return backgroundIcon;
    }

    public void setBackgroundIcon(String backgroundIcon) {
        this.backgroundIcon = backgroundIcon;
    }
}