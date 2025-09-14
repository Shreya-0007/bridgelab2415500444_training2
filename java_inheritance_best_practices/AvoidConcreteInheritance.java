// 17. Avoid Inheriting from Concrete Classes
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing rectangle"); }
}

public class AvoidConcreteInheritance {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
    }
}
