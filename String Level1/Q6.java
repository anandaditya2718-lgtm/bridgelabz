import java.util.Scanner;

public class Q6 {
    static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException var2) {
            System.out.println("handled");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
    }
}