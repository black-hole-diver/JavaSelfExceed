package lab11.polyhedra;

public class Cube extends Prism {
    public Cube(double side){
        super(side);
    }

    @Override
    public double baseArea(){
        return height * height;
    }

    @Override
    public String toString(){
        return String.format("The cube side: %f", height);
    }

}
