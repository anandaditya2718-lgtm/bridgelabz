import java.util.*;

class Q7{
    static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println( number);
    }

    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        
        handleException(input);
    }
}