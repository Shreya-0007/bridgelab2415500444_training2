class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void display() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager(101, "IT", 90000);
        m.display();
        System.out.println("Salary: " + m.getSalary());
    }
}
