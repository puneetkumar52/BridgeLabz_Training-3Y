import java.util.Scanner;

public class Volume_of_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle: ");
        int radius = sc.nextInt();
        System.out.println("Enter the Height of the Circle: ");
        int height = sc.nextInt();
        double Area = Math.PI * Math.pow(radius, 2)*height;
        System.out.println(Area);
    }
}
