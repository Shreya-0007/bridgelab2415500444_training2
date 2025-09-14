// 10. Use Interfaces for Multiple Inheritance
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionPrinter implements Printable, Scannable {
    public void print() { System.out.println("Printing..."); }
    public void scan() { System.out.println("Scanning..."); }
}

public class InterfaceExample {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
    }
}
