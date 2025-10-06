package Extras;

import java.util.Scanner;

class GCDLCMCalculator {

    // Function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;  // Base case
        }
        return gcd(b, a % b); // Recursive call
    }

    // Function to calculate LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); 
    }

    // Function to handle input
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        return new int[]{num1, num2};
    }

    // Function to display output
    public static void displayResult(int num1, int num2, int gcdValue, int lcmValue) {
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdValue);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmValue);
    }

    // Main function
    public static void main(String[] args) {
        int[] numbers = getInput();    // Input
        int num1 = numbers[0];
        int num2 = numbers[1];

        int gcdValue = gcd(num1, num2);   // GCD Calculation
        int lcmValue = lcm(num1, num2);   // LCM Calculation

        displayResult(num1, num2, gcdValue, lcmValue);  // Output
    }
}

