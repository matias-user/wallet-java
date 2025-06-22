package com.testing;

import com.testing.models.TransactionHistory;
import com.testing.models.User;
import com.testing.models.Wallet;
import com.testing.services.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Wallet wallet = new Wallet(1,0.0);
        UserService userService = new UserService(new User(1, "Matías","correo@correo.cl",wallet, null)) ;
        userService.deposit(250.0);
        userService.withdraw(100.0);

        System.out.println( userService.getBalance() );

        for (TransactionHistory  transaction : userService.showTransaction()) {
            System.out.println( transaction.getTransactionType().toString() );
        }
    }
}