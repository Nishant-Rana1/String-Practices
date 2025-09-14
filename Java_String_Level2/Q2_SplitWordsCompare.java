import java.util.Scanner;
public class Q2_SplitWordsCompare {
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
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] arr1 = customSplit(text);
        String[] arr2 = text.split(" ");
        System.out.println("Comparison: " + compareArrays(arr1, arr2));
    }
}