package com.database.incalss.models;

import javax.persistence.*;

@Entity
@Table(name = "dependents")
public class Dependents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dependent")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "relationship")
    private String relationship;

    public Dependents() {}

    public Dependents(long id, String name, String relationship){
        this.id = id;
        this.name = name;
        this.relationship = relationship;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
