package lab11.polyhedra;

public class Cylinder extends Prism{
    double radius;

    public Cylinder(double radius, double height){
        super(height); this.radius = radius;
    }

    @Override
    public double baseArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return String.format("The cylinder height: %f\nThe cylinder radius: %f", height, radius);
    }
}
