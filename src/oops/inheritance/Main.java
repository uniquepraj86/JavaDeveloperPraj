package oops.inheritance;

// Base class: Vehicle
class Vehicle {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters and Setters
    // ...

    // Common behavior
    public void start() {
        System.out.println("Starting the " + brand + " " + model);
    }

    // Other common methods
    // ...
}

// Derived class: Car (inherits from Vehicle)
class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

//     Additional behavior specific to Car


    // Other specific methods for Car
    // ...
}
// Derived class: Motorcycle (inherits from Vehicle)
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    // Additional behavior specific to Motorcycle


    // Other specific methods for Motorcycle
    // ...
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.start();   // Common method inherited from Vehicle class

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, false);
        motorcycle.start();   // Common method inherited from Vehicle class
    }

}
