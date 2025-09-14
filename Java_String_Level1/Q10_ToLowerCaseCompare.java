import java.util.Scanner;
public class Q10_ToLowerCaseCompare {
    public static String toLowerCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
            result += c;
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String s1 = toLowerCustom(text);
        String s2 = text.toLowerCase();
        System.out.println("Custom lowercase: " + s1);
        System.out.println("Built-in lowercase: " + s2);
        System.out.println("Comparison: " + compareStrings(s1, s2));
    }
}