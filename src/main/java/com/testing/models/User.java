package com.testing.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer id;
    private String name;
    private String email;    
    private Wallet wallet;
    private List<TransactionHistory> transactionHistories;

    public User() {
    }
    public User(Integer id, String name, String email, Wallet wallet, List<TransactionHistory> transactionHistories ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.wallet = wallet;
        if( this.transactionHistories == null ){
            this.transactionHistories = new ArrayList<TransactionHistory>();
        }else{
            this.transactionHistories = transactionHistories;

        }
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
    public List<TransactionHistory> getTransactionHistories() {
        return transactionHistories;
    }
    public void setTransactionHistories(List<TransactionHistory> transactionHistories) {
        this.transactionHistories = transactionHistories;
    }

    
}
