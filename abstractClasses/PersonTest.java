package abstractClasses;

public class PersonTest{
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry", 5000, 1890, 02, 23);
        people[1] = new Students("MJ", "CS");

        for (Person i : people)
            System.out.println(i.getName() + ".\n" + i.getDescription() + "\n");

        
    }
}
