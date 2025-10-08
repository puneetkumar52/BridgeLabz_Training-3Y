package Java_core;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer");
        }
    }
}
