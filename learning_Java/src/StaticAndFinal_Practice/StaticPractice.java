package StaticAndFinal_Practice;


class Test {
    static int x=10;
    int y=20;

    void show () { //non static methods can access both static and non static members.
        System.out.println(x +" "+y);
        System.out.println();
    }
    static void display() {
        System.out.println(x);
        //System.out.println(y); non static members cannot be accessed from static methods.
    }
}
public class StaticPractice {
    public static void main (String[] args) {
        Test t = new Test();
        t.show();
        t.x = 50;
        t.y = 100;

        Test t2 = new Test();
        t2.show();
        Test.display();// we can access the static methods of Test class via the class and no object is needed
        /* above we see that when we change the values via object t, the class level member is changed to 50 and as this
        is a class level variable, whwn we print for t2, we see the new value, but the value of y is not changed
        in t2 object as this is not a static variable*/
    }
}
