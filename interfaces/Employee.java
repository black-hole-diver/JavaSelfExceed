package interfaces;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        salary = salary * ((100 + byPercent)/100);
    }

    public int compareTo(Employee other)
    {
        return Double.compare(salary, other.salary);
    }

    public String toString(){
        return "name=" + name + ",salary=" + salary;
    }

}
