package Interfaces.Example2;

public class Employee implements Member{
    String name;

    Employee(String n) {
        name = n;
    }
    @Override
    public void callBack() {
        System.out.println("i am an employee and i will come ** "+name);
    }
}
