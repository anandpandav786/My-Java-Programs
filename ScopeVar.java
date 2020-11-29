class Test
{
    int i;
    Test()
    {
        i++;
    }
    void show()
    {
        System.out.println(i);
    }
}
public class ScopeVar {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.show();
        t2.show();
        t3.show();
    }
}
