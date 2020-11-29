//Program for the Static block

class Test
        {
    static int j;
    Test()
    {
        System.out.println("Constructor Called...");
        j++;
    }
    static void show()
    {
        System.out.println(j);
    }
    static
    {
        System.out.println("Static Block Called...");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test.show();
    }
}
