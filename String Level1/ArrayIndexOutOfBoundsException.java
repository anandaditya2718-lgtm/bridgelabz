import java.util.*;

class Q8 {
    static void generateException(String[] names, int index) {
        System.out.println(names[index]);
    }

    static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Ram", "Shyam", "Mohan"};
        int index = sc.nextInt();

        
        handleException(names, index);
    }
}