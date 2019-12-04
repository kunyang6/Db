package com.database.incalss.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hourly_emp")
public class HourlyEmployee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ssn")
    @Length(max = 9)
    private long ssn;
    @Column(name = "hourly_salary")
    private long hourlySalary;

    public HourlyEmployee(){}

    public HourlyEmployee(long ssn, long hourlySalary){
        this.ssn = ssn;
        this.hourlySalary = hourlySalary;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(long hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
}
