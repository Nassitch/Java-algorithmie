package poo_and_objects;

public class Employee extends Person {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Johnny Depp", 60, 26623);

        System.out.println(employeeOne.displayDetails());
    }

    public int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}
