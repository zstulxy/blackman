package com.maiya.common;

public enum PrivilegeType {
    ROOT_TYPE("root", 1),
	ADMINI_TYPE("admin", 2),
	NORMAL_TYPE("normal", 3);

	
	private String privilege;  
    private int index;

    private PrivilegeType(String privilege, int index) {  
        this.privilege = privilege;  
        this.index = index;
    }  

    public static String getName(int index) {  
        for (PrivilegeType c : PrivilegeType.values()) {  
            if (c.getIndex() == index) {  
                return c.privilege;  
            }  
        }  
        return null;  
    }
    public String getPrivilege() {  
        return privilege;  
    }  
    public void setPrivilege(String privilege) {  
        this.privilege = privilege;  
    }  
    public int getIndex() {  
        return index;  
    }  
    public void setIndex(int index) {  
        this.index = index;  
    } 
}
