import java.sql.SQLOutput;
import java.util.Scanner;

public class averageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First number ");
        int a=sc.nextInt();
        System.out.print("Enter the Second number ");
        int b=sc.nextInt();
        System.out.print("Enter the Third number ");
        int c=sc.nextInt();
        System.out.println((a+b+c)/3);
    }
}
