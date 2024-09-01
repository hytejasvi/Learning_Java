package Sample_Projects.Bank_Account_Management_System;

import java.util.HashMap;

public class BankAccount {
    // Private fields for account details
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Method to deposit money into the account
    public void deposit(double amount) throws InvalidTransactionException {
        if (amount < 0) {
            // Throw an exception if the deposit amount is negative
            throw new InvalidTransactionException();
        }
        balance = balance + amount; // Add the amount to the balance
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws NegetivebalanceException {
        if (amount > balance) {
            // Throw an exception if the withdrawal amount exceeds the balance
            throw new NegetivebalanceException();
        }
        balance = balance - amount; // Subtract the amount from the balance
    }

    // Method to check the current balance
    public double checkBalance() {
        return balance;
    }

    // Method to get account details as a HashMap
    public HashMap<String, Object> getAccountDetails() {
        HashMap<String, Object> accDetails = new HashMap<>();
        accDetails.put("AccountNumber: ", getAccountNumber());
        accDetails.put("AccountHolderName: ", getAccountHolderName());
        accDetails.put("Current Balance: ", getBalance());
        return accDetails;
    }

    // Getters and setters for the private fields
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
