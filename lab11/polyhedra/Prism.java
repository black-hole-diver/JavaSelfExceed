package lab11.polyhedra;

public abstract class Prism {
    double height;

    public Prism(double h){
        this.height = h;
    }

    // this is an abstract method
    public abstract double baseArea();

    public double volume(){
        return height * baseArea;
    }
}
