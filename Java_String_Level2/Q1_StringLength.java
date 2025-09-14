import java.util.Scanner;
public class Q1_StringLength {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Custom length: " + customLength(text));
        System.out.println("Built-in length: " + text.length());
    }
}