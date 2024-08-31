package Multithreading.AtmExample;

public class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }

    public BankException(String message, Throwable cause) {
        super(message, cause);
    }
}

class AmountWithdrawException extends BankException {
    public AmountWithdrawException(String message) {
        super(message);
    }

    public AmountWithdrawException(String message, Throwable cause) {
        super(message, cause);
    }
}
class NegativeBalanceException extends BankException {
    public NegativeBalanceException(String message) {
        super(message);
    }

    public NegativeBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}

class MinimumBalanceException extends BankException {
    public MinimumBalanceException(String message) {
        super(message);
    }

    public MinimumBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}
