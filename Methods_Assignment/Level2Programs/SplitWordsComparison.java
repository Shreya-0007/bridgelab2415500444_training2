import java.util.*;

public class SplitWordsComparison {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] manualSplit(String str) {
        ArrayList<String> words = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                if (start < i) {
                    words.add(str.substring(start, i));
                }
                start = i + 1;
            }
        }
        if (start < findLength(str)) {
            words.add(str.substring(start));
        }
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Manual Split: " + Arrays.toString(manual));
        System.out.println("Built-in Split: " + Arrays.toString(builtin));
        System.out.println("Are they equal? " + compareArrays(manual, builtin));
    }
}
