package poo_and_objects;

public class Person {
    public static void main(String[] args) {
        Person personOne = new Person("John Doe", 38);
        Person personTwo = new Person("Jane Doe", 35);
        Person personThree = new Person("Kaaris", 44);

        System.out.println(personOne.displayDetails());
    }

    public String name;
    public int age;
    private String pseudo;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String displayDetails() {
        return this.name + ", " + this.age + " years.";
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
