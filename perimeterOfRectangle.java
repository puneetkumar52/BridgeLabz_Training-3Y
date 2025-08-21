import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length ");
        int l=sc.nextInt();
        System.out.print("enter the width ");
        int w=sc.nextInt();
        System.out.println(2*(l+w));
    }
}
