package interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Alice Adamas", 8920000);
        staff[1] = new Employee("Bobby Bobba", 42000);
        staff[2] = new Employee("Laisa Ekhanser", 871500000);

        Arrays.sort(staff);

        for (Employee e : staff)
            System.out.println(e.toString());
    }
}
