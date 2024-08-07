package Methods;

public class CalculateAreaWithOverloading {
    public static void main (String[] args) {
        CalculateAreaWithOverloading ar = new CalculateAreaWithOverloading();
        double r = 10;
        double l=10,b=20;
        System.out.println("area of the rectangle is: "+ar.area(l,b));
        System.out.println("area of the circle is: "+ar.area(r));
    }

    private double area(double l, double b) {
        return l * b;
    }

    private double area(double radius) {
        return Math.PI*radius*radius;
    }
}
