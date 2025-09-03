package hotelapp;

public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking(); 
        HotelBooking booking2 = new HotelBooking("Aditya", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2); 

        booking1.displayDetails();
        booking2.displayDetails();
        booking3.displayDetails();
    }
}
