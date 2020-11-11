//Program to take number from user and print the factorial
import java.util.*;

public class factorial {

    public static void main(String[] args) {
        int i , num, fac = 1;
        Scanner ob = new Scanner(System.in);
        num = ob.nextInt();
        i=1;
        while (i <= num) {
            fac = fac * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is : " + fac);
    }
}
