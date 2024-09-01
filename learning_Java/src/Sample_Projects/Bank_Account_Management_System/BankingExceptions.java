package Sample_Projects.Bank_Account_Management_System;

public class BankingExceptions extends Exception {
    BankingExceptions(String message) {
        super(message);
    }
    BankingExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
class MinimumDepositeException extends BankingExceptions {
    MinimumDepositeException() {
        super("Deposited amount is less than the required amount to open an account");
    }
}
class NegetivebalanceException extends BankingExceptions {
    NegetivebalanceException() {
        super("Withdraw amoutn entered is more than the existing balance");
    }
}
class InvalidTransactionException extends BankingExceptions {
    InvalidTransactionException() {
        super("invalid transactions");
    }
}
