class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (same for all vehicles)
    private static double registrationFee = 5000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

// Testing Vehicle class
public class Vehicle_registration {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        // Display details
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println("\n--- Updating Registration Fee ---\n");

        // Update registration fee
        Vehicle.updateRegistrationFee(7000.0);

        // Display again after update
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
