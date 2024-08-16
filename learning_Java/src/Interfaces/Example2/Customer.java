package Interfaces.Example2;

class Customer implements Member {
    String name;

    Customer(String n) {
        name = n;
    }
    public void callBack() {
        System.out.println("Ok, I will visit: "+name);
    }
}

