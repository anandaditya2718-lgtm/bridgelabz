import java.util.*;

class Q7 {
    static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length()-1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String substringCustom(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
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
        int[] indexes = findTrimIndexes(text);
        String custom = substringCustom(text, indexes[0], indexes[1]);
        String builtIn = text.trim();
        boolean same = compareStrings(custom, builtIn);
        System.out.println("Custom Trim: " + custom);
        System.out.println("Built-in Trim: " + builtIn);
        System.out.println("Are both equal? " + same);
    }
}