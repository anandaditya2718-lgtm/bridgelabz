import java.util.Scanner;

public class Q2 {
    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";

        for(int i = start; i < end; ++i) {
            result = result + text.charAt(i);
        }

        return result;
    }

    static boolean compareUsingCharAt(String s1, String s2) {
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
        String p = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String sub1 = substringUsingCharAt(p, a, b);
        String sub2 = p.substring(a, b);
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(compareUsingCharAt(sub1, sub2));
    }
}