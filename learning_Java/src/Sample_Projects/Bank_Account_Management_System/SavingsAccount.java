package Sample_Projects.Bank_Account_Management_System;

import java.util.HashMap;
import java.util.Map;

public class SavingsAccount extends BankAccount {
    private static int savAccNo = 6706100; // Static variable for account number generation

    // Constructor to initialize a new savings account
    SavingsAccount(String cusName, double balance) throws MinimumDepositeException {
        if (balance < 5000) {
            // Throw an exception if the initial deposit is less than 5000
            throw new MinimumDepositeException();
        }
        super.setAccountNumber(savAccNo); // Set the account number
        super.setAccountHolderName(cusName); // Set the account holder's name
        super.setBalance(balance); // Set the initial balance
        savAccNo++; // Increment the account number for the next account
    }

    // Override the deposit method to include displaying account details after deposit
    @Override
    public void deposit(double amount) throws InvalidTransactionException {
        super.deposit(amount);
        displayAccountDetails(); // Display account details after deposit
    }

    // Override the withdraw method to include displaying account details after withdrawal
    @Override
    public void withdraw(double amount) throws NegetivebalanceException {
        super.withdraw(amount);
        displayAccountDetails(); // Display account details after withdrawal
    }

    // Method to display account details
    public void displayAccountDetails() {
        HashMap<String, Object> details = super.getAccountDetails();
        for (Map.Entry<String, Object> det : details.entrySet()) {
            System.out.println(det.getKey() + ": " + det.getValue());
        }
    }
}
