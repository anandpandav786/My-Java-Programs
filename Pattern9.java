
public class Pattern9 {

    public static void main(String[] args) {
        int i, j, g = 3;
        for (i = 0; i < 4; i++) {
            int k = 0;
            while (k < g) {
                System.out.print(" ");
                k++;
            }
            g--;
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
