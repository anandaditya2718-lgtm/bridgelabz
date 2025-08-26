import java.util.*;

public class Q1 {
    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    static String[][] calculateBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double h = hw[i][1] / 100.0;
            double bmi = hw[i][0] / (h * h);
            result[i][0] = String.valueOf(hw[i][0]);
            result[i][1] = String.valueOf(hw[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (String[] row : data) {
            System.out.println(String.join("\t", row));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            hw[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMI(hw);
        display(result);
    }
}