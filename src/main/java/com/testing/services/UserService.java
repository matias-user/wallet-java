package com.testing.services;

import com.testing.models.User;
import com.testing.models.Wallet;

public class UserService {
    private User user;
    private Wallet wallet;

    public UserService(User user){
        this.user = user;
        this.wallet = user.getWallet();
    }

    public void deposit(double amount){
        this.user.getWallet().setQuantity(wallet.getQuantity() + amount);
    }
    public void withdraw(double amount){
        this.user.getWallet().setQuantity( wallet.getQuantity() - amount);

    }

    public double getBalance(){
        return this.wallet.getQuantity();
    }
}

