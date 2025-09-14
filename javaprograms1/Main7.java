class Patient {
    static String hospitalName = "City Hospital";   // Static variable
    private static int totalPatients = 0;

    private String name, ailment;
    private int age;
    private final int patientID;  // Final variable

    // Constructor using "this"
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, "Fever", 1001);
        Patient p2 = new Patient("Bob", 45, "Flu", 1002);

        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}
