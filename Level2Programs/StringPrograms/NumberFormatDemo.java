import java.util.Scanner;
public class NumberFormatDemo {
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }
    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
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