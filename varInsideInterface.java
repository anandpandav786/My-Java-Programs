
interface P {

    int A = 10;
    static final int B = 20;
    static int C = 30;
    final int D = 40;

}

public class varInsideInterface {

    public static void main(String[] args) {
        System.out.println(P.A);
        System.out.println(P.B);
        System.out.println(P.C);
        System.out.println(P.D);
    }

}
