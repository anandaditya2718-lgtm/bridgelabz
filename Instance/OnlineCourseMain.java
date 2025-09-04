package courseapp;

public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 15000);
        Course c2 = new Course("Web Development", 6, 25000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
