// 13. Be Cautious with Constructors
class SuperClass {
    SuperClass() { System.out.println("SuperClass constructor"); }
}

class SubClass extends SuperClass {
    SubClass() {
        super(); // Explicitly call superclass constructor
        System.out.println("SubClass constructor");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        new SubClass();
    }
}
