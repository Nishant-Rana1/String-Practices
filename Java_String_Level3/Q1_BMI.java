import java.util.Scanner;
public class Q1_BMI {
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][2];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            double w = arr[i][0];
            double h = arr[i][1] / 100.0;
            double bmi = w / (h * h);
            System.out.println("Weight: " + w + " Height: " + arr[i][1] + " BMI: " + bmi + " Status: " + bmiStatus(bmi));
        }
    }
}