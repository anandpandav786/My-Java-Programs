//Program for the Constructor Calling

class Test {

    int i, j;

    Test() {
        i = 10;
        j = 20;
        System.out.println("Constructor Called...");
    }

    void add() {
        System.out.println(i + j);
    }

}

public class TestConstructor1 {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.add();
        Test t2 = new Test();
        t2.add();
    }
}
