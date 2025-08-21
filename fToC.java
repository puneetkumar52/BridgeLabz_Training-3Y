import java.util.Scanner;
public class fToC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperatue in Celsius: ");
        int c=sc.nextInt();
        int f=(c*9/5)+32;
        System.out.println("Temperature in Fahrenheit is "+ f);

    }
}
