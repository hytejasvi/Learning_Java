package ExceptionHandling;

public class Main {
    public static void main(String []args) {
        CalculateArea area1 = new CalculateArea();
        CalculateArea area2 = new CalculateArea();
        try {
            System.out.println("area of rectangle R1 : "+area1.area(10,20));
            System.out.println("area of rectangle R2 : "+area2.area(10,-2));
        } catch (NegetiveDimensionException e) {
            System.out.println("Inside catch block");
            e.printStackTrace();//this will print the stack trace of the exception
            //meaning-> this will show where the exception was actually throws and and the trace from which method
            // we have reached to the exception code.
            /*
            in this example the output will be something like:
            l: 10.0 b: 20.0
            area of rectangle R1 : 200.0
            l: 10.0 b: -2.0
            Inside catch block
            dimensions cannot be negetive
                at ExceptionHandling.CalculateArea.rectangleArea(CalculateArea.java:7)
                at ExceptionHandling.CalculateArea.area(CalculateArea.java:12)
                at ExceptionHandling.Main.main(Main.java:9)

             */
        }
    }
}
