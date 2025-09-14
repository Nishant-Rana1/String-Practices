import java.util.Scanner;
public class Q7_NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        handleException(text);
    }
}