import java.util.Scanner;
public class IllegalArgumentDemo {
    static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }
    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        try { generateException(text); } catch (Exception e) { System.out.println("Generated Exception"); }
        handleException(text);
        sc.close();
    }
}