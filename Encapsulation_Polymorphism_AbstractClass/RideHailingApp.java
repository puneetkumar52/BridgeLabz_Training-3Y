package Oops.Encapsulation_Polymorphism_AbstractClass;

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Encapsulation - Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Concrete method
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Implementing GPS interface
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass Car
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        // Car adds 50 fixed charge
        return (getRatePerKm() * distance) + 50;
    }
}

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        // Bike cheaper, no extra charges
        return getRatePerKm() * distance;
    }
}

// Subclass Auto
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        // Auto has minimum fare of 30
        double fare = getRatePerKm() * distance;
        return fare < 30 ? 30 : fare;
    }
}

// Main class
public class RideHailingApp {
    // Polymorphic method to calculate fares
    public static void calculateRideFares(Vehicle[] vehicles, double distance) {
        System.out.println("\n--- Ride Fare Details ---");
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Current Location: " + v.getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("CAR101", "Rajesh Kumar", 15, "MG Road");
        Vehicle bike = new Bike("BIKE202", "Ankit Verma", 8, "Brigade Road");
        Vehicle auto = new Auto("AUTO303", "Ramesh Singh", 10, "Koramangala");

        // Update GPS location
        car.updateLocation("Indiranagar");
        bike.updateLocation("Whitefield");

        // Process rides polymorphically
        Vehicle[] rides = {car, bike, auto};
        calculateRideFares(rides, 12.5); // distance = 12.5 km
    }
}

