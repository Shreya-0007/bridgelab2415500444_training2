import java.util.Scanner;

public class UniqueCharacters {
    public static int stringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static char[] findUniqueChars(String text) {
        int len = stringLength(text);
        char[] result = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[uniqueCount++] = c;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = result[i];
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] unique = findUniqueChars(input);
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
        sc.close();
    }
}
