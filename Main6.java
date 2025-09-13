class Vehicle {
    static double registrationFee = 500.0;   // Static variable

    private String ownerName, vehicleType;
    private final String registrationNumber; // Final variable

    // Constructor using "this"
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "CAR123");
        Vehicle v2 = new Vehicle("Bob", "Bike", "BIKE456");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(750.0);
        v1.displayDetails();
    }
}
