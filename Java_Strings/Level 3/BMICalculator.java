import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
                String.format("%.1f", weight),
                String.format("%.1f", heightCm),
                String.format("%.2f", bmi),
                status
        };
    }


    public static String[][] processAll(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            results[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; 


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            double height = sc.nextDouble();

            data[i][0] = weight;
            data[i][1] = height;
        }

        String[][] results = processAll(data);

        System.out.println("\n=== BMI Report ===");
        displayResults(results);

        sc.close();
    }
}
