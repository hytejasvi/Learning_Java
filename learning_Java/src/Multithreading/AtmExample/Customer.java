package Multithreading.AtmExample;

public class Customer extends Thread {
    private Atm atm;
    private String name;
    private int withdrawAmount;

    public Customer(Atm atm, String name, int withdrawAmount) {
        this.atm = atm;
        this.name = name;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        atm.checkBalance(name, withdrawAmount);
    }
}