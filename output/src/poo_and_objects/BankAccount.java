package poo_and_objects;

public class BankAccount {

    private int balance;
    private String holder;
    private float accountNumber;

    public BankAccount(int balance, String holder, float accountNumber) {
        this.balance = balance;
        this.holder = holder;
        this.accountNumber = accountNumber;
    }

    public int withdraw(int sum) {
        if (sum > this.balance) {
            System.out.println("Impossible operation :-(");
        } else {
            System.out.println("You have withdrawn : " + sum);
            this.balance = balance - sum;
        }
        System.out.println("Solde : " + getBalance());
        return getBalance();
    }

    public int getBalance() {
        return this.balance;
    }

    public String getHolder() {
        return this.holder;
    }

    public float getAccountNumber() {
        return this.accountNumber;
    }
}
