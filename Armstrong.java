
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        int a, b, c = 0, x, arm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three digit number : ");
        x = sc.nextInt();
        a = x % 10;
        b = x / 10;
        b = b % 10;
        c = x / 100;

        arm = (a * a * a) + (b * b * b) + (c * c * c);

        if (arm == x) {
            System.out.println("This is a Armstrong Number...");
        } else {
            System.out.println("This is not a Armstrong Number...");
        }

    }
}
