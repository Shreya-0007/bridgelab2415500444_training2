import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start+1, end-1);
    }

    public static boolean isPalindromeByReverse(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = text.charAt(original.length-1-i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("Iterative Palindrome Check: " + isPalindromeIterative(input));
        System.out.println("Recursive Palindrome Check: " + isPalindromeRecursive(input, 0, input.length()-1));
        System.out.println("Reverse Array Palindrome Check: " + isPalindromeByReverse(input));

        sc.close();
    }
}
