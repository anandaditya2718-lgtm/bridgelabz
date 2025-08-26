public class Q4 {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException var1) {
            System.out.println("handled");
        }

    }

    public static void main(String[] args) {
        handleException();
    }
}