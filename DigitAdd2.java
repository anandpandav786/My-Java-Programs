import java.util.*;

public class DigitAdd2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two digit number : ");
        a=sc.nextInt();
        b=a/10;
        a=a%10;
        c=a+b;
        System.out.println("Adiition is : "+c);
    }
    
}
