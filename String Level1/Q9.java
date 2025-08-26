import java.util.*;

class Q9 {
    static String toUpperCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String builtInUpper = text.toUpperCase();
        String customUpper = toUpperCaseCustom(text);

        boolean isEqual = compareStrings(builtInUpper, customUpper);

        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Are both equal? " + isEqual);
    }
}