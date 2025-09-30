package Level2;

// Base class
class Employee {
    public int employeeID;        // public → accessible everywhere
    protected String department;  // protected → accessible in same package & subclasses
    private double salary;        // private → accessible only inside Employee

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass to demonstrate access
class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method using public + protected members
    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);     // public → direct access
        System.out.println("Department: " + department);     // protected → direct access
        System.out.println("Salary: " + getSalary());        // private via getter
        System.out.println("Team Name: " + teamName);
    }
}

// Test class
public class Employee_records {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 45000);
        e1.displayEmployeeDetails();

        System.out.println("\nUpdating Salary...");
        e1.setSalary(50000);
        e1.displayEmployeeDetails();

        System.out.println("\n--- Manager ---");
        Manager m1 = new Manager(201, "IT", 75000, "Backend Team");
        m1.displayManagerDetails();
    }
}

