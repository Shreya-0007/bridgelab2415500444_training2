// 16. Test Subclass and Superclass Interactions
class Parent {
    void show() { System.out.println("Parent show"); }
}

class Child extends Parent {
    @Override
    void show() { System.out.println("Child show"); }
}

public class TestSubclassInteraction {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show(); // Test to ensure proper behavior
    }
}
