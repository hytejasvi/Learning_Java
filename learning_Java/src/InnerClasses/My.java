package InnerClasses;

/*the below class is an anonymous class which implements the interface.
 if we have to implement an interface and it's usage is limited, then we make use of anonymous inner classes.*/
abstract class My {
    abstract void displau();
}
class OuterClass {
    public void meth() {
        //the below class is an anonymous class which implements the interface.
        My m = new My() {//creating a object referene of the abstract class My
            //as the abstract class object cannot be created, we have the complete class defination with the method
            //being overidden here.
            @Override
            void displau() {
                System.out.println("displaying from anonymous method");
            }
        };
        m.displau();
    }

    public static void main (String[] args) {
        OuterClass oc = new OuterClass();
        oc.meth();
    }
}
