package Object_modelling;

import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void displayEmployee() {
        System.out.println("   Employee ID: " + empId + ", Name: " + name);
    }
}

// Department class (cannot exist without a Company)
class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayDepartment() {
        System.out.println(" Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

// Company class (composition root)
class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    // Simulate deletion (composition cleanup)
    public void closeCompany() {
        System.out.println("Closing company: " + companyName);
        departments.clear(); // all departments & employees wiped out
    }
}

// Main class
public class CompanySystem {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("Tech Solutions Pvt Ltd");

        // Create Departments
        Department hr = new Department("HR");
        Department it = new Department("IT");

        // Add Employees to Departments
        hr.addEmployee(new Employee("Alice", 101));
        hr.addEmployee(new Employee("Bob", 102));

        it.addEmployee(new Employee("Charlie", 201));
        it.addEmployee(new Employee("Diana", 202));

        // Add Departments to Company
        company.addDepartment(hr);
        company.addDepartment(it);

        // Display Details
        company.displayCompanyDetails();

        // Delete Company (composition cleanup)
        company.closeCompany();
        System.out.println("Company and all its departments/employees removed!");
    }
}

