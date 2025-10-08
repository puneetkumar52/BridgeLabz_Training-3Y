package Java_core;

import java.util.Scanner;

public class largest_among_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a=sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b=sc.nextInt();
        System.out.print("Enter the number 3: ");
        int c=sc.nextInt();
        if (a>b && a>c){
            System.out.print("Yes, the first number the largest\n" +
                    "No the second number the largest\n" +
                    "No the third number the largest\n");
        }
        else if (b>a && b>c){
            System.out.print("No the first number the largest\n" +
                    "Yes, the second number the largest\n" +
                    "No the third number the largest\n");
        }
        else{
            System.out.print("No the first number the largest\n" +
                    "No the second number the largest\n" +
                    "Yes, the third number the largest\n");
            
        }
    }
}
