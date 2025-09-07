import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int minAgeIndex = 0;
        double maxHeight = heights[0];
        int maxHeightIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxHeightIndex = i;
            }
        }

        System.out.println("The youngest friend is " + names[minAgeIndex] + " with age " + ages[minAgeIndex]);
        System.out.println("The tallest friend is " + names[maxHeightIndex] + " with height " + heights[maxHeightIndex]);
    }
}
