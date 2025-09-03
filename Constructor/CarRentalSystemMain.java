package carrentalapp;

public class CarRentalMain {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Aditya", "SUV", 5, 2000);
        CarRental rental3 = new CarRental(rental2); // copy constructor

        rental1.displayDetails();
        rental2.displayDetails();
        rental3.displayDetails();
    }
}
