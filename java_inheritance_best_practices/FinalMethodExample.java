// 5. Mark Superclass Methods final If Needed
class Payment {
    public final void processPayment() {
        System.out.println("Processing payment...");
    }
}

class OnlinePayment extends Payment {
    // Cannot override processPayment() because it's final
}

public class FinalMethodExample {
    public static void main(String[] args) {
        OnlinePayment op = new OnlinePayment();
        op.processPayment();
    }
}
