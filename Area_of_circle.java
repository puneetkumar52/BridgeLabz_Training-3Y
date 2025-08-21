import java.util.*;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle: ");
        int radius = sc.nextInt();
        double Area = Math.PI * Math.pow(radius, 2);
        System.out.println(Area);
    }
}