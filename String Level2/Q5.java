import java.util.*;

class Q5 {
    static String checkType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    static int[] countVowelsConsonants(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            String type = checkType(text.charAt(i));
            if (type.equals("Vowel")) v++;
            if (type.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] result = countVowelsConsonants(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}