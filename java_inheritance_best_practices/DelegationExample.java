// 18. Consider Using Delegation for Special Cases
class Printer {
    void printDocument() { System.out.println("Printing document"); }
}

class Office {
    private Printer printer = new Printer();

    void performPrint() {
        printer.printDocument(); // Delegation
    }

    public static void main(String[] args) {
        Office office = new Office();
        office.performPrint();
    }
}
