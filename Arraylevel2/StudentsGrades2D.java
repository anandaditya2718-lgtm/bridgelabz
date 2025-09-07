import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] studentData = new double[number][4]; // 0: Physics, 1: Chemistry, 2: Maths, 3: Percentage
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0) System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
                    else if (j == 1) System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
                    else System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");

                    double mark = sc.nextDouble();
                    if (mark >= 0) {
                        studentData[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Marks must be positive. Please enter again.");
                    }
                }
            }

            double totalMarks = studentData[i][0] + studentData[i][1] + studentData[i][2];
            studentData[i][3] = (totalMarks / 300.0) * 100;

            double percentage = studentData[i][3];
            if (percentage >= 90) grades[i] = 'A';
            else if (percentage >= 75) grades[i] = 'B';
            else if (percentage >= 50) grades[i] = 'C';
            else grades[i] = 'F';
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.0f\t%.0f\t\t%.0f\t%.2f\t\t%c%n", 
                studentData[i][0], studentData[i][1], studentData[i][2], studentData[i][3], grades[i]);
        }
    }
}
