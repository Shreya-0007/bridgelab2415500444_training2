class Employee {
    static String companyName = "TechCorp"; // Static variable
    private static int totalEmployees = 0;

    private String name, designation;
    private final int id;  // Final variable

    // Constructor using "this"
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 1, "Manager");
        Employee e2 = new Employee("Bob", 2, "Developer");

        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
