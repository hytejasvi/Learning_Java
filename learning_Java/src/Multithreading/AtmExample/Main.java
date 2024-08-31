package Multithreading.AtmExample;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();
        Customer c1 = new Customer(atm, "customer1", -123);
        Customer c2 = new Customer(atm, "customer2", 25000);
        Customer c3 = new Customer(atm, "customer3", 0);
        Customer c4 = new Customer(atm, "customer4", 30000);
        Customer c5 = new Customer(atm, "customer5", 100000);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
