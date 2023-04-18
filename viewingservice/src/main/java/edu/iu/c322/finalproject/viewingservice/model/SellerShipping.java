package edu.iu.c322.finalproject.viewingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SellerShipping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sellerShippingId;

    private String street;

    private String city;

    private String state;

    private int zipCode;



    public int getSellerShippingId() {
        return sellerShippingId;
    }

    public void setSellerShippingId(int sellerShippingId) {
        this.sellerShippingId = sellerShippingId;
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
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}