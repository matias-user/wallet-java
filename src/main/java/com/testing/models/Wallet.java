package com.testing.models;

public class Wallet {
    private Integer id;
    private Double quantity = 0.0;
    
    public Wallet() {
    }
    public Wallet(Integer id, Double quantity) {
        this.id = id;
        this.quantity = quantity;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    
}
