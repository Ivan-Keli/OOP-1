// Interface: Defines a contract for all vehicles
interface Vehicle {
    void start(); // Abstract method to be implemented by all vehicles
    void stop();
}

// Abstract Class: Provides common functionality but cannot be instantiated
abstract class Car implements Vehicle {
    String brand;
    
    Car(String brand) {
        this.brand = brand;
    }
    
    void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }
    
    // Abstract method (to be implemented by subclasses)
    abstract void accelerate();
}

// Concrete Class: Fully implemented class extending an abstract class
class Sedan extends Car {
    Sedan(String brand) {
        super(brand);
    }
    
    // Implementing abstract method from Car
    @Override
    void accelerate() {
        System.out.println(brand + " Sedan is accelerating.");
    }
    
    // Implementing methods from Vehicle interface
    @Override
    public void start() {
        System.out.println(brand + " Sedan is starting.");
    }
    
    @Override
    public void stop() {
        System.out.println(brand + " Sedan has stopped.");
    }
}

// Testing the implementation
public class Main {
    public static void main(String[] args) {
        Sedan myCar = new Sedan("Toyota");
        myCar.displayBrand();
        myCar.start();
        myCar.accelerate();
        myCar.stop();
    }
}
