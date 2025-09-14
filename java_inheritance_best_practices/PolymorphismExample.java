// 14. Use Polymorphism Effectively
class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}

class Cat extends Animal {
    @Override
    void sound() { System.out.println("Cat meows"); }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a = new Cat(); // Polymorphism in action
        a.sound();
    }
}
