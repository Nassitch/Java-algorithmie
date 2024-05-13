public class Moto extends Vehicle {

    private String motor;
    private int maxSpeed;
    private int wheel;
    private boolean brake;

    public Moto(String brand, String model, int releaseYear, float price, String motor, int maxSpeed, int wheel, boolean brake) {
        super(brand, model, releaseYear, price);
        this.motor = motor;
        this.maxSpeed = maxSpeed;
        this.wheel = wheel;
        this.brake = false;
    }

    public boolean applyTheBrakes() {
        this.brake = true;
        System.out.println(this.brake);
        return this.brake;
    }
}
