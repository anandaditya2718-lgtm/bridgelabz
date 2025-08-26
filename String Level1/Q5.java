import java.util.Scanner;

public class Q5 {
    static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException var2) {
            System.out.println("handled");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
    }
}