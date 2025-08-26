import java.util.*;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        int[] service = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i+1));
            double s = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i+1));
            int y = sc.nextInt();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Enter again.");
                i--; 
                continue;
            }
            salary[i] = s;
            service[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (service[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Salary Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i+1) + " | Old Salary: " + salary[i] +
                               " | Bonus: " + bonus[i] +
                               " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}