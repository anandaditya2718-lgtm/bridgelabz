package personapp;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Aditya", 22);
        Person p2 = new Person(p1); 

        p1.displayDetails();
        p2.displayDetails();
    }
}
