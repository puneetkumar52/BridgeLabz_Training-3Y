package Java_core;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        if (a%5==0){
            System.out.println("Yes the number "+a+ " divisible by 5");
        }
        else{
            System.out.println("No the number "+a+ " divisible by 5");

        }
    }
}
