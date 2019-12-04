package com.database.incalss.models;

import javax.persistence.*;

@Entity(name = "HasDependents")
@Table(name = "has_dependents")
public class HasDependents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "ssn")
    private long ssn;

    @Column(name = "name")
    private String name;

    public HasDependents(){

    }

    public HasDependents(long id, long ssn, String name) {
        this.id = id;
        this.ssn = ssn;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
