import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle amount: ");
        int Principle = sc.nextInt();
        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();
        System.out.print("Enter the Time: ");
        int Time = sc.nextInt();
        int si = (Principle * rate * Time)/100;
        System.out.println(si);
    }
}
