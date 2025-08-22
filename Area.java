package practice.Level2;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();

        double areaSqCm = 0.5 * base * height;

        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
