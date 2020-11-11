
import java.util.Scanner;

class Array1D {
  public static void main(String[] args) {
      Scanner ob = new Scanner(System.in);
      int i;
      int[] arr = new int[5];
      System.out.println("Enter the array : ");
      for(i=0;i<5;i++)
      {
          arr[i]= ob.nextInt();
      }
      
      System.out.println("Your array is : ");
      for(int x : arr)
      {
          System.out.println(x);
      }
}
  
}
