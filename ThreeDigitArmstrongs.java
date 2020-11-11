 public class ThreeDigitArmstrongs {

    public static void main(String[] args) {
        int a, b, c = 0, arm;
        int i=100;
        while(i<=999)
        {
        a = i % 10;
        b = i / 10;
        b = b % 10;
        c = i / 100;

        arm = (a * a * a) + (b * b * b) + (c * c * c);

        if (arm == i) {
            System.out.println(arm+" ");
        }
        i++;
        }
    }
}
