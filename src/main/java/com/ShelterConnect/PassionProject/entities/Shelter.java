package com.ShelterConnect.PassionProject.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Shelter")
    private Integer shelter_ID;
    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "Address", nullable = false)
    private String address;
    @Column(name = "Website")
    private String website;
    @Column(name = "Phone_Number", nullable = false)
    private String phone_Number;
    @Column(name = "Bed_Availability", nullable = false)
    private Integer bed_Availability;
    @Column(name = "Food_Availability", nullable = false)
    private String food_Availability;
    @Column(name = "Inventory_Status", nullable = false)
    private String inventory_Status;
    @Column(name = "Email_Address", nullable = false, unique = true)
    private String email_Address;

    public Shelter(String name, String address, String website, String phone_Number, Integer bed_Availability, String food_Availability, String inventory_Status, String email_Address) {
        this.name = name;
        this.address = address;
        this.website = website;
        this.phone_Number = phone_Number;
        this.bed_Availability = bed_Availability;
        this.food_Availability = food_Availability;
        this.inventory_Status = inventory_Status;
        this.email_Address = email_Address;
    }
}
