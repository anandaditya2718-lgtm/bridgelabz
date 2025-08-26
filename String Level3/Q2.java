import java.util.*;

public class Q2{
    static int length(String s) {
        int i = 0;
        try { while (true) { s.charAt(i); i++; } }
        catch (Exception e) {}
        return i;
    }

    static char[] uniqueChars(String s) {
        int n = length(s);
        char[] res = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) { unique = false; break; }
            }
            if (unique) res[idx++] = c;
        }
        return Arrays.copyOf(res, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] uniq = uniqueChars(s);
        System.out.println(Arrays.toString(uniq));
    }
}