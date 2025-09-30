package Oops.Encapsulation_Polymorphism_AbstractClass;

// Interface for insurance
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Vehicle class
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Encapsulated insurance details
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Encapsulation (getters and setters)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Insurance policy number not exposed directly
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method to display basic vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate (per day): " + rentalRate);
    }
}

// Car subclass
class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // fixed rate per day
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance [Policy No: " + getInsurancePolicyNumber() + "] - 15% of rental rate";
    }
}

// Bike subclass
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount on bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance [Policy No: " + getInsurancePolicyNumber() + "] - 5% of rental rate";
    }
}

// Truck subclass
class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // extra maintenance charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.20; // 20% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance [Policy No: " + getInsurancePolicyNumber() + "] - 20% of rental rate";
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR123", 2000, "CAR-INS-789");
        Vehicle v2 = new Bike("BIKE456", 500, "BIKE-INS-456");
        Vehicle v3 = new Truck("TRUCK789", 5000, "TRUCK-INS-123");

        Vehicle[] vehicles = { v1, v2, v3 };

        int days = 5;

        // Polymorphism: process all vehicles
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));
            System.out.println(v.getInsuranceDetails());
            System.out.println("Insurance Cost: " + v.calculateInsurance());
            System.out.println("---------------------------------");
        }
    }
}

