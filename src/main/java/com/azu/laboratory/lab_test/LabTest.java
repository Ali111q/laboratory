package com.azu.laboratory.lab_test;

import com.azu.laboratory.test.Test;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "lab_test_type", discriminatorType = DiscriminatorType.STRING)
public abstract class LabTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diagnoses;
    private String allergy;

    @OneToMany
    private List<Test> tests;
    public LabTest(Long id, String diagnoses, String allergy) {
        this.id = id;
        this.diagnoses = diagnoses;
        this.allergy = allergy;
    }



    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public LabTest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(String diagnoses) {
        this.diagnoses = diagnoses;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
// Getters and Setters for common attributes
}
