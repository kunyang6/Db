package com.database.incalss.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Project")
@Table(name = "project")
public class Project {
    @Id
    @Column(name = "projName")
    private String projName;

    @Id
    @Column(name = "projNum")
    private long projNum;

    @Column(name = "projDesc")
    private String projDesc;

    public Project() {}

    public Project(String projName, long projNum, String projDesc) {
        this.projName = projName;
        this.projNum = projNum;
        this.projDesc = projDesc;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public long getProjNum() {
        return projNum;
    }

    public void setProjNum(long projNum) {
        this.projNum = projNum;
    }

    public String getProjDesc() {
        return projDesc;
    }

    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }
}
