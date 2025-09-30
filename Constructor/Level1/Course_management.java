class Course {
    // Instance variables
    private String courseName;
    private int duration; // in months
    private double fee;

    // Class variable
    private static String instituteName = "ABC Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

// Testing Course class
public class Course_management {
    public static void main(String[] args) {
        // Create some courses
        Course c1 = new Course("Data Science", 6, 30000);
        Course c2 = new Course("Web Development", 4, 20000);

        // Display course details
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        System.out.println("\n--- Updating Institute Name ---\n");
        // Update institute name using class method
        Course.updateInstituteName("XYZ Academy");

        // Display again after update
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
