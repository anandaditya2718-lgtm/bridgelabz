import java.util.*;

class Q6 {
    static String checkType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyzeCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkType(text.charAt(i));
        }
        return result;
    }

    static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = analyzeCharacters(text);
        displayTable(result);
    }
}