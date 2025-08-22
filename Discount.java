package practice;

public class Discount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountprice = 10;

        double discount = (fee * discountprice) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee); 


    }
}
