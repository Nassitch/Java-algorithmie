package poo_and_objects;

public class Person {
    public static void main(String[] args) {
        Person personOne = new Person("John Doe", 38);
        Person personTwo = new Person("Jane Doe", 35);
        Person personThree = new Person("Kaaris", 44);

        System.out.println(personOne.displayDetails());
        System.out.println(personTwo.displayDetails());
        System.out.println(personThree.displayDetails());

        Employee employeeOne = new Employee("Johnny Depp", 60, 26623);
        System.out.println(employeeOne.displayDetails());

        Circle circleArea = new Circle();
        circleArea.computeArea();

        Rectangle rectangleArea = new Rectangle();
        rectangleArea.computeArea();

        BankAccount accountOne = new BankAccount(30, "Johnny Depp", 333221);
        System.out.println("Information of this account : " + accountOne.getBalance() + "$," + " Mr " + accountOne.getHolder() + ", n° " + accountOne.getAccountNumber());
        System.out.println("Current solde : " + accountOne.getBalance() + "$");
        System.out.println("Fail ...");
        accountOne.withdraw(40);
        System.out.println("Success ...");
        accountOne.withdraw(20);


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
