class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int year, String fuelType) {
        super(brand, year);  
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year, "Electric");   
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }
}

public class LabSession3 {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar("Tesla", 2023, 75);
        e1.displayInfo();
    }
}
