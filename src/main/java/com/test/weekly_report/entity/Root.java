package com.test.weekly_report.entity;

import java.io.Serializable;

/**
 * (Root)实体类
 *
 * @author numsi
 * @since 2020-04-21 19:50:43
 */
public class Root implements Serializable {
    private static final long serialVersionUID = -64058422785614128L;
    
    private String rootName;
    
    private String rootPassword;
    
    private Integer rootId;


    public String getRootName() {
        return rootName;
    }

    public void setRootName(String rootName) {
        this.rootName = rootName;
    }

    public String getRootPassword() {
        return rootPassword;
    }

    public void setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
    }

    public Integer getRootId() {
        return rootId;
    }

    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

}