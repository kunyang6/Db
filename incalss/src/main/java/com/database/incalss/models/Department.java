package com.database.incalss.models;

import javax.persistence.*;

@Entity(name = "Department")
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deptNum")
    private long deptNum;
    @Column(name = "deptName")
    private String deptName;
    @Column(name = "numEmp")
    private long numEmp;

    public Department(){}

    public Department(long deptNum, String deptName, long numEmp){
        this.deptNum = deptNum;
        this.deptName = deptName;
        this.numEmp = numEmp;
    }

    public long getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(long deptNum) {
        this.deptNum = deptNum;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public long getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(long numEmp) {
        this.numEmp = numEmp;
    }
}
