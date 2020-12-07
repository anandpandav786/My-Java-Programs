
class A {

    void read() {
        System.out.println("Read from HDD");
    }
}

class B extends A {
    @Override
    void read() {
        System.out.println("Read from USB");
    }
}

class C extends B {
    @Override
    void read() {
        System.out.println("Read from DVD");
    }
}

public class RunTimePolyMorphism {

    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();
        show(ob1);
        show(ob2);
        show(ob3);
    }

    static void show(A r) {
        r.read();
    }
}
