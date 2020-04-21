package com.test.weekly_report.entity;

import java.io.Serializable;

/**
 * 学生信息(Student)实体类
 *
 * @author numsi
 * @since 2020-04-21 19:50:47
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 864092296324753174L;
    
    private Integer studentUid;
    /**
    * 学生账号
    */
    private String studentId;
    /**
    * 学生密码
    */
    private String studentPassword;
    /**
    * 学生姓名
    */
    private String studentName;
    /**
    * 学生导师
    */
    private String studentTutorid;
    /**
    * 学生邮箱
    */
    private String studentEmail;
    /**
    * 学生电话
    */
    private String studentPhone;


    public Integer getStudentUid() {
        return studentUid;
    }

    public void setStudentUid(Integer studentUid) {
        this.studentUid = studentUid;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentTutorid() {
        return studentTutorid;
    }

    public void setStudentTutorid(String studentTutorid) {
        this.studentTutorid = studentTutorid;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

}