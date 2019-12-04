package com.database.incalss.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Employee")
@Table(name = "employee")
@Inheritance(strategy =  InheritanceType.SINGLE_TABLE)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Length(max = 9)
    @Column(name = "snn")
    private long ssn;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "fname")
    private String fname;
    @Column(name = "mint")
    @Length(max = 1)
    private String mint;
    @Column(name = "lname")
    private String lname;
    @Column(name = "address")
    private String address;

    public Employee() {}

    public Employee(long ssn, Date dob, String fname, String mint, String lanme, String address ){
        this.ssn = ssn;
        this.dob = dob;
        this.fname = fname;
        this.mint = mint;
        this.lname = lanme;
        this.address = address;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMint() {
        return mint;
    }

    public void setMint(String mint) {
        this.mint = mint;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
