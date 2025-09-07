import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentage = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0) System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
                    else if (j == 1) System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
                    else System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
                    int mark = sc.nextInt();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Marks must be positive. Please enter again.");
                    }
                }
            }

            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (totalMarks / 300.0) * 100;

            if (percentage[i] >= 90) grades[i] = 'A';
            else if (percentage[i] >= 75) grades[i] = 'B';
            else if (percentage[i] >= 50) grades[i] = 'C';
            else grades[i] = 'F';
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n", 
                marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i]);
        }
    }
}
