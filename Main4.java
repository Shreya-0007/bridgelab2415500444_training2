class Product {
    static double discount = 10.0;  // Static variable (shared discount %)

    private String productName;
    private double price;
    private int quantity;
    private final int productID;   // Final variable

    // Constructor using "this"
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 101);
        Product p2 = new Product("Mobile", 20000, 2, 102);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(15.0);  // Update discount
        p1.displayDetails();
    }
}
