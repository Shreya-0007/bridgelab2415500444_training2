// 11. Document Inheritance Behavior
// Superclass: Provides a template for message sending.
class Message {
    void send() { System.out.println("Sending a generic message"); }
}

// Subclass: Overrides behavior to send email specifically.
class Email extends Message {
    @Override
    void send() { System.out.println("Sending an email message"); }
}

public class DocumentInheritance {
    public static void main(String[] args) {
        Message m = new Email();
        m.send();
    }
}
