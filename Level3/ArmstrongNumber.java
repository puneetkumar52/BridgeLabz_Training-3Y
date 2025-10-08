package Java_core.Level3;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;

        int digits = String.valueOf(number).length();


        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += (int)Math.pow(digit, digits);
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}
