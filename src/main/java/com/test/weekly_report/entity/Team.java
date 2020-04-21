package com.test.weekly_report.entity;

import java.io.Serializable;

/**
 * 科研团队信息(Team)实体类
 *
 * @author numsi
 * @since 2020-04-21 19:50:51
 */
public class Team implements Serializable {
    private static final long serialVersionUID = 580042672251953109L;
    
    private Integer teamUid;
    /**
    * 科研团队账号
    */
    private String teamId;
    /**
    * 科研团队密码
    */
    private String teamPassword;
    /**
    * 科研团队名称
    */
    private String teamName;


    public Integer getTeamUid() {
        return teamUid;
    }

    public void setTeamUid(Integer teamUid) {
        this.teamUid = teamUid;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamPassword() {
        return teamPassword;
    }

    public void setTeamPassword(String teamPassword) {
        this.teamPassword = teamPassword;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}