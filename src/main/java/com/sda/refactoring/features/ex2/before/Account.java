package com.sda.refactoring.features.ex2.before;

public class Account {
    
    private AccountType accountType;
    
    private double interestRate;
    
    private double calculateInterest(double principle, int days) {
        return interestRate * principle * days / 365;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
