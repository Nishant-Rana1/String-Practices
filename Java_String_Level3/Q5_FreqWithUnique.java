import java.util.Scanner;
public class Q5_FreqWithUnique {
    public static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) if (text.charAt(j) == c) unique = false;
            if (unique) temp[idx++] = c;
        }
        char[] res = new char[idx];
        for (int i = 0; i < idx; i++) res[i] = temp[i];
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        char[] uniq = uniqueChars(text);
        for (char c : uniq) System.out.println(c + " " + freq[c]);
    }
}