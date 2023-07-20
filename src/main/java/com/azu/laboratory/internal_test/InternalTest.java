package com.azu.laboratory.internal_test;

import com.azu.laboratory.lab_test.LabTest;
import com.azu.laboratory.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Entity
@DiscriminatorValue("INTERNAL")
public class InternalTest extends LabTest {
    @OneToMany
    private List<User> users;

    private Boolean sample;
    private Boolean recieved;
    private Boolean resultReseaved;
    public InternalTest(Long id, String diagnoses, String allergy) {
        super(id, diagnoses, allergy);
    }

    public InternalTest(List<User> users, Boolean sample, Boolean received, Boolean resultReseived) {
        this.users = users;
        this.sample = sample ;
        this.recieved = received ;
        this.resultReseaved = resultReseived;
    }



    public InternalTest() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Boolean getSample() {
        return sample;
    }

    public void setSample(Boolean sample) {
        this.sample = sample;
    }

    public Boolean getRecieved() {
        return recieved;
    }

    public void setRecieved(Boolean recieved) {
        this.recieved = recieved==null?false:recieved;
    }

    public Boolean getResultReseaved() {
        return resultReseaved;
    }

    public void setResultReseaved(Boolean resultReseaved) {
        this.resultReseaved = resultReseaved;
    }
}
