
interface A {

    void add(int x, int y);

    void sub(int x, int y);

    void mul(int x, int y);

    void div(int x, int y);
}

class B implements A {

    @Override
    public void add(int x, int y) {
        int a = x + y;
        System.out.println("Addition is : " + a);

    }

    @Override
    public void sub(int x, int y) {
        int a = x - y;
        System.out.println("Subtraction is : " + a);
    }

    @Override
    public void mul(int x, int y) {
        int a = x * y;
        System.out.println("Multiplication is : " + a);
    }

    @Override
    public void div(int x, int y) {
        int a = x / y;
        System.out.println("Division is : " + a);
    }

}

public class Interface1 {
    public static void main(String[] args) {
        B ob = new B();
        ob.add(100, 20);
        ob.sub(100, 20);
        ob.mul(100, 20);
        ob.div(100, 20);
    }
}
