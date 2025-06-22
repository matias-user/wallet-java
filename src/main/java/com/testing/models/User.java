package com.testing.models;

public class User {
    private Integer id;
    private String name;
    private String email;    
    private Wallet wallet;
    public User() {
    }
    public User(Integer id, String name, String email, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.wallet = wallet;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Wallet getWallet() {
        return wallet;
    }
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    
}
