package com.test.weekly_report.entity;

import java.io.Serializable;

/**
 * 导师信息(Tutor)实体类
 *
 * @author numsi
 * @since 2020-04-21 19:50:56
 */
public class Tutor implements Serializable {
    private static final long serialVersionUID = 577776318082238116L;
    
    private Integer tutorUid;
    /**
    * 导师帐号
    */
    private String tutorId;
    /**
    * 导师密码
    */
    private String tutorPassword;
    /**
    * 导师姓名
    */
    private String tutorName;
    /**
    * 导师所属的科研团队
    */
    private String tutorTeamname;
    /**
    * 导师职称
    */
    private String tutorRank;
    /**
    * 导师电话
    */
    private String tutorPhone;


    public Integer getTutorUid() {
        return tutorUid;
    }

    public void setTutorUid(Integer tutorUid) {
        this.tutorUid = tutorUid;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public String getTutorPassword() {
        return tutorPassword;
    }

    public void setTutorPassword(String tutorPassword) {
        this.tutorPassword = tutorPassword;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutorTeamname() {
        return tutorTeamname;
    }

    public void setTutorTeamname(String tutorTeamname) {
        this.tutorTeamname = tutorTeamname;
    }

    public String getTutorRank() {
        return tutorRank;
    }

    public void setTutorRank(String tutorRank) {
        this.tutorRank = tutorRank;
    }

    public String getTutorPhone() {
        return tutorPhone;
    }

    public void setTutorPhone(String tutorPhone) {
        this.tutorPhone = tutorPhone;
    }

}