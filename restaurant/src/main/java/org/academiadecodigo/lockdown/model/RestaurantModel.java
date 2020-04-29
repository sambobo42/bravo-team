package org.academiadecodigo.lockdown.model;

import javax.persistence.*;

@Entity
@Table(name ="restaurant")
public class RestaurantModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    public String name;
    public String address;
    public String postalCode;
    public String ownerName;
    public String hasTakeAway;
    public String email;
    public String phone;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getHasTakeAway() {
        return hasTakeAway;
    }

    public void setHasTakeAway(String hasTakeAway) {
        this.hasTakeAway = hasTakeAway;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
