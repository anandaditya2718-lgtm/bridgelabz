package libraryapp;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 499, true);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 799, false);

        book1.displayDetails();
        book2.displayDetails();

        book1.borrowBook();
        book2.borrowBook();

        book1.displayDetails();
        book2.displayDetails();
    }
}
