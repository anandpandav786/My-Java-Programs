
import java.util.Scanner;

class Array2D {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i, j;
        int[][] arr = new int[3][3];
        System.out.println("Enter the array : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = ob.nextInt();
            }
        }

        System.out.println("Your array is : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
