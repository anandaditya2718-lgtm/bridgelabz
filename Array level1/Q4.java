import java.util.*;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        String numStr = String.valueOf(num);
        int n = numStr.length();
        char[] digits = numStr.toCharArray();
        char[] reverse = new char[n];

        for (int i = 0; i < n; i++) {
            reverse[i] = digits[n - 1 - i];
        }

        System.out.print("Reversed number: ");
        for (char c : reverse) System.out.print(c);
    }
}