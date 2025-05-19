package com.pluralsight;

public class BankAccount implements IValuable {
    String name;
    String accountNumber;
    double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        return;
    }
    public void withdraw(double amount) {
        return;
    }
    public double getValue() {
        return 0;
    }
}
