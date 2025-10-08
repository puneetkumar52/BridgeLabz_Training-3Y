package Java_core.Level2;

import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        // while loop till counter == power
        while (counter < power) {
            result *= number;  // multiply result by number
            counter++;         // increment counter
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
