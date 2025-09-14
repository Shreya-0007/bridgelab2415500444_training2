// 7. Minimize Public Fields in Superclasses
class Employee {
    private String name;
    protected double salary;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

public class PrivateFieldsExample {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("John");
        e.setSalary(50000);
        System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());
    }
}
