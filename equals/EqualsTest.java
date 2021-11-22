package equals;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adamas", 20000, 2001, 07, 31);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adamas", 20000, 2001, 07, 31);
        Employee bobby = new Employee("Bobby Bobba", 42000, 2420, 4, 20);

        System.out.println("alice1 == alice2:" + (alice1 == alice2));
        System.out.println("alice1 == alice3:" + (alice1 == alice3));
        System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));
        System.out.println("bobby.toString():" + bobby);
        System.out.println("alice1.hashCode()" + alice1.hashCode());
        System.out.println("alice2.hashCode()" + alice2.hashCode());
        System.out.println("alice3.hashCode()" + alice3.hashCode());

        Manager janos = new Manager("Janos", 80000, 1999, 8, 8);
        Manager fonok = new Manager("Janos", 80000, 1999,8, 8);
        fonok.setBonus(500);

        System.out.println("fonok.toString()" + fonok);
        System.out.println("fonok.hashCode()" + fonok.hashCode());
        System.out.println("janos.hashCode()" + janos.hashCode());
    }
}
