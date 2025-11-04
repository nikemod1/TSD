abstract class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // abstract method to be implemented by subclasses
    public abstract void displayDetails();
}

// Car subclass
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Bike subclass
class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

public class program29 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180, 4);
        Vehicle bike = new Bike("Honda", 120, true);

        System.out.println("=== Car Details ===");
        car.displayDetails();

        System.out.println("\n=== Bike Details ===");
        bike.displayDetails();
    }
}
