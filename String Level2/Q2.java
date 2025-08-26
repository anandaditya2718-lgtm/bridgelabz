import java.util.*;

class Q2 {
    static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static String[] splitCustom(String text) {
        int n = getLength(text);
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) {
                    list.add(word);
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.equals("")) list.add(word);
        return list.toArray(new String[0]);
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] custom = splitCustom(text);
        String[] builtIn = text.split(" ");
        boolean same = compareArrays(custom, builtIn);
        System.out.println("Custom Split: " + Arrays.toString(custom));
        System.out.println("Built-in Split: " + Arrays.toString(builtIn));
        System.out.println("Are both equal? " + same);
    }
}