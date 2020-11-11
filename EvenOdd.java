import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter any number :");
        x=sc.nextInt();
        if(x%2==0)
        {
            System.out.println("Even Number ");
        }
        else
        {
            System.out.println("Odd Number ");
        }
    }
}
