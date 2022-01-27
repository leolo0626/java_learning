package ObjectOrientedDesign.Projects.Polygons;

public class Quadrilateral  implements Polygon{
    protected double first ;
    protected double second ;
    protected double third ;
    protected double forth ;
    public Quadrilateral(double a, double b, double c, double d) {
        first = a ;
        second = b ;
        third = c ;
        forth = d ;
    }

    public double area() {
        return first * second;
    }

    public double perimeter() {
        return first + second + third + forth ;
    }
}
