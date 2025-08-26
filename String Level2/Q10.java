import java.util.*;

public class Q10{
    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 41 + 60);
            }
        }
        return scores;
    }

    static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return stats;
    }

    static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double perc = stats[i][2];
            if (perc >= 90) grades[i] = "A";
            else if (perc >= 80) grades[i] = "B";
            else if (perc >= 70) grades[i] = "C";
            else if (perc >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}