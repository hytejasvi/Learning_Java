package Interfaces.Example2;

class ApplicationClass {
    public static void main(String[] args) {
        Store s = new Store();
        //Member m = null;
        Member.meth3();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        Employee e1 = new Employee("Tejas");
        Employee e2 = new Employee("Karuna");

        s.register(c1);
        s.register(e1);
        s.register(c2);
        s.register(e2);
        System.out.println("s.mem.length: "+s.mem.length);
        System.out.println("s.count: "+s.count);

        s.inviteSale();
    }
}
