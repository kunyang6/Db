package com.database.incalss.models;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "TheDreamCompany")
@Table(name = "the_dream_company")
public class TheDreamCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "projName")
    private String projName;
    @Column(name = "projNum")
    private long projNum;
    @Column(name = "ssn")
    private long ssn;
    @Column(name = "deptNum")
    private long deptNum;

    public TheDreamCompany(){}

    public TheDreamCompany(long id, String projName, long projNum,long ssn, long deptNum) {
        this.id = id;
        this.projName = projName;
        this.projNum = projNum;
        this.ssn = ssn;
        this.deptNum = deptNum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(long deptNum) {
        this.deptNum = deptNum;
    }
}
