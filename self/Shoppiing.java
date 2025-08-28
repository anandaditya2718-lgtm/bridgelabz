import java.util.Scanner;
    public class Shooping {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean moreCustomers = true;
            while (moreCustomers) {
                int total = 0;
                int choice, qty;
                int n;

                System.out.println("Welcome to Online Shopping");
                System.out.println("Product Menu:");
                System.out.println("1. Laptop - Rs.40000");
                System.out.println("2. Smartphone - Rs.20000");
                System.out.println("3. Headphones - Rs.2000");
                System.out.println("4. Smartwatch - Rs.5000");
                System.out.println("5. Bag - Rs.1000");


                do {
                    System.out.print("\nEnter number of products you want to add: ");
                    n = sc.nextInt();
                } while (n < 1);


                for (int i = 1; i <= n; i++) {
                    System.out.print("Enter product choice (1-5): ");
                    choice = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();

                    switch (choice) {
                        case 1:
                            total += 40000 * qty;
                            break;
                        case 2:
                            total += 20000 * qty;
                            break;
                        case 3:
                            total += 2000 * qty;
                            break;
                        case 4:
                            total += 5000 * qty;
                            break;
                        case 5:
                            total += 1000 * qty;
                            break;
                        default:
                            System.out.println("Invalid product choice!");
                    }
                }


                if (total > 5000) {
                    int discount = total * 10 / 100;  // 10% discount
                    total -= discount;
                    System.out.println("Discount applied: Rs." + discount);
                }

                System.out.println("Final Bill Amount: Rs." + total);


                System.out.print("\nNext customer? (yes=1 / no=0): ");
                int ans = sc.nextInt();
                if (ans == 0) {
                    moreCustomers = false;
                }
            }

        }
    }


