import java.util.*;

public class WordsWithLengths {
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

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordsWithLength(words);

        System.out.println("Word	Length");
        for (String[] row : table) {
            System.out.println(row[0] + "	" + Integer.parseInt(row[1]));
        }
    }
}
