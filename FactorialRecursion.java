package Extras;

import java.util.Scanner;

class FactorialRecursion {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        }
        return n * factorial(n - 1);  // Recursive call
    }

    // Function to handle input
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Function to display output
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    // Main function
    public static void main(String[] args) {
        int number = getInput();               // Input
        long result = factorial(number);       // Calculation
        displayResult(number, result);         // Output
    }
}

