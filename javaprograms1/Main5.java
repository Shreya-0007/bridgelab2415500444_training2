class Student {
    static String universityName = "Global University";  // Static variable
    private static int totalStudents = 0;

    private String name, grade;
    private final int rollNumber;  // Final variable

    // Constructor using "this"
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}
