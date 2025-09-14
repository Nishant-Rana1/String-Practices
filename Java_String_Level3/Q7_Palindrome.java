import java.util.Scanner;
public class Q7_Palindrome {
    public static boolean isPalindromeIterative(String text) {
        int i = 0, j = text.length()-1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int i, int j) {
        if (i >= j) return true;
        if (text.charAt(i) != text.charAt(j)) return false;
        return isPalindromeRecursive(text, i+1, j-1);
    }
    public static boolean isPalindromeArray(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];
        for (int i=0;i<arr.length;i++) rev[i]=arr[arr.length-1-i];
        for (int i=0;i<arr.length;i++) if (arr[i]!=rev[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(isPalindromeIterative(text));
        System.out.println(isPalindromeRecursive(text,0,text.length()-1));
        System.out.println(isPalindromeArray(text));
    }
}