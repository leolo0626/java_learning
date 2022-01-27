package ObjectOrientedDesign.Projects.Polygons;

public class Parallelogram extends Quadrilateral{
    private double h ;
    public Parallelogram (double base, double adjSide, double height) {
        super(base, adjSide, base, adjSide);
        h = height;
    }

    public double area(){
        return h * this.first ;
    }
}
