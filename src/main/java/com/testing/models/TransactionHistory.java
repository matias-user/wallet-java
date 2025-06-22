package com.testing.models;

import java.util.Date;

import com.testing.enums.TransactionType;

public class TransactionHistory {
    private Integer id;
    private Wallet wallet;
    private TransactionType transactionType;
    private Date date;
    private User user;

    public TransactionHistory() {
    }
    
    public TransactionHistory(Integer id, Wallet wallet, TransactionType transactionType, Date date, User user) {
        this.id = id;
        this.wallet = wallet;
        this.transactionType = transactionType;
        this.date = date;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Wallet getWallet() {
        return wallet;
    }
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public TransactionType getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


}
