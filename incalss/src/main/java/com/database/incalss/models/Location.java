package com.database.incalss.models;

import javax.persistence.*;

@Entity(name = "Location")
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "address")
    private String address;
    @Column(name = "deptNum")
    private long deptNum;

    public Location() {}

    public Location(long id, String address, long deptNum) {
        this.id = id;
        this.address = address;
        this.deptNum = deptNum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(long deptNum) {
        this.deptNum = deptNum;
    }
}
