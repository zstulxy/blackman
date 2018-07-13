package com.maiya.bean;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;

    private String name;

    private Byte sex;

    private String careers;

    private Byte age;

    private String phoneNumber;

    private String verification;

    private String password;

    private String backgroundIcon;

    private String avatar;

    private String email;

    private String privilege;

    private Byte privilegetype;

    private Short points;

    private String certificate;

    private Byte identity;

    private Byte assess;

    private static final long serialVersionUID = 1L;

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

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getCareers() {
        return careers;
    }

    public void setCareers(String careers) {
        this.careers = careers;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
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

    public String getBackgroundIcon() {
        return backgroundIcon;
    }

    public void setBackgroundIcon(String backgroundIcon) {
        this.backgroundIcon = backgroundIcon;
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

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public Byte getPrivilegetype() {
        return privilegetype;
    }

    public void setPrivilegetype(Byte privilegetype) {
        this.privilegetype = privilegetype;
    }

    public Short getPoints() {
        return points;
    }

    public void setPoints(Short points) {
        this.points = points;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public Byte getIdentity() {
        return identity;
    }

    public void setIdentity(Byte identity) {
        this.identity = identity;
    }

    public Byte getAssess() {
        return assess;
    }

    public void setAssess(Byte assess) {
        this.assess = assess;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getCareers() == null ? other.getCareers() == null : this.getCareers().equals(other.getCareers()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getVerification() == null ? other.getVerification() == null : this.getVerification().equals(other.getVerification()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getBackgroundIcon() == null ? other.getBackgroundIcon() == null : this.getBackgroundIcon().equals(other.getBackgroundIcon()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPrivilege() == null ? other.getPrivilege() == null : this.getPrivilege().equals(other.getPrivilege()))
            && (this.getPrivilegetype() == null ? other.getPrivilegetype() == null : this.getPrivilegetype().equals(other.getPrivilegetype()))
            && (this.getPoints() == null ? other.getPoints() == null : this.getPoints().equals(other.getPoints()))
            && (this.getCertificate() == null ? other.getCertificate() == null : this.getCertificate().equals(other.getCertificate()))
            && (this.getIdentity() == null ? other.getIdentity() == null : this.getIdentity().equals(other.getIdentity()))
            && (this.getAssess() == null ? other.getAssess() == null : this.getAssess().equals(other.getAssess()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCareers() == null) ? 0 : getCareers().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getVerification() == null) ? 0 : getVerification().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getBackgroundIcon() == null) ? 0 : getBackgroundIcon().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPrivilege() == null) ? 0 : getPrivilege().hashCode());
        result = prime * result + ((getPrivilegetype() == null) ? 0 : getPrivilegetype().hashCode());
        result = prime * result + ((getPoints() == null) ? 0 : getPoints().hashCode());
        result = prime * result + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        result = prime * result + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        result = prime * result + ((getAssess() == null) ? 0 : getAssess().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", careers=").append(careers);
        sb.append(", age=").append(age);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", verification=").append(verification);
        sb.append(", password=").append(password);
        sb.append(", backgroundIcon=").append(backgroundIcon);
        sb.append(", avatar=").append(avatar);
        sb.append(", email=").append(email);
        sb.append(", privilege=").append(privilege);
        sb.append(", privilegetype=").append(privilegetype);
        sb.append(", points=").append(points);
        sb.append(", certificate=").append(certificate);
        sb.append(", identity=").append(identity);
        sb.append(", assess=").append(assess);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}