// Lab Session 3: Inheritance, Method Overriding, and super
// Demonstrates Vehicle -> Car -> ElectricCar hierarchy

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int seats;

    Car(String brand, int speed, int seats) {
        super(brand, speed); // Calls Vehicle constructor
        this.seats = seats;
    }

    // Method overriding
    @Override
    void displayInfo() {
        super.displayInfo(); // Calls parent method
        System.out.println("Seats: " + seats);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int speed, int seats, int batteryCapacity) {
        super(brand, speed, seats); // Calls Car constructor
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class lab3Inheritance {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar("Tesla", 250, 5, 100);
        myCar.displayInfo();
    }
}
