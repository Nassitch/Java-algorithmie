public class Car extends Vehicle {

    private int doorNbr;
    private String motor;
    private int maxSpeed;
    private boolean isOn = false;

    public Car(String brand, String model, int releaseYear, float price, int doorNbr, String motor, int maxSpeed) {
        super(brand, model, releaseYear, price);
        this.doorNbr = doorNbr;
        this.motor = motor;
        this.maxSpeed = maxSpeed;
    }

    public boolean startOn() {
        return this.isOn = true;
    }

    public boolean turningOff() {
        return this.isOn = false;
    }

    public void checkIfIsOn() {
        if (this.isOn) {
        System.out.println("On");
        } else {
            System.out.println("Off");
        }
    }

    public String technicalSheet() {
        return doorNbr +  " doors" + ", " + motor + " motor" + ", " + maxSpeed + " km/h";
    }

}
