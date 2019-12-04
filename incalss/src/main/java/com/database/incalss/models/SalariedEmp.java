package com.database.incalss.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity(name = "SalariedEmp")
@Table(name = "salaried_emp")
public class SalariedEmp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ssn")
    @Length(max = 9)
    private long ssn;

    @Column(name = "monthly_salary")
    private long monthlySalary;

    public SalariedEmp() {}

    public SalariedEmp(long ssn, long monthlySalary) {
        this.ssn = ssn;
        this.monthlySalary = monthlySalary;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(long monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
