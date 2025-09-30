package Oops.Encapsulation_Polymorphism_AbstractClass;

import java.util.ArrayList;
import java.util.List;

// Interface for medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class Patient
abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalHistory; // Encapsulation of sensitive data

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    // Encapsulation: Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Concrete method
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Implement MedicalRecord interface
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + name + ":");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}

// Subclass InPatient
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
}

// Subclass OutPatient
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

// Main class
public class HospitalManagementSystem {
    // Polymorphic method
    public static void processPatients(Patient[] patients) {
        System.out.println("\n--- Patient Billing Details ---");
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill Amount: " + patient.calculateBill());
            patient.viewRecords();
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {
        // Creating patients
        Patient p1 = new InPatient(101, "Ravi Sharma", 45, 5, 2000);
        Patient p2 = new OutPatient(102, "Neha Verma", 30, 500);

        // Adding medical records
        p1.addRecord("Admitted for fever and dehydration");
        p1.addRecord("Prescribed IV fluids and antibiotics");

        p2.addRecord("Consulted for seasonal allergies");
        p2.addRecord("Prescribed antihistamines");

        // Using polymorphism
        Patient[] patients = {p1, p2};
        processPatients(patients);
    }
}

