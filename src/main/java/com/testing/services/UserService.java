package com.testing.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.testing.enums.TransactionType;
import com.testing.models.TransactionHistory;
import com.testing.models.User;
import com.testing.models.Wallet;

public class UserService {
    private User user;
    private Wallet wallet;
    private List<TransactionHistory> transactionHistories;

    public UserService(User user){
        this.user = user;
        this.wallet = user.getWallet();
        if( user.getTransactionHistories() == null ){
            this.transactionHistories = new ArrayList<TransactionHistory>();
        }else{
            this.transactionHistories = user.getTransactionHistories();

        }
    }

    public void deposit(double amount){
        this.user.getWallet().setQuantity(wallet.getQuantity() + amount);
        TransactionHistory transaction = this.createTransactionHistory(wallet, TransactionType.DEPOSIT);
        this.transactionHistories.add( transaction );
        this.user.getTransactionHistories().add( transaction );
    }
    public void withdraw(double amount){
        this.user.getWallet().setQuantity( wallet.getQuantity() - amount);
        TransactionHistory transaction = this.createTransactionHistory(wallet, TransactionType.DEPOSIT);
        this.transactionHistories.add( transaction );
        this.user.getTransactionHistories().add(transaction);

    }
    public double getBalance(){
        return this.wallet.getQuantity();
    }
    public List<TransactionHistory> showTransaction(){
        return this.user.getTransactionHistories();
    }

    private TransactionHistory createTransactionHistory(Wallet wallet, TransactionType type){
        return new TransactionHistory(
            1,
            wallet,
            type,
            new Date(),
            this.user
        );
    }
}

