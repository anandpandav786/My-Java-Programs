//program for this keyword

class Test {

    int i;

    Test(int i) {
        this.i = i;
    }

    void show() {
        System.out.println(i);
    }
}

public class Thiskeyword {

    public static void main(String[] args) {
        Test t1 = new Test(10);
        t1.show();
    }

}
