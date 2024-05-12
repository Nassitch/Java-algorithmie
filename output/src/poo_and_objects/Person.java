package poo_and_objects;

public class Person {
    public static void main(String[] args) {
        Person personOne = new Person("John Doe", 38);
        Person personTwo = new Person("Jane Doe", 35);
        Person personThree = new Person("Kaaris", 44);

        System.out.println("Mr " + personOne.name + ", " + personOne.age + " ans.");
        System.out.println("Mme " + personTwo.name + ", " + personTwo.age + " ans.");
        System.out.println("Mr " + personThree.name + ", " + personThree.age + " ans.");
    }

    public String name;
    public int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
