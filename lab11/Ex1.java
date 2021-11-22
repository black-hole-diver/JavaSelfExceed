//put your name here: PANTA Wittawin
package lab11;

/*

Modify the solution of task (B),
so that extract the common code from the ReversablePoint,
PrintablePoint and PrintableAndReverseablePoint classes
into a Point superclass (x, y data members, constructor, getters, setters).
The descendant classes should override the superclass’ setter methods,
besides others, they call the superclass’ setter methods.

*/

class Point implements Reversable, Printable{

    public Point(int x, int y){
        prev_x = this.x = x; prev_y = this.y = y;
        
    }
    
    public void print(){
        System.out.printf("(x=%df,y=%df)", x, y);
    }

    // setters
    public void setX(int x){ prev_x = this.x; this.x = x; }

    public void setY(int y){ prev_y = this.y; this.y = x; }
}

interface Reversable{
    void reverse();
}

interface Printable{
    void print();
}

class ReversablePoint extends Point{

    public ReversablePoint(int x, int y){
        super(x,y);
    }

    // setters
    @Override
    public void setX(int x){ super.setX(x); }

    @Override
    public void setY(int y){ super.setY(y); }
}

class PrintablePoint extends Point{

    public PrintablePoint(int x, int y){
        super(x, y);
    }

    @Override
    public void setX(int x){ super.setX(x); }

    @Override
    public void setY(int y){ super.setY(y); }

}

class PrintableAndReversablePoint extends Point{

    public PrintableAndReversablePoint(int x, int y){ super(x,y); }

    @Override
    public void setX(int x){ super.setX(x); }

    @Override
    public void setY(int y){ super.setY(y); }
}

class Ex1{

    public static void main(String[] args) {
        ReversablePoint p1 = new ReversablePoint(5, 15);
        System.out.println("(x="+p1.getX()+",y="+p1.getY()+")");
        p1.reverse();
        System.out.println("(x="+p1.getX()+",y="+p1.getY()+")");

        PrintableAndReversable p2 = new PrintableAndReversable(234, 23423);
        p2.print();
        p2.setX(20);
        p2.print();
        p2.setX(99);
        p2.print();
        p2.reverse();
        p2.print();
    }
}
//put your name here: PANTA Wittawin