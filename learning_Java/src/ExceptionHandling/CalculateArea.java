package ExceptionHandling;

public class CalculateArea {
    public double rectangleArea(double l, double b) throws NegetiveDimensionException {
        System.out.println("l: "+l+" b: "+b);
        if (l < 0 || b < 0) {
            throw new NegetiveDimensionException();
        }
        return l * b;
    }
    public double area(double x, double y) throws NegetiveDimensionException {
        return rectangleArea(x,y);
    }
}

