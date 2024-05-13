public abstract class Vehicle {
    public static void main(String[] args) {
        Car bmwX7 = new Car("BMW", "X7", 2022, 57.990f, 5, "V8", 320);

        System.out.println("Gray card :");
        bmwX7.checkGrayCard();
        bmwX7.checkIfIsOn();
        System.out.println("Technical sheet :");
        System.out.println(bmwX7.technicalSheet());
        System.out.println("Price of this Jewel :");
        System.out.println(bmwX7.getPrice());
    }

    private String brand;
    private String model;
    private int releaseYear;
    private float price;

    public Vehicle(String brand, String model, int releaseYear, float price){
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public String getPrice() {
        return "%.13f" + this.price + " $";
    }

    public void checkGrayCard() {
        System.out.println("Brand: " + getBrand() + " Model: " + getModel() + " Release Year: " + getReleaseYear());
    }

}
