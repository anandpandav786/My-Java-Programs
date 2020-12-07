
class A {

    void show() {
        System.out.println("In A");
    }
}

class B extends A {

    void show() {
        System.out.println("In B");
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
    }
}
