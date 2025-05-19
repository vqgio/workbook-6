package com.pluralsight;

public class CreditCard implements IValuable {
    String name;
    String accountNumber;
    double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getValue() {
        return 0;
    }
}
