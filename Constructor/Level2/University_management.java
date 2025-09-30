package Level2;

// Base class
class Student {
    public int rollNumber;        // public → accessible everywhere
    protected String name;        // protected → accessible in same package & subclasses
    private double CGPA;          // private → accessible only inside Student class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter for CGPA
    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method using protected 'name'
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student: " + name); // direct access to protected member
        System.out.println("Roll Number: " + rollNumber);     // public access
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());             // private CGPA accessed via getter
    }
}

// Test class
public class University_management{
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.7);
        s1.displayStudentDetails();

        System.out.println("\nUpdating CGPA...");
        s1.setCGPA(9.1);
        s1.displayStudentDetails();

        System.out.println("\n--- Postgraduate Student ---");
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 9.3, "Computer Science");
        pg1.displayPostgraduateDetails();
    }
}

