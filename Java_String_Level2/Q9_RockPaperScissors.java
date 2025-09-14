import java.util.Scanner;
import java.util.Random;
public class Q9_RockPaperScissors {
    public static String computerChoice() {
        String[] choices = {"rock","paper","scissors"};
        return choices[new Random().nextInt(3)];
    }
    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins=0, compWins=0;
        for (int i=0;i<games;i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user,comp);
            if (res==1) userWins++; else if (res==-1) compWins++;
            System.out.println("User: "+user+" Computer: "+comp);
        }
        System.out.println("User Wins: "+userWins+" Computer Wins: "+compWins);
        System.out.println("User Win%: "+(userWins*100.0/games)+" Computer Win%: "+(compWins*100.0/games));
    }
}