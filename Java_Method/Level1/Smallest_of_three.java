package Java_core;

import java.util.Scanner;

public class Smallest_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a=sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b=sc.nextInt();
        System.out.print("Enter the number 3: ");
        int c=sc.nextInt();
        if (a<b && a<c){
            System.out.println("first number is the smallest among three");
        }
        else{
            System.out.println("first number is not the smallest among three");
        }
    }
}
