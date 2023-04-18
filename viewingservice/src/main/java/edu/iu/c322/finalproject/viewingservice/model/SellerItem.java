package edu.iu.c322.finalproject.viewingservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class SellerItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sellerItemId;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Seller Seller;

    @OneToOne(cascade = CascadeType.ALL)
    private FeedbackItem itemFeedback;

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
        return Seller;
    }

    public void setSeller(edu.iu.c322.finalproject.viewingservice.model.Seller seller) {
        Seller = seller;
    }

    public FeedbackItem getItemFeedback() {
        return itemFeedback;
    }

    public void setItemFeedback(FeedbackItem itemFeedback) {
        this.itemFeedback = itemFeedback;
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
