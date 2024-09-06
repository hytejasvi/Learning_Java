package Lambda;


/*
Lambda expressions are used for defining anonymous methods
Lambda expressions are defined using interfaces
 */
@FunctionalInterface //this annotation can be used if the interface has exactly 1 abstract method.
interface myLambda {//single parameter example.
    void display();
}
@FunctionalInterface
interface myLambda2 {
    int add(int x, int y, int z);
}
class useLambda {
    public void callMyLambda2(myLambda ml) {
        ml.display();
    }
}
class Demo {
    public void demo1() {
        useLambda ul = new useLambda();
        ul.callMyLambda2(() -> {System.out.println("new print statement");});
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        myLambda m = ()->{System.out.println("Hello ");};
        m.display();
        myLambda2 m2 = (a,b,c)->a+b+c;
        int a = m2.add(10,15, 5);
        System.out.println("returned sum is: "+a);

        Demo d = new Demo();
        d.demo1();
    }
}

