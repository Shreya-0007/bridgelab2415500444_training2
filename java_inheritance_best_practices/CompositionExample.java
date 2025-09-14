// 1. Favor Composition Over Inheritance
class Engine {
    void start() { System.out.println("Engine started."); }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
