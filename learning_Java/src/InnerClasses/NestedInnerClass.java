package InnerClasses;

public class NestedInnerClass {
    int x=10;
    class Inner {
        int y = 20;

        void display() {
            System.out.println("Inner display : X: "+x);
            System.out.println("Inner display : Y: "+y);
        }
    }

    void display () {
        Inner in = new Inner();
        in.display();
        System.out.println("Printing in outer class using obj creation y: "+in.y);
        System.out.println("Outer display : X: "+x);
    }

    public static void main (String[] args){
        NestedInnerClass out = new NestedInnerClass();
        System.out.print("calling form main: ");
        out.display();
        //NestedInnerClass.Inner i = new NestedInnerClass().new Inner();
        //accessing the inner class from outside the outer class also
    }
}
