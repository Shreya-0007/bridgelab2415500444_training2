class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Amit", 8.7);
        pg.display();
        System.out.println("CGPA: " + pg.getCgpa());
    }
}
