package courseapp;

public class Course {
    String courseName;
    int duration; // in months
    double fee;
    static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
