package poo_and_objects;

public class Employee extends Person {

    public int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}
