//Program for varible called by referrence

class Test {

    int i, j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    void add() {
        System.out.println(i + j);
    }

}

public class RefVariable {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setij(10, 20);
        Test t2;
        t2 = t1;
        t2.setij(30, 40);
        t1.add();
        t2.add();
    }
}
