import java.util.*;

public class Q1 {
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            for(int i = 0; i < s1.length(); ++i) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean result1 = compareUsingCharAt(str1, str2);
        boolean result2 = str1.equals(str2);
        System.out.println(result1);
        System.out.println(result2);
    }
}