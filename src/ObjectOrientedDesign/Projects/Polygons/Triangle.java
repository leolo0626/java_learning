package ObjectOrientedDesign.Projects.Polygons;

public class Triangle implements Polygon{
    private double first ;
    private double second ;
    private double third ;

    public Triangle(double a, double b, double c) {
        first = a ;
        second = b;
        third = c;
    }

    public double area () {
        double s = (first + second + third) / 2 ;
        return Math.sqrt(s * (s-first) * (s-second) * (s-third));
    }

    public double perimeter () {
        return first + second + third ;
    }
}
