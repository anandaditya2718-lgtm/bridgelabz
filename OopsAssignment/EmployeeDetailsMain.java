package employeeapp;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aditya", 101, 50000);
        Employee emp2 = new Employee("Rahul", 102, 60000);
        Employee emp3 = new Employee("Sneha", 103, 55000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
