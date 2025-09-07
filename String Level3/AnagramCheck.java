import java.util.*;

public class Q8{
    static String[] initDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx=0;
        for (String s:suits) for (String r:ranks) deck[idx++] = r+" of "+s;
        return deck;
    }

    static void shuffle(String[] deck) {
        for (int i=0;i<deck.length;i++) {
            int rand = i + (int)(Math.random()*(deck.length-i));
            String temp = deck[i]; deck[i]=deck[rand]; deck[rand]=temp;
        }
    }

    static String[][] distribute(String[] deck, int n, int players) {
        if (n%players!=0) return new String[0][0];
        int cardsPerPlayer = n/players;
        String[][] res = new String[players][cardsPerPlayer];
        int idx=0;
        for (int i=0;i<players;i++) for (int j=0;j<cardsPerPlayer;j++) res[i][j]=deck[idx++];
        return res;
    }

    static void display(String[][] players) {
        for (int i=0;i<players.length;i++) {
            System.out.println("Player "+(i+1)+": "+Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        String[] deck = initDeck();
        shuffle(deck);
        String[][] dist = distribute(deck,n,p);
        display(dist);
    }
}