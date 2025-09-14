import java.util.Scanner;
public class Q3_WordsAndLengths {
    public static String[] customSplit(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) if (text.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int start = 0, index = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[][] wordLengths(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(customLength(words[i]));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] result = wordLengths(words);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
}