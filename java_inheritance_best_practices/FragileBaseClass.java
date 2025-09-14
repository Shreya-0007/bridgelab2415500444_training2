// 15. Beware of Fragile Base Class Problem
class Base {
    void process() { System.out.println("Base processing"); }
}

class Derived extends Base {
    @Override
    void process() {
        // Change carefully as it affects all subclasses
        System.out.println("Derived processing");
    }
}

public class FragileBaseClass {
    public static void main(String[] args) {
        Base b = new Derived();
        b.process();
    }
}
