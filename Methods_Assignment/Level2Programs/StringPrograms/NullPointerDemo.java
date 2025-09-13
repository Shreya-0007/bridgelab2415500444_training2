public class NullPointerDemo {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try { generateException(); } catch (Exception e) { System.out.println("Generated Exception"); }
        handleException();
    }
}