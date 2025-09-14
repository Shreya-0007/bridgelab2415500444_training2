// 8. Avoid Overloading Alongside Overriding
class Shape {
    void draw() { System.out.println("Drawing shape"); }
}

class Circle extends Shape {
    @Override
    void draw() { System.out.println("Drawing circle"); }

    // Avoid confusing overloads like draw(int size)
}

public class AvoidOverloadingOverriding {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
