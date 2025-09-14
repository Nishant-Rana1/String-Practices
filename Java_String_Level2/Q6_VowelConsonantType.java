import java.util.Scanner;
public class Q6_VowelConsonantType {
    public static String typeChar(char c) {
        c = Character.toLowerCase(c);
        if (!Character.isLetter(c)) return "Not a Letter";
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
        return "Consonant";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch + " " + typeChar(ch));
        }
    }
}