class A extends Object
{
    public String toString()
    {
        return "This is object of B class...";
    }
}

class B
{
    public String toString()
    {
        return "This is object of B class...";
    }
}
public class MethodOverriding2 {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        System.out.println(ob1);
        System.out.println(ob2);
    }
}
