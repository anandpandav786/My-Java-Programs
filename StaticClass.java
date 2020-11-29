//Program for the Static variable

class Test
{
    int i;
    static int j;
    Test()
    {
        i++;
        j++;
    }
    void show()
    {
        System.out.println(i);
        System.out.println(j);
    }
}
public class StaticClass {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.show();
        t2.show();
        t3.show();
    }
}
