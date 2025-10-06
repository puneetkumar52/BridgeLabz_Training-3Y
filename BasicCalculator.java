package Extras;

import java.util.Scanner;

class BasicCalculator {

    // Addition function
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction function
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication function
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division function
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    // Function to display menu and take choice
    public static int getChoice(Scanner sc) {
        System.out.println("\n--- Basic Calculator ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            choice = getChoice(sc);

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        if (!Double.isNaN(result)) {
                            System.out.println("Result: " + result);
                        }
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please enter 1-5.");
            }

        } while (choice != 5);

        System.out.println("Thank you for using the Basic Calculator!");
        sc.close();
    }
}
