//Program for the Static variable

class Test {

    int i;
    static int j;

    Test() {
        i++;
        j++;
    }

    void show() {
        System.out.println(i);
        System.out.println(j);
    }
}

public class StaticClass1 {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        Test t2 = new Test();
        t2.show();
        Test t3 = new Test();
        t3.show();
    }
}
