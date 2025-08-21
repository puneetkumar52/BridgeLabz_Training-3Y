import java.util.Scanner;
public class Add_two_nos {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a=sc.nextInt();
        System.out.print("Enter the number b: ");
        int b=sc.nextInt();
        System.out.println("Sum of two numbers is " + sum(a, b));
    }
}
