import java.util.*;

class Q3 {
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

    static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitCustom(text);
        String[][] wordLength = getWordLengths(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < wordLength.length; i++) {
            System.out.println(wordLength[i][0] + "\t" + Integer.parseInt(wordLength[i][1]));
        }
    }
}