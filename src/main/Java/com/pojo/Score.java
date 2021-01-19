package com.pojo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Author:17
 * Date:2021-01-15 11:43
 * Description:<描述>
 */
//@Component
public class Score {

    private String id;
    private String sno;
    private String name;
    private String grade;
    private String isDelete;

    public Score() {
    }

    public Score(String id, String sno, String name, String grade, String isDelete) {
        this.id = id;
        this.sno = sno;
        this.name = name;
        this.grade = grade;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id='" + id + '\'' +
                ", sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}
