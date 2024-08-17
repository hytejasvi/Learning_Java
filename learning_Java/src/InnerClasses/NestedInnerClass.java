package InnerClasses;

class Outer {
    int x = 10;

    class Inner {
        int y = 20;

        void innerDisplay() {
            System.out.println("Inner display : X: " + x);
            System.out.println("Inner display : Y: " + y);
        }
    }

    void outerDisplay() {
        Inner in = new Inner();
        in.innerDisplay();
        System.out.println("Printing in outer class using obj creation y: " + in.y);
        System.out.println("Outer display : X: " + x);
    }
}

    public class NestedInnerClass {
        public static void main(String[] args) {
            Outer o = new Outer();//creating object of the outer class
            o.outerDisplay(); //accessing methods of outer class
            Outer.Inner inner = new Outer().new Inner();
            //creating object of inner class --> first we have to create of outer class then the inner class
            inner.innerDisplay();
            //accessing the inner class from outside the outer class also
        }
    }
