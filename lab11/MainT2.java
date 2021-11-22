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
    
}

interface Reversable{
    // cant be use to create object
    void reverse();
    // can put attribute here
    // java does not support multiple inheritance
    // interface: a class can implement 2 interfaces
}

interface Printable{
    void print();
}

class ReversablePoint implements Reversable{
    private int x,y;
    private int prev_x, prev_y;
    // reversable return prev_x and prev_y

    public ReversablePoint(int x, int y){
        prev_x = this.x = x;
        prev_y = this.y = y;
    }

    // setters
    public void setX(int x){ prev_x = this.x; this.x = x; }
    public void setY(int y){ prev_y = this.y; this.y = x; }

    // getters
    public int getX() { return x; }
    public int getY() { return y; }

    public void reverse(){
        x = prev_x; y = prev_y;
    }

}

class PrintablePoint implements Printable{
    
    private int x,y;

    public PrintablePoint(int x, int y){
        this.x = x; this.y = y;
    }
    
    public void print(){
        System.out.printf("(x=%df,y=%df)", x, y);
    }

}

class Book implements Printable{
    private String author, title;

    public Book(String a, String t){
        this.author = a; this.title = t;
    }

    public void print(){
        System.out.printf("The book's author is: %s, The title of the book is: %s ", author, title);
    }
}

class PrintableAndReversable implements Printable, Reversable{
    private int x,y,prev_x,prev_y;

    public PrintableAndReversable(int x, int y){
        prev_x = this.x = x;
        prev_y = this.y = y;
    }

    // setters
    public void setX(int x){ prev_x = this.x; this.x = x; }
    public void setY(int y){ prev_y = this.y; this.y = x; }

    // getters
    public int getX() { return x; }
    public int getY() { return y; }

    public void reverse(){
        x = prev_x; y = prev_y;
    }

    public void print(){
        System.out.printf("(x=%d,y=%d)\n",x,y);
    }
}

class MainT2{
    public static void foo (Printable obj) {
        obj.print();
    }

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

        foo(new Book("Harry", "Watermelon"));
        System.out.println();
        foo(new PrintablePoint(234, 900));
        System.out.println();
        foo(p2);
    }
}
//put your name here: 