
interface A {

    void add(int x, int y);
}

interface B {

    void sub(int x, int y);
}

class C implements A, B {

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

}

public class InterfaceInheritance {
    public static void main(String[] args) {
        C ob = new C();
        ob.add(100, 20);
        ob.sub(100, 20);
    }
}
