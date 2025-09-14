import java.util.Random;
public class Q8_StudentVoting {
    public static int[] randomAges(int n) {
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) arr[i] = r.nextInt(90);
        return arr;
    }
    public static String[][] votingStatus(int[] ages) {
        String[][] arr = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            arr[i][0] = String.valueOf(ages[i]);
            arr[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] ages = randomAges(10);
        String[][] result = votingStatus(ages);
        for (int i = 0; i < result.length; i++) {
            System.out.println("Age: " + result[i][0] + " Can Vote: " + result[i][1]);
        }
    }
}