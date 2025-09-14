// 12. Avoid Overriding Methods Unnecessarily
class Base {
    void display() { System.out.println("Base display"); }
}

class Sub extends Base {
    // No override unless behavior needs to be changed
}

public class AvoidUnnecessaryOverride {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.display();
    }
}
