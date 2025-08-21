import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Distance in Km ");
        int a=sc.nextInt();
        System.out.println("The Distance in miles is "+a*0.621371);
    }
}
