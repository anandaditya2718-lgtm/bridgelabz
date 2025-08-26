import java.util.*;

class Q4 {
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

    static int[] findMinMax(String[][] wordLengths) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < Integer.parseInt(wordLengths[minIndex][1])) minIndex = i;
            if (len > Integer.parseInt(wordLengths[maxIndex][1])) maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitCustom(text);
        String[][] wordLengths = getWordLengths(words);
        int[] minMax = findMinMax(wordLengths);
        System.out.println("Shortest: " + wordLengths[minMax[0]][0]);
        System.out.println("Longest: " + wordLengths[minMax[1]][0]);
    }
}