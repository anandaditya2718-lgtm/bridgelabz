package bookapp;

public class BookMain {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book paramBook = new Book("The Alchemist", "Paulo Coelho", 499);

        defaultBook.displayDetails();
        paramBook.displayDetails();
    }
}
