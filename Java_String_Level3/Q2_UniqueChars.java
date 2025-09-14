import java.util.Scanner;
public class Q2_UniqueChars {
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
        char[] res = uniqueChars(text);
        for (char c : res) System.out.print(c + " ");
    }
}