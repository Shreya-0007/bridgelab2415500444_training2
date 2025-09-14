public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);
        v1.displayVehicleDetails();
    }
}
