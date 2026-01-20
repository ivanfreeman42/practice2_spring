package org.example;

public class Bank_account {
    private final String account_number;
    private double balance;
    public Bank_account(String account_number, double initial_balance) {
            this.account_number = account_number;
            if(initial_balance < 0) {
                throw new IllegalArgumentException("initial balance cannot be negative");
            }
            this.balance = initial_balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }else if(amount > balance) {
            throw new IllegalArgumentException("amount cannot be greater than balance");
        }
        balance -= amount;
    }
}