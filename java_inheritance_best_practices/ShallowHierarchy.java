// 4. Avoid Deep Inheritance Hierarchies
class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Bike extends Vehicle {
    void ride() { System.out.println("Bike rides"); }
}

public class ShallowHierarchy {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
