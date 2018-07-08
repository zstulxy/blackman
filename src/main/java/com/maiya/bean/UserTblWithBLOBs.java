package com.maiya.bean;

public class UserTblWithBLOBs extends UserTbl {
    private String backgroundIcon;

    private String certificate;

    public String getBackgroundIcon() {
        return backgroundIcon;
    }

    public void setBackgroundIcon(String backgroundIcon) {
        this.backgroundIcon = backgroundIcon;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}