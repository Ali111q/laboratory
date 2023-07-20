package com.azu.laboratory.user;

import com.azu.laboratory.blood_donation.BloodDonation;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "user_id_seq", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;

    @OneToMany
    private List<BloodDonation>blood_donations;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public List<BloodDonation> getBloodDonations() {
        return blood_donations;
    }

    public void setBloodDonations(List<BloodDonation> bloodDonations) {
        this.blood_donations = bloodDonations;
    }


}
