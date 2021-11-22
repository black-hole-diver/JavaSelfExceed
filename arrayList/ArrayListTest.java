package arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<Employee>();

        staff.add(new Employee("Károly", 7500, 1985, 3, 8));
        staff.add(new Employee("István", 7500, 1987, 8, 2));
        staff.add(new Employee("Ferenc", 7500, 1988, 12, 15));

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println(e.toString());
    }
}
