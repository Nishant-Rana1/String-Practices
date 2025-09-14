import java.util.*;
public class Q10_DeckOfCards {
    public static String[] initDeck() {
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[suits.length*ranks.length];
        int idx=0;
        for(String s:suits) for(String r:ranks) deck[idx++]=r+" of "+s;
        return deck;
    }
    public static void shuffle(String[] deck) {
        for(int i=0;i<deck.length;i++){
            int r=i+(int)(Math.random()*(deck.length-i));
            String t=deck[i]; deck[i]=deck[r]; deck[r]=t;
        }
    }
    public static void distribute(String[] deck,int n,int x){
        if(n%x!=0){System.out.println("Cannot distribute equally");return;}
        int idx=0;
        for(int i=0;i<x;i++){
            System.out.print("Player "+(i+1)+": ");
            for(int j=0;j<n/x;j++) System.out.print(deck[idx++]+" , ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        String[] deck=initDeck();
        shuffle(deck);
        distribute(deck,n,x);
    }
}