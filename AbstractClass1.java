
abstract class A
{
    abstract void add(int x, int y);
    
    void show()
    {
        System.err.println("In A");
    }
}

class B extends A
{

    @Override
    void add(int x, int y) {
        int a=x+y;
        System.out.println("Addition is : "+a);  
        
    }
    
}

public class AbstractClass1 {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
        ob.add(100, 200);
    }
    
}
