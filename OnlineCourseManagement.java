public class Course {
    String courseName;
    int duration, fee;
    static String instituteName = "Tech Institute";

    public Course(String name, int dur, int f) {
        courseName = name;
        duration = dur;
        fee = f;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 20000);
        Course c2 = new Course("Python", 4, 15000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Code Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
