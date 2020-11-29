//Program for the Constructor overloading

class Test {

    int i, j;

    Test() {
        i = 10;
        j = 20;
        System.out.println("Constructor without argument is Called...");
    }
    
    Test(int x, int y)
    {
        i=x;
        j=y;
        System.out.println("Constructor with argument is Called...");
    }
            
    void add() {
        System.out.println(i + j);
    }

}

public class TestConOverLoad {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.add();
        Test t2 = new Test(30,40);
        t2.add();
    }
}
