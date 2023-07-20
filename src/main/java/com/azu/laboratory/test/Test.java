package com.azu.laboratory.test;

import jakarta.persistence.*;

@Entity
@Table
public class Test {
    @Id
    @SequenceGenerator(
            name = "test_id_seq",
             sequenceName = "test_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "test_id_seq",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;
    private String name;
    private String spot;

    public Test() {
    }

    public Test(Integer id, String name, String spot) {
        this.id = id;
        this.name = name;
        this.spot = spot;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }
}
