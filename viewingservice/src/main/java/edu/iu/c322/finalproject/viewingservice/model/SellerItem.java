package edu.iu.c322.finalproject.viewingservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class SellerItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sellerItemId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="seller_id")
    private Seller seller;


    private String name;
    private int inventory;
    private double price;
    private String description;



    public int getSellerItemId() {
        return sellerItemId;
    }

    public void setSellerItemId(int sellerItemId) {
        this.sellerItemId = sellerItemId;
    }

    public edu.iu.c322.finalproject.viewingservice.model.Seller getSeller() {
        return seller;
    }

    public void setSeller(edu.iu.c322.finalproject.viewingservice.model.Seller seller) {
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
