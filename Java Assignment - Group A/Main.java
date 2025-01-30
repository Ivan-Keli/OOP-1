// Interface representing general technology behavior
interface Technology {
    void powerOn();  // Method to turn on the device
    void powerOff(); // Method to turn off the device
}

// Abstract class representing a general device
abstract class Device implements Technology {
    String brand; // Common attribute for all devices
    
    Device(String brand) {
        this.brand = brand;
    }
    
    void displayBrand() {
        System.out.println("Device Brand: " + brand);
    }
    
    // Abstract method to be implemented by specific devices
    abstract void specifications();
}

// Concrete class representing a Laptop
class Laptop extends Device {
    Laptop(String brand) {
        super(brand);
    }
    
    @Override
    void specifications() {
        System.out.println(brand + " Laptop: 16GB RAM, 512GB SSD, Intel i7 Processor.");
    }
    
    @Override
    public void powerOn() {
        System.out.println(brand + " Laptop is now powered on.");
    }
    
    @Override
    public void powerOff() {
        System.out.println(brand + " Laptop is shutting down.");
    }
}

// Main class to demonstrate the implementation
public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell");
        myLaptop.displayBrand();
        myLaptop.powerOn();
        myLaptop.specifications();
        myLaptop.powerOff();
    }
}
