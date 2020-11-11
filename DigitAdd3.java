
import java.util.*;

public class DigitAdd3 {

    public static void main(String[] args) {
        int a, b, c = 0, x, add;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three digit number : ");
        x = sc.nextInt();
        a = x % 10;
        b=x/10;
        b=b%10;
        c=c/100;
        
        add = a + b + c;
        System.out.println("Addition of this digits is : " + add);
    }

}
