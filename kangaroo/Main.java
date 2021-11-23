import javax.crypto.KeyAgreementSpi;

/*

Create a class Kangaroo representing kangaroos.
This class should have two fields: one represents the name (String)
and the other the age (int) of the animal.

The constructor of the class takes two parameters, corresponding to the two fields.
The class should contain a method display(String), which takes the name of a country as parameter,
and does the following: it prints the name of the kangaroo, as well as the name of the country;
then it increases the age of the kangaroo by one, and prints the new age.
*/

class Kangaroo{
    private String name;
    private int age;

    public Kangaroo(String name, int age){
        this.name = name; this.age = age;
    }

    public String toString(String country){
        String point = ".";
        StringBuilder kang = new StringBuilder();
        kang.append("The name of this kangaroo is "); kang.append(name); kang.append(point);
        kang.append("\nThe age of this kangaroo is "); kang.append(age + 1); kang.append(point);
        kang.append("\nIt's country is "); kang.append(country); kang.append(point);
        return kang.toString();
    }

    public void display(String country){
        System.out.println(this.toString(country));
    }
}

class Main{
    public static void main(String[] args) {
        Kangaroo Jack = new Kangaroo("Jack", 4);

        Jack.display("Australia, Canberra");
    }
}