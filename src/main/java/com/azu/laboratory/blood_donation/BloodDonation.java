package com.azu.laboratory.blood_donation;

import com.azu.laboratory.user.User;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class BloodDonation {
    @Id
    @SequenceGenerator(
            name = "blood_id_seq",
            sequenceName = "blood_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "blood_id_seq",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;
    private String name;
    private String spot;
    @ElementCollection
    private List<String> images;
    private LocalDateTime date;


    public BloodDonation(Integer id, String name, String spot, List<String> images, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.spot = spot;
        this.images = images;
        this.date = date;

    }

    public BloodDonation() {
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

    public void setSpotl(String spotl) {
        this.spot = spot;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


}
