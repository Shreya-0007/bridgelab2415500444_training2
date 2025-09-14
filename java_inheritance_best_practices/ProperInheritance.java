// 2. Ensure Proper Use of is-a Relationship
class Animal {
    void eat() { System.out.println("Animal eats"); }
}

class Dog extends Animal { // Dog "is-a" Animal
    void bark() { System.out.println("Dog barks"); }
}

public class ProperInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
