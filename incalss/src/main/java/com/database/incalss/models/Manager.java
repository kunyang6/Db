package com.database.incalss.models;

import javax.persistence.*;

@Entity(name = "Manager")
@Table(name = "manger")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ssn")
    private long ssn;

    @Column(name = "managerName")
    private String maangerName;

    public Manager(){}

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getMaangerName() {
        return maangerName;
    }

    public void setMaangerName(String maangerName) {
        this.maangerName = maangerName;
    }
}
