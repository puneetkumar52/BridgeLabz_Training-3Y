package practice;

import java.util.Scanner;

public class UserDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student fees :- ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount on student fees :- ");
        double discountprice = sc.nextDouble();


        double discount = (fee * discountprice) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee); 


    }
}
