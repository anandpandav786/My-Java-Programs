
import java.util.Scanner;

public class Fabonacci {

    public static void main(String[] args) {
        int n, a = 0, b = 1, c, i;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = ob.nextInt();

        i = 2;
        while (i <= n+1) {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            i++;
        }
    }

}
