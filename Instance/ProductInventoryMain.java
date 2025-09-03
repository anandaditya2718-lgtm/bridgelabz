package productapp;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 30000);
        Product p3 = new Product("Headphones", 2000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}
