//Program for the Inheritance

class A {

    void add(int x, int y) {
        System.out.println(x + y);
    }
}

class B extends A
{
    void sub(int x, int y)
    {
        System.out.println(x-y);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        B ob = new B();
        ob.add(100, 200);
        ob.sub(200, 100);
    }
}
