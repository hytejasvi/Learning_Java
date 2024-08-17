package InnerClasses;

public class LocalInnerClassExample {
    public static void main (String[] args) {
        outerClass oc = new outerClass();
        oc.display();
    }
}
class outerClass {
    public void display() {
        class Inner {
            public void innerDispla() {
                System.out.println("Inner display");
            }
        }
        new Inner().innerDispla(); //new way of creating inner class object --> anonymas object
        Inner i = new Inner();
        i.innerDispla();
    }
}
