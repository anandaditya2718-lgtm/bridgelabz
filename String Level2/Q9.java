import java.util.*;

public class Q9 {
    static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }

    static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "user";
        return "computer";
    }

    static String[][] getStats(List<String[]> results, int userWins, int compWins) {
        int total = results.size();
        double userPct = (userWins * 100.0) / total;
        double compPct = (compWins * 100.0) / total;
        String[][] table = new String[results.size() + 2][4];
        table[0] = new String[]{"Game", "User", "Computer", "Winner"};
        for (int i = 0; i < results.size(); i++) {
            table[i + 1] = results.get(i);
        }
        table[results.size() + 1] = new String[]{"-", "User Wins: " + userWins + " (" + String.format("%.2f", userPct) + "%)", "Comp Wins: " + compWins + " (" + String.format("%.2f", compPct) + "%)", "-"};
        return table;
    }

    static void displayTable(String[][] data) {
        for (String[] row : data) {
            for (String col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String[]> results = new ArrayList<>();
        int userWins = 0, compWins = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
            results.add(new String[]{String.valueOf(i), user, comp, winner});
        }
        String[][] table = getStats(results, userWins, compWins);
        displayTable(table);
    }
}