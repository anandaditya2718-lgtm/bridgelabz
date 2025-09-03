package mobileapp;

public class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 79999);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 69999);
        MobilePhone phone3 = new MobilePhone("OnePlus", "11R", 39999);

        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}
