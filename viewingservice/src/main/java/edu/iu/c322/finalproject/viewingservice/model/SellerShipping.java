package edu.iu.c322.finalproject.viewingservice.model;

import jakarta.persistence.*;

@Entity
public class SellerShipping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String street;

    private String city;

    private String state;

    private int postalCode;



    public int getSellerShippingId() {
        return id;
    }

    public void setSellerShippingId(int sellerShippingId) {
        this.id = sellerShippingId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return postalCode;
    }

    public void setZipCode(int zipCode) {
        this.postalCode = zipCode;
    }
}
