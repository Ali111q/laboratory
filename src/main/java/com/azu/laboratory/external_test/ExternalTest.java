package com.azu.laboratory.external_test;

import com.azu.laboratory.lab_test.LabTest;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@DiscriminatorValue("EXTERNAL")
public class ExternalTest extends LabTest {

     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExternalTest(Long id, String diagnoses, String allergy, String name) {
        super(id, diagnoses, allergy);
        this.name = name;
    }

    public ExternalTest(Long id, String diagnoses, String allergy) {
        super(id, diagnoses, allergy);
    }

    public ExternalTest() {
    }

    public ExternalTest(String name) {
        this.name = name;
    }

}
