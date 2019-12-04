package com.database.incalss.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "has_a_manager")
public class HasAManager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deptNum")
    private long deptNum;

    @Column(name = "ssn")
    @Length(max = 9)
    private long ssn;

    public HasAManager(){}

    public HasAManager(long deptNum, long ssn) {
        this.deptNum = deptNum;
        this.ssn = ssn;
    }

    public long getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(long deptNum) {
        this.deptNum = deptNum;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
}
