package com.azu.laboratory.user;


import com.azu.laboratory.blood_donation.BloodDonation;

import java.util.List;


public class UserDto {
    private Integer id;
    private String name;

    private List<BloodDonation> blood_donations;


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

    public List<BloodDonation> getBlood_donations() {
        return blood_donations;
    }

    public void setBlood_donations(List<BloodDonation> blood_donations) {
        this.blood_donations = blood_donations;
    }


}
