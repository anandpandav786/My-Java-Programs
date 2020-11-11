import java.util.*;
public class ifelsep1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter any number : ");
        a= sc.nextInt();
        if(a>0)
        {
            System.out.println("Positive Number ");
        }
        else if(a<0)
        {
            System.out.println("Negative Number ");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
