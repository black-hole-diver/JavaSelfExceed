package lab11;

import java.util.Random;

/*

Exercise 2
Make an interface with the name Shape, that contains the signatures of two methods: getPerimeter(), getArea().

Write the Square, the Rectangle and the Circle classes that’s represents a square, a rectangle and a circle and implements the Shape interface.

*/

interface Shape{
    double getPerimeter();
    double getArea();
}

class Square implements Shape{
    private double side;

    public Square(double s){
        this.side = s;
    }

    public double getPerimeter(){
        return side * 4.0;
    }

    public double getArea(){
        return side * side;
    }
}

class Regtangle implements Shape{
    private double height, base;

    public Regtangle(double h, double b){
        this.height = h; this.base = b;
    }

    public double getPerimeter(){
        return (height + height + base + base);
    }

    public double getArea(){
        return base * height;
    }

}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2.0 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Circle c = new Circle(10.0);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        Square s = new Square(5.0);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());

        Regtangle r = new Regtangle(10.0, 100.0);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
