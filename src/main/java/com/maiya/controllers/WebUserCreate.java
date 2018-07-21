package com.maiya.controllers;

public class WebUserCreate extends UserCreate {
    //userId come from select max(id) from user_tbl;
    private String careers;

    private String privilege;

    private Byte privilegetype;

    private String certificate;

    private Boolean identity;

    private Byte assess;

    private String hosptial;

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

    public String getHosptial() {
        return hosptial;
    }

    public void setHosptial(String hosptial) {
        this.hosptial = hosptial;
    }
}
