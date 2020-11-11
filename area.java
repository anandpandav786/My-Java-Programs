import java.util.*;

public class area 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float r,a;
        System.out.println("Enter the radius : ");
        r = sc.nextFloat();
        a=3.14f*r*r;
        System.out.println("Area of circle is : "+a);
    }
}
