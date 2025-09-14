import java.util.Random;
public class Q10_StudentGrades {
    public static int[][] randomScores(int n) {
        Random r = new Random();
        int[][] scores = new int[n][3];
        for (int i=0;i<n;i++) for (int j=0;j<3;j++) scores[i][j]=r.nextInt(41)+60;
        return scores;
    }
    public static double[][] computeResults(int[][] scores) {
        double[][] res = new double[scores.length][4];
        for (int i=0;i<scores.length;i++) {
            int total = scores[i][0]+scores[i][1]+scores[i][2];
            double avg = total/3.0;
            double perc = Math.round((total/3.0)*100.0)/100.0;
            res[i][0]=total; res[i][1]=avg; res[i][2]=perc;
        }
        return res;
    }
    public static String grade(double perc) {
        if (perc>=90) return "A";
        if (perc>=80) return "B";
        if (perc>=70) return "C";
        if (perc>=60) return "D";
        return "F";
    }
    public static void main(String[] args) {
        int[][] scores = randomScores(5);
        double[][] results = computeResults(scores);
        for (int i=0;i<scores.length;i++) {
            System.out.print("Scores: ");
            for (int j=0;j<3;j++) System.out.print(scores[i][j]+" ");
            System.out.print("Total: "+results[i][0]+" Avg: "+results[i][1]+" %: "+results[i][2]);
            System.out.println(" Grade: "+grade(results[i][2]));
        }
    }
}