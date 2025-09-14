import java.util.Scanner;
public class Q7_TrimSpaces {
    public static String customTrim(String text) {
        int start = 0, end = text.length()-1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        String res = "";
        for (int i = start; i <= end; i++) res += text.charAt(i);
        return res;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String s1 = customTrim(text);
        String s2 = text.trim();
        System.out.println("Custom trim: " + s1);
        System.out.println("Built-in trim: " + s2);
        System.out.println("Comparison: " + compareStrings(s1, s2));
    }
}