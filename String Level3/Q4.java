import java.util.*;

public class Q4 {
    static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        String[][] res = new String[s.length()][2];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] > 0) {
                res[idx][0] = String.valueOf(c);
                res[idx][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                idx++;
            }
        }
        return Arrays.copyOf(res, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] result = frequency(s);
        for (String[] row : result) System.out.println(row[0] + " -> " + row[1]);
    }
}