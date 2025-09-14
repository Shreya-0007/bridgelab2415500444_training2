// 3. Follow Liskov Substitution Principle
class Bird {
    void fly() { System.out.println("Bird flies"); }
}

class Sparrow extends Bird {
    @Override
    void fly() { System.out.println("Sparrow flies gracefully"); }
}

public class LiskovSubstitution {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly(); // Works as expected
    }
}
