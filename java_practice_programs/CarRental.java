public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay = 1000;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void display() {
        double totalCost = rentalDays * pricePerDay;
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Raj", "Honda City", 5);
        rental.display();
    }
}
