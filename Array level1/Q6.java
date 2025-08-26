import java.util.*;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of Physics, Chemistry, Maths for student " + (i+1) + ":");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks, enter again.");
                    j--;
                }
            }
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " | Physics: " + marks[i][0] +
                               ", Chemistry: " + marks[i][1] +
                               ", Maths: " + marks[i][2] +
                               " | %: " + percent[i] +
                               " | Grade: " + grade[i]);
        }
    }
}