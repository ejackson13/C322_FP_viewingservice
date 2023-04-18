package edu.iu.c322.finalproject.viewingservice.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sellerId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SellerItem> sellerItems;

    private String venmoId;

    @OneToOne(cascade = CascadeType.ALL)
    private SellerShipping sellerShipping;

    private String sellerName;
    private String sellerEmail;

    @OneToOne(cascade = CascadeType.ALL)
    private FeedbackSeller sellerFeedback;




    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public List<SellerItem> getSellerItems() {
        return sellerItems;
    }

    public void setSellerItems(List<SellerItem> sellerItems) {
        this.sellerItems = sellerItems;
    }

    public String getVenmoId() {
        return venmoId;
    }

    public void setVenmoId(String venmoId) {
        this.venmoId = venmoId;
    }

    public SellerShipping getSellerShipping() {
        return sellerShipping;
    }

    public void setSellerShipping(SellerShipping sellerShipping) {
        this.sellerShipping = sellerShipping;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }
}
