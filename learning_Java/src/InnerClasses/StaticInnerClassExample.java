package InnerClasses;


/*Static inner classes are static members of the outer classes
 Object of static inner class can be created out of the outer class(ie: without creating the objet of outer class)*/
public class StaticInnerClassExample {
public static void main (String[] args) {
    outer oc = new outer();
    oc.outerDisplay();
    outer.Inner ic = new outer.Inner();//as inner class is within outer class, we need to write it's name.
    ic.innerDisplay();
}
}
class outer {
    static int x=10;
    int y=20;
    static class Inner {
        void innerDisplay() {
            System.out.println(x);
            //System.out.println(y); //cannot access Y as it is a non static member.
        }
    }
    void outerDisplay() {
        System.out.println(x);
        System.out.println(y);
    }
}
