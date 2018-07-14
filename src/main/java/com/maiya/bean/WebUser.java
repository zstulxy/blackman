package com.maiya.bean;

import java.io.Serializable;

public class WebUser implements Serializable {
    private Long id;

    private Long userId;

    private String careers;

    private String privilege;

    private Byte privilegetype;

    private String certificate;

    private Boolean identity;

    private Byte assess;

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

    public String getCareers() {
        return careers;
    }

    public void setCareers(String careers) {
        this.careers = careers;
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

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public Boolean getIdentity() {
        return identity;
    }

    public void setIdentity(Boolean identity) {
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
        WebUser other = (WebUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCareers() == null ? other.getCareers() == null : this.getCareers().equals(other.getCareers()))
            && (this.getPrivilege() == null ? other.getPrivilege() == null : this.getPrivilege().equals(other.getPrivilege()))
            && (this.getPrivilegetype() == null ? other.getPrivilegetype() == null : this.getPrivilegetype().equals(other.getPrivilegetype()))
            && (this.getCertificate() == null ? other.getCertificate() == null : this.getCertificate().equals(other.getCertificate()))
            && (this.getIdentity() == null ? other.getIdentity() == null : this.getIdentity().equals(other.getIdentity()))
            && (this.getAssess() == null ? other.getAssess() == null : this.getAssess().equals(other.getAssess()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCareers() == null) ? 0 : getCareers().hashCode());
        result = prime * result + ((getPrivilege() == null) ? 0 : getPrivilege().hashCode());
        result = prime * result + ((getPrivilegetype() == null) ? 0 : getPrivilegetype().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", careers=").append(careers);
        sb.append(", privilege=").append(privilege);
        sb.append(", privilegetype=").append(privilegetype);
        sb.append(", certificate=").append(certificate);
        sb.append(", identity=").append(identity);
        sb.append(", assess=").append(assess);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}