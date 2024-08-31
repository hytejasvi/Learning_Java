package Multithreading.AtmExample;

public class Atm {
    private int balance = 50000; // Shared resource

    // Synchronized method to ensure thread safety
    synchronized public void checkBalance(String customerName, int withdrawAmount) {
        System.out.println("Current balance of " + customerName + " is " + balance);
        try {
            withdrawAmount(withdrawAmount);
        } catch (AmountWithdrawException | NegativeBalanceException | MinimumBalanceException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println(customerName + " exits");
        }
    }

    private void withdrawAmount(int withdrawAmount)
            throws NegativeBalanceException, MinimumBalanceException, AmountWithdrawException {
        if (withdrawAmount < 0) {
            throw new NegativeBalanceException("Amount to withdraw must be positive.");
        }
        // Check if balance will drop below minimum
        if (balance - withdrawAmount < 5000) {
            throw new MinimumBalanceException("Balance cannot fall below minimum required balance.");
        }
        if (withdrawAmount > balance) {
            throw new AmountWithdrawException("Insufficient balance.");
        }

        // Update balance
        balance -= withdrawAmount;
        System.out.print("Amount withdrawn is : " + withdrawAmount);
        System.out.println("  Remaining balance is: " + balance);
    }
}
